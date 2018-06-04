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
        KeyStroke keyStroke = terminal.readInput();
        
        while (keyStroke.getKeyType() != KeyType.Escape)
        {
	        
	        txt.putString(1,1,lines.AIline1);
	        
	        //Draw answer prompt box
	        txt.drawRectangle(boxpos, termsize, '-');
	        txt.putString(3,21, "F1 - " + lines.playerline1);
	        screen.refresh();
	
	        
	        
	        keyStroke = terminal.readInput();
	        
	        if(keyStroke.getKeyType() == KeyType.F1)
	        {
	        	txt.putString(1,2, lines.playerline2p1);
	        	screen.refresh();
	        	txt.putString(1,3, lines.playerline2p2);
	        	Thread.sleep(500);
	        	screen.refresh();
	        	
	        }	
	        keyStroke = terminal.readInput();
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
