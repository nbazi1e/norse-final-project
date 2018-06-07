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
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.*;
import com.googlecode.lanterna.gui2.dialogs.MessageDialog;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogButton;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.Random;
import java.io.IOException;

public class test
{

	public static void main(String[] args) throws InterruptedException 
	{
		//initialize and create terminal window
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
        int sect5choice = 0;
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
			        	keyStroke = null;
		    	        txt.putString(45, 20, "Working...");
		    	        screen.refresh();

			        	
			        	//Section 5
			        	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			        	screen.doResizeIfNecessary();
			        	
			        	//Draw next AI lines
			        	txt.putString(1,13, lines.AIline5);
			        	Thread.sleep(1000);
			        	screen.refresh();
			        	
			        	//Draw answer box
			        	txt.drawRectangle(boxpos, termsize, '-');
			        	
			        	//Draw lines in answer box
			        	txt.putString(3,21, "F1 - " + lines.playerline5v1 + "     ");
			        	txt.putString(15,21, "F2 - " + "YOU MONSTER!");
			        	screen.refresh();
			        	
			        	keyStroke = terminal.readInput();
			        	
			        	//Wait for input before continuing
			        	if(keyStroke.getKeyType() == KeyType.F1)
				        {
				        	
				        	txt.putString(1,14,lines.playerline5v1);
				        	screen.refresh();

				        }
			        	else if(keyStroke.getKeyType() == KeyType.F2)
				        {
				        	
				        	txt.putString(1,14,lines.playerline5v2);
				        	sect5choice = 1;
				        	screen.refresh();

				        }
			        	keyStroke = null;
		    	        txt.putString(45, 20, "Working...");
		    	        screen.refresh();

		    	        //Section 6
			        	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			        	screen.doResizeIfNecessary();
			        	
		    	        //Set intimidating color for AI lines
			        	txt.setForegroundColor(TextColor.ANSI.WHITE);
			        	txt.setBackgroundColor(TextColor.ANSI.RED);
			        	
			        	//Death scene
			        	if(sect5choice == 1) 
			        	{
			        		//print death message
			        		txt.putString(1,15, lines.AIline6v2,SGR.BLINK);
			        		screen.refresh();
			        		
			        		for(int i = 0; i < 3; i++)
			        			terminal.bell();
			        		
			        		Thread.sleep(3000);
			        		
			        		//Use random to draw random colors on terminal
			        		Random random = new Random();
			        		
			        		//Get size of terminal
			                TerminalSize terminalSize = screen.getTerminalSize();
			                
			                //loop through all terminal row cells
			                for(int row = 0; row < terminalSize.getRows(); row++) 
			                {
			                	//loop through all terminal columns cells
			                    for(int column = 0; column < terminalSize.getColumns(); column++) 
			                    {
			                    	//set cell to random color
			                        screen.setCharacter(column, row, new TextCharacter(
			                                ' ',
			                                TextColor.ANSI.DEFAULT,
			                                // This will pick a random background color
			                                TextColor.ANSI.values()[random.nextInt(TextColor.ANSI.values().length)]));
			                        
			                        //wait 1 millisecond
			                        Thread.sleep(1);
			                        
			                        //update video buffer
			                        screen.refresh();
			                        
			                        //same as above
			                        screen.setCharacter(row, column, new TextCharacter(
			                                ' ',
			                                TextColor.ANSI.DEFAULT,
			                                // This will pick a random background color
			                                TextColor.ANSI.values()[random.nextInt(TextColor.ANSI.values().length)]));
			                        screen.refresh();
			                        Thread.sleep(1);
			                        
			                    }
			                }
			                
			                screen.refresh();
			        	}
			        	
			        	//You made the right choice and lived
			        	txt.putString(1, 15, lines.AIline6v1);  
			        	screen.refresh();
			        	Thread.sleep(5000);
			        	
			        	//First minigame
			        	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			        			        	
			        	screen.clear();
			        	
			        	txt.setForegroundColor(TextColor.ANSI.WHITE);
			        	txt.setBackgroundColor(TextColor.ANSI.BLACK);
			        	
			        	
			        	final TerminalPosition hackbox1pos = new TerminalPosition(1, 5);
			        	final TerminalPosition hackbox2pos = new TerminalPosition(26, 5);
			        	final TerminalPosition hackbox3pos = new TerminalPosition(51, 5);
			        	final TerminalPosition hackbox4pos = new TerminalPosition(76, 5);
			        	
			            final TerminalSize hackboxsize = new TerminalSize(20,10);
			            
			           txt.fillRectangle(hackbox1pos, hackboxsize, new TextCharacter(' ', TextColor.ANSI.DEFAULT, TextColor.ANSI.GREEN));
			           txt.fillRectangle(hackbox2pos, hackboxsize, new TextCharacter(' ', TextColor.ANSI.DEFAULT, TextColor.ANSI.RED));
			           txt.fillRectangle(hackbox3pos, hackboxsize, new TextCharacter(' ', TextColor.ANSI.DEFAULT, TextColor.ANSI.MAGENTA));
			           txt.fillRectangle(hackbox4pos, hackboxsize, new TextCharacter(' ', TextColor.ANSI.DEFAULT, TextColor.ANSI.YELLOW));
			
			           screen.refresh();
			           
			          
			          String box1color = "Green";
			          String box2color = "Red";
			          String box3color = "Magenta";
			          String box4color = "Yellow";
			          
			          boolean puzzleIsSolved = false;
			          
			          while(puzzleIsSolved == false)
			          {
				          keyStroke = screen.readInput();
				          
			        	  if(keyStroke.getKeyType() == KeyType.F1)
			        	  {
			        		  switch(box1color)
			        		  {
			        		  	case "Green":
			        		  		txt.fillRectangle(hackbox1pos, hackboxsize, new TextCharacter(' ', TextColor.ANSI.DEFAULT, TextColor.ANSI.YELLOW));
			        		  		box1color = "Yellow";
			        		  		screen.refresh();
			        		  		break;
			        		  		
			        		  	case "Yellow":
			        		  		txt.fillRectangle(hackbox1pos, hackboxsize, new TextCharacter(' ', TextColor.ANSI.DEFAULT, TextColor.ANSI.RED));
			        		  		box1color = "Red";
			        		  		screen.refresh();
			        		  		break;
			        		  		
			        		  	case "Red":
			        		  		txt.fillRectangle(hackbox1pos, hackboxsize, new TextCharacter(' ', TextColor.ANSI.DEFAULT, TextColor.ANSI.BLUE));
			        		  		box1color = "Blue";
			        		  		screen.refresh();
			        		  		break;
			        		  		
			        		  	case "Blue":
			        		  		screen.refresh();
			        		  		break;
			        		  		
			        		  		
			        		  		
			        		  		
			        		  }
			        	  }
			        	
			        	
						   else if(keyStroke.getKeyType() == KeyType.F2)
						   {
							   switch(box2color)
				        		  {
				        		  	case "Red":
				        		  		txt.fillRectangle(hackbox2pos, hackboxsize, new TextCharacter(' ', TextColor.ANSI.DEFAULT, TextColor.ANSI.GREEN));
				        		  		box2color = "Green";
				        		  		screen.refresh();
				        		  		break;
				        		  		
				        		  	case "Green":
				        		  		txt.fillRectangle(hackbox2pos, hackboxsize, new TextCharacter(' ', TextColor.ANSI.DEFAULT, TextColor.ANSI.MAGENTA));
				        		  		box2color = "Magenta";
				        		  		screen.refresh();
				        		  		break;
				        		  		
				        		  	case "Magenta":
				        		  		txt.fillRectangle(hackbox2pos, hackboxsize, new TextCharacter(' ', TextColor.ANSI.DEFAULT, TextColor.ANSI.BLUE));
				        		  		box2color = "Blue";
				        		  		screen.refresh();
				        		  		break;
				        		  	
				        		  	case "Blue":
				        		  		screen.refresh();
				        		  		break;
				        		  		
				        		  }
						   }
						   else if(keyStroke.getKeyType() == KeyType.F3)
						   {
							   switch(box3color)
				        		  {
				        		  	case "Magenta":
				        		  		txt.fillRectangle(hackbox3pos, hackboxsize, new TextCharacter(' ', TextColor.ANSI.DEFAULT, TextColor.ANSI.RED));
				        		  		box3color = "Red";
				        		  		screen.refresh();
				        		  		break;
				        		  		
				        		  		
				        		  	case "Red":
				        		  		txt.fillRectangle(hackbox3pos, hackboxsize, new TextCharacter(' ', TextColor.ANSI.DEFAULT, TextColor.ANSI.YELLOW));
				        		  		box3color = "Yellow";
				        		  		screen.refresh();
				        		  		break;
				        		  		
				        		  	case "Yellow":
				        		  		txt.fillRectangle(hackbox3pos, hackboxsize, new TextCharacter(' ', TextColor.ANSI.DEFAULT, TextColor.ANSI.BLUE));
				        		  		box3color = "Blue";
				        		  		screen.refresh();
				        		  		break;
				        		  	
				        		  	case "Blue":
				        		  		screen.refresh();
				        		  		break;
				        		  }
						   }
			        	  
						   else if(keyStroke.getKeyType() == KeyType.F4)
						   {
							   switch(box4color)
				        		  {
				        		  	case "Yellow":
				        		  		txt.fillRectangle(hackbox4pos, hackboxsize, new TextCharacter(' ', TextColor.ANSI.DEFAULT, TextColor.ANSI.CYAN));
				        		  		box4color = "Cyan";
				        		  		screen.refresh();
				        		  		break;
				        		  		
				        		  	case "Cyan":
				        		  		txt.fillRectangle(hackbox4pos, hackboxsize, new TextCharacter(' ', TextColor.ANSI.DEFAULT, TextColor.ANSI.WHITE));
				        		  		box4color = "White";
				        		  		screen.refresh();
				        		  		break;
				        		  		
				        		  	case "White":
				        		  		txt.fillRectangle(hackbox4pos, hackboxsize, new TextCharacter(' ', TextColor.ANSI.DEFAULT, TextColor.ANSI.BLUE));
				        		  		box4color = "Blue";
				        		  		screen.refresh();
				        		  		break;
				        		  	
				        		  	case "Blue":
				        		  		screen.refresh();
				        		  		break;
				        		  }
						   }
			        	  
			        	  screen.refresh();
			        	  if(box1color == "Blue" && box2color == "Blue" && box3color == "Blue" && box4color == "Blue")
			        	  {
			        		  break;
			        	  }

			        		  
			          }
			          
			          //Section 7
			          //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			        	
			        	
			        	
			        	
			        	
			        	
			        	
			        	
			        	
			        	
			        	
			        	
			        	
			        	
			        	
			        	
			        	break;
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
