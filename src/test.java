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

public class test
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
        
        txt.putString(45, 20, "Press Enter to Continue");
        screen.refresh();
        
        
        //Define position and size of answer prompt box 
        final TerminalPosition boxpos = new TerminalPosition(1,20);
        final TerminalSize termsize = new TerminalSize(70,3);
        
        KeyStroke keyStroke;
        
        while(true) 
        	{
		            KeyStroke listenForExit = screen.readInput();
		            if(listenForExit != null && (listenForExit.getKeyType() == KeyType.Escape || listenForExit.getKeyType() == KeyType.EOF)) 
		            {
		                break;
		            }
		            	//Section 1
		            	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		            
		                //Print first AI line
		    	        txt.putString(1,1, lines.AIline1);
		    	        
		    	        //Draw answer prompt box
		    	        txt.drawRectangle(boxpos, termsize, '-');
		    	        txt.putString(3,21, "F1 - " + lines.playerline1);
		    	        screen.refresh();
		    	        
		    	        //Wait for input before continuing
		    	        keyStroke = terminal.readInput();
		    	        
		    	        //If F1 is pressed
		    	        if(keyStroke.getKeyType() == KeyType.F1)
		    	        {
		    	        	//Draw player lines for F1
		    	        	txt.putString(1,2,lines.playerline1);
		    	        	screen.refresh();
		    	        }
		    	        
		    	        keyStroke = null;
		    	        txt.putString(45, 20, "Press Enter to Continue");
		    	        screen.refresh();
		    	        Thread.sleep(2000);
		    	        
		    	        //Section 2
		    	        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		    	        
		    	        //Draw AI new line
			        	txt.putString(1,3, lines.AIline2);
			        	
			        	//Draw player line option in answer box
		    	        txt.drawRectangle(boxpos, termsize, '-');
			        	txt.putString(3,21, "F1 - " + lines.playerline2p1 + "     ");
			        	screen.refresh();
			        	
			        	//Wait for input before continuing
		    	        keyStroke = terminal.readInput();
			        	
			        	//If F1 is pressed
			        	if(keyStroke.getKeyType() == KeyType.F1)
				        {
				        	
				        	txt.putString(1,4,lines.playerline2p1);
				        	screen.refresh();
				        	Thread.sleep(1000);
				        	txt.putString(1,5,lines.playerline2p2);
				        	screen.refresh();
				        }
			        	keyStroke = null;
		    	        txt.putString(45, 20, "Press Enter to Continue");
		    	        screen.refresh();
		    	        
		    	        //Section 3
		    	        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		    	        screen.doResizeIfNecessary();
		    	        
		    	        //Draw next AI line
		    	        txt.putString(1,5, lines.AIline3p1);
		    	        screen.refresh();
		    	        
		    	        Thread.sleep(1000);
		    	        
		    	        txt.putString(1,6, lines.AIline3p2);
		    	        screen.refresh();
		    	        
		    	        //Draw player line option in answer box
		    	        txt.drawRectangle(boxpos, termsize, '-');
			        	txt.putString(3,21, "F1 - " + "Ship?" + "     ");
			        	screen.refresh();
			        	
			        	//Wait for input before continuing
		    	        keyStroke = terminal.readInput();
			        	
			        	if(keyStroke.getKeyType() == KeyType.F1)
				        {
				        	
				        	txt.putString(1,7,lines.playerline3);
				        	screen.refresh();

				        }
			        	
			        	//Section 4
			        	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			        	screen.doResizeIfNecessary();
			        	
			        	//Draw next AI line
			        	txt.putString(1,8, lines.AIline4p1);
			        	screen.refresh();
			        	
			        	Thread.sleep(2000);
			        	
			        	txt.putString(1,9, lines.AIline4p2);
			        	screen.refresh();
			        	
			        	txt.putString(5,10, lines.AIline4p3);
			        	screen.refresh();
			        	
			        	Thread.sleep(2000);
			        	
			        	txt.putString(5,11, lines.AIline4p4);
			        	
			        	//Draw answer box
			        	//Draw player line option in answer box
		    	        txt.drawRectangle(boxpos, termsize, '-');
			        	txt.putString(3,21, "F1 - " + "Captain?" + "     ");
			        	screen.refresh();
			        	
			        	//Wait for input before continuing
		    	        keyStroke = terminal.readInput();
			        	
			        	if(keyStroke.getKeyType() == KeyType.F1)
				        {
				        	
				        	txt.putString(1,12,lines.playerline4);
				        	screen.refresh();

				        }
			        	
			        	//Section 5
			        	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			        	
			        	
			        	
			        	
			        	
			        	
			        	
			        	
			        	
			        	
			        	
			        	
			     
	           }
        	   Thread.yield();
        	   screen.close();
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
