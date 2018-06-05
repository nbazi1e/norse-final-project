//Authors: Narmer Bazile & Suhaas N.

import com.googlecode.lanterna.SGR;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.TerminalResizeListener;
import com.googlecode.lanterna.*;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;
import java.util.Random;


import java.io.IOException;

public class masterapp
{

	public static void main(String[] args) throws InterruptedException 
	{
		//initialize and create terminal window
		DefaultTerminalFactory defaultTerminalFactory = new DefaultTerminalFactory();
		Terminal terminal = null;
		Screen screen = null;
		

		
		try 
		{
		
		//start terminal window
		terminal = new DefaultTerminalFactory().createTerminal();
		screen = new TerminalScreen(terminal);
		screen.startScreen();
		screen.setCursorPosition(null);
		
		//create textGraphics object to manipulate textual graphics
		final TextGraphics txt = screen.newTextGraphics();
		
		//set text color to green on black
		txt.setForegroundColor(TextColor.ANSI.GREEN);
        txt.setBackgroundColor(TextColor.ANSI.BLACK);
        
        //Print loading screen for 5 secs
        txt.putString(1,1, "Loading...");
        screen.refresh();
        Thread.sleep(5000);
        
        
        //Clear terminal
        screen.clear();
        screen.refresh();
        
        //Define position and size of answer prompt box 
        final TerminalPosition boxpos = new TerminalPosition(1,20);
        final TerminalSize termsize = new TerminalSize(70,3);
        
        
        //Section 1
        KeyStroke keyStroke = new KeyStroke(KeyType.Delete);
        
        //While loop to pause execution until next button is pressed
        while (keyStroke.getKeyType() != KeyType.Enter)
        {
	        //Print first AI line
	        txt.putString(1,1, lines.AIline1);
	        
	        //Draw answer prompt box
	        txt.drawRectangle(boxpos, termsize, '-');
	        txt.putString(3,21, "F1 - " + lines.playerline1);
	        screen.refresh();
	        
	        //Wait for input to continue
	        keyStroke = terminal.readInput();
	        
	        //If F1 is presses
	        if(keyStroke.getKeyType() == KeyType.F1)
	        {
	        	//Draw player lines for F1
	        	txt.putString(1,2,lines.playerline1);
	        	screen.refresh();
	        	
	        }	
	        keyStroke = terminal.readInput();
        }  
        
	    //Section 2
        KeyStroke keyStroke2 = new KeyStroke(KeyType.Delete);
	    while (keyStroke2.getKeyType() != KeyType.Enter)
	        {
	    	    //Clear screen and redraw previous lines and answer box
	        	screen.clear();
	        	txt.drawRectangle(boxpos, termsize, '-');
	        	txt.putString(1,1, lines.AIline1);
	        	txt.putString(1,2,lines.playerline1);
	        	
	        	//Draw AI new line
	        	txt.putString(1,3, lines.AIline2);
	        	
	        	//Draw player line option in answer box
	        	txt.putString(3,21, "F1 - " + lines.playerline2p1);
	        	
	        	screen.refresh();
	        	
	        	//If F1 is pressed
	        	if(keyStroke2.getKeyType() == KeyType.F1)
		        {
		        	
		        	txt.putString(1,4,lines.playerline2p1);
		        	screen.refresh();
		        	Thread.sleep(1000);
		        	txt.putString(1,5,lines.playerline2p2);
		        	screen.refresh();
		        }	
	        	//"Listen" for Enter key press to continue
	        	keyStroke2 = terminal.readInput();
	        }
	        
        
		}
		catch(IOException e) 
		{
			
			e.printStackTrace();
		}
		
		finally 
		{
            if(terminal != null) 
            {
                try 
                {
                    terminal.close();
                }
                catch(IOException e) 
                {
                    e.printStackTrace();
                }
		
            }

		}
	}
	
}
