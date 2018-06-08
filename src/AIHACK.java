//Authors: Narmer Bazile & Suhaas N.
//v1.0

import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.*;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import java.io.IOException;

import java.util.Random;


public class AIHACK
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
        
        //Print loading screen for 5 seconds
        txt.putString(1,1, "Loading...");
        screen.refresh();
        Thread.sleep(5000);
        
        //indicate to press enter to continue
        txt.putString(45, 20, "Press Enter to Continue");
        screen.refresh();
        
        
        //Define position and size of answer prompt box 
        final TerminalPosition boxpos = new TerminalPosition(1,20);
        final TerminalSize termsize = new TerminalSize(70,3);
        
        //declare keyStroke variable to read 
        KeyStroke keyStroke;
        
        //track user choice(used in later section)
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
		            	screen.doResizeIfNecessary(); ////adjust for screen resize
		            
		                //Print first AI line
		    	        txt.putString(1,1, lines.AIline1);
		    	        
		    	        //Draw answer prompt box
		    	        txt.drawRectangle(boxpos, termsize, '-');
		    	        txt.putString(3,21, "F1 - " + "What?");
		    	        screen.refresh(); //update changes to the screen
		    	        
		    	        //Wait for input before continuing
		    	        keyStroke = terminal.readInput();
		    	        
		    	        //If F1 is pressed
		    	        if(keyStroke.getKeyType() == KeyType.F1)
		    	        {
		    	        	//Draw player lines for F1
		    	        	txt.putString(1,2,lines.playerline1);
		    	        	screen.refresh();
		    	        }
		    	        
		    	        //Reset keyStroke variable and display working message
		    	        keyStroke = null;
		    	        txt.putString(45, 20, "Working");
		    	        screen.refresh();
		    	        
		    	        //pause for 2 seconds
		    	        Thread.sleep(2000);
		    	        
		    	        //Section 2
		    	        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		    	        screen.doResizeIfNecessary(); //adjust for screen resize
		    	        
		    	        //Draw AI new line
			        	txt.putString(1,3, lines.AIline2);
			        	
			        	//Draw player line option in answer box
		    	        txt.drawRectangle(boxpos, termsize, '-');
			        	txt.putString(3,21, "F1 - " + "..." + "     ");
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
			        	
			        	//Reset keyStroke variable and display working message
			        	keyStroke = null;
		    	        txt.putString(45, 20, "Working");
		    	        screen.refresh();
		    	        
		    	        //Pause for 2 seconds
		    	        Thread.sleep(2000);

		    	        
		    	        //Section 3
		    	        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		    	        screen.doResizeIfNecessary();
		    	        
		    	        //Draw next AI line
		    	        txt.putString(1,6, lines.AIline3p1);
		    	        screen.refresh();
		    	        
		    	        //Pause for 1 second
		    	        Thread.sleep(1000);
		    	        
		    	        //Draw second AI line
		    	        txt.putString(1,7, lines.AIline3p2);
		    	        screen.refresh();
		    	        
		    	        //Draw player line option in answer box
		    	        txt.drawRectangle(boxpos, termsize, '-');
			        	txt.putString(3,21, "F1 - " + "Ship?" + "     ");
			        	screen.refresh();
			        	
			        	//Wait for input before continuing
		    	        keyStroke = terminal.readInput();
			        	
			        	if(keyStroke.getKeyType() == KeyType.F1)
				        {
				        	
				        	txt.putString(1,8,lines.playerline3);
				        	screen.refresh();

				        }
			        	
			        	//Reset keyStroke variable and display working message
			        	keyStroke = null;
		    	        txt.putString(45, 20, "Working");
		    	        screen.refresh();
		    	        
		    	        //Pause for 2 seconds
		    	        Thread.sleep(2000);

			        	
			        	//Section 4
			        	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			        	screen.doResizeIfNecessary();
			        	
			        	//Draw next AI line
			        	txt.putString(1,9, lines.AIline4p1);
			        	screen.refresh();
			        	
			        	//Pause for 2 seconds
			        	Thread.sleep(2000);
			        	
			        	//Draw 2nd AI line
			        	txt.putString(1,10, lines.AIline4p2);
			        	screen.refresh();
			        	
			        	//Draw 3rd AI line
			        	txt.putString(5,11, lines.AIline4p3);
			        	screen.refresh();
			        	
			        	//Pause for 2 seconds
			        	Thread.sleep(2000);
			        	
			        	//Draw 
			        	txt.putString(5,12, lines.AIline4p4);
			        	
			        	//Draw answer box
		    	        txt.drawRectangle(boxpos, termsize, '-');
		    	        
		    	        //Draw player line option in answer box
			        	txt.putString(3,21, "F1 - " + "Captain?" + "     ");
			        	
			        	screen.refresh();
			        	
			        	//Wait for input before continuing
		    	        keyStroke = terminal.readInput();
			        	
			        	if(keyStroke.getKeyType() == KeyType.F1)
				        {
				        	
				        	txt.putString(1,13,lines.playerline4);
				        	screen.refresh();

				        }
			        	
			        	//Reset keyStroke variable and display working message
			        	keyStroke = null;
		    	        txt.putString(45, 20, "Working");
		    	        screen.refresh();
		    	        
		    	        //Pause for 2 seconds
		    	        Thread.sleep(2000);
			        	
			        	//Section 5
			        	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			        	screen.doResizeIfNecessary();
			        	
			        	//Draw next AI lines
			        	txt.putString(1,14, lines.AIline5);
			        	Thread.sleep(1000);
			        	screen.refresh();
			        	
			        	//Draw answer box
			        	txt.drawRectangle(boxpos, termsize, '-');
			        	
			        	//Draw lines in answer box
			        	txt.putString(3,21, "F1 - " + "..." + "     ");
			        	txt.putString(15,21, "F2 - " + "YOU MONSTER!");
			        	screen.refresh();
			        	
			        	//Wait for input before continuing
			        	keyStroke = terminal.readInput();
			        	
			        	if(keyStroke.getKeyType() == KeyType.F1)
				        {
				        	
				        	txt.putString(1,15,lines.playerline5v1);
				        	screen.refresh();

				        }
			        	else if(keyStroke.getKeyType() == KeyType.F2)
				        {
				        	
				        	txt.putString(1,15,lines.playerline5v2);
				        	sect5choice = 1;
				        	screen.refresh();

				        }
			        	//Reset keyStroke variable and display working message
			        	keyStroke = null;
		    	        txt.putString(45, 20, "Working");
		    	        screen.refresh();
		    	        
		    	        //Pause for 2 seconds
		    	        Thread.sleep(2000);


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
			        		txt.putString(1,16, lines.AIline6v2,SGR.BLINK);
			        		screen.refresh();
			        		
			        		//trigger terminal bell sound
			        		terminal.bell();
			        		
			        		//Let user quake in fear for 3 three seconds
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
			        	//Ultimatum is delivered
			        	txt.putString(1, 16, lines.AIline6v1, SGR.BLINK);  
			        	screen.refresh();
			        	
			            Thread.sleep(5000); //5 sec pause
			        	
			           //First minigame; object is to make all squares blue
			           ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			        			        	
			           screen.clear(); //clear the terminal screen
			        
			           //define the position of all 4 puzzle boxes
			           final TerminalPosition hackbox1pos = new TerminalPosition(1, 5);
			           final TerminalPosition hackbox2pos = new TerminalPosition(26, 5);
			           final TerminalPosition hackbox3pos = new TerminalPosition(51, 5);
			           final TerminalPosition hackbox4pos = new TerminalPosition(76, 5);
			        	
			          //define the dimension of each box
			          final TerminalSize hackboxsize = new TerminalSize(20,10);
			            
			          //draw each box with an arbitrary color
			          txt.fillRectangle(hackbox1pos, hackboxsize, new TextCharacter(' ', TextColor.ANSI.DEFAULT, TextColor.ANSI.GREEN));
			          txt.fillRectangle(hackbox2pos, hackboxsize, new TextCharacter(' ', TextColor.ANSI.DEFAULT, TextColor.ANSI.RED));
			          txt.fillRectangle(hackbox3pos, hackboxsize, new TextCharacter(' ', TextColor.ANSI.DEFAULT, TextColor.ANSI.MAGENTA));
			          txt.fillRectangle(hackbox4pos, hackboxsize, new TextCharacter(' ', TextColor.ANSI.DEFAULT, TextColor.ANSI.YELLOW));
			            
			          //Print function button indicators
			          txt.setBackgroundColor(TextColor.ANSI.BLACK);
			          txt.setForegroundColor(TextColor.ANSI.YELLOW);
			          
			          txt.putString(10,20, "F1");
			          txt.putString(35, 20, "F2");
			          txt.putString(60, 20, "F3");
			          txt.putString(85, 20, "F4");
			          
			          screen.refresh();
			           
			          //Store color states of each box
			          String box1color = "Green";
			          String box2color = "Red";
			          String box3color = "Magenta";
			          String box4color = "Yellow";
			          
			          
			          while(true)
			          {
			        	  //read keypress from keyboard during each iteration
				          keyStroke = screen.readInput();
				          
			        	  if(keyStroke.getKeyType() == KeyType.F1) //if F1 is pressed...
			        	  {
			        		  switch(box1color) //... manipulate box 1
			        		  {
			        		  	//Green > Yellow > Red > Blue
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
			        	
			        	
						   else if(keyStroke.getKeyType() == KeyType.F2) //If F2 is pressed...
						   {
							   switch(box2color) //... manipulatee box 2
				        		  {
							   		//Red > Green > Magenta > Blue
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
						   else if(keyStroke.getKeyType() == KeyType.F3) //If F3 is pressed...
						   {
							   switch(box3color) //manipulate box 3
				        		  {
							   		//Magenta > Red > Yellow > Blue
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
			        	  
						   else if(keyStroke.getKeyType() == KeyType.F4) //If F4 is pressed...
						   {
							   switch(box4color) //manipulate box 4
				        		  {
							   		//Yellow > Cyan > White > Blue
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
			        	  
			        	  //Exit loop when all boxes are blue
			        	  if(box1color == "Blue" && box2color == "Blue" && box3color == "Blue" && box4color == "Blue")
			        	  {
			        		  terminal.bell();
			        		  break;
			        		  
			        	  }

			        		  
			          }
			          
			          
			          
			          //Section 7
			          //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			          screen.doResizeIfNecessary();
			          screen.clear();
			          
			          txt.setBackgroundColor(TextColor.ANSI.BLACK);
			          txt.setForegroundColor(TextColor.ANSI.GREEN);
			          
			          //Print player sucess line
			          txt.putString(1,1, lines.playerline7);
			          screen.refresh();
			          Thread.sleep(2000);
			          
			          //Print AI death line
			          txt.putString(1,2, lines.AIline8);
			          screen.refresh();
			          Thread.sleep(2000);
			          
			          //Print player escape message
			          txt.putString(1, 3, lines.playerline8);
			          screen.refresh();
			          Thread.sleep(5000);
			          
			          //Print Game over message
			          screen.clear();
			          txt.putString(5,5, "GAME OVER",SGR.BLINK);
			          screen.refresh();
			          
			          //Wait 5 seconds
			          Thread.sleep(5000);
			          
			          break;
	           }
        	   //Shutdown terminal window
        	   screen.close();
        }
		//All lines below are Exception logic; aka what to do if there is an error during runtime
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
