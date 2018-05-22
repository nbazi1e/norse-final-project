//Authors: Narmer Bazile & Suhaas N.



import com.googlecode.lanterna.SGR;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;


public class masterapp
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		//initialize and create terminal window
		DefaultTerminalFactory defaultTerminalFactory = new DefaultTerminalFactory();
		Terminal terminal = null;
		
		try 
		{
		
		//start terminal window
		terminal = new DefaultTerminalFactory().createTerminal();

		Thread.sleep(5000);
		
		//Print Hello World
		terminal.putCharacter('H');
        terminal.putCharacter('e');
        terminal.putCharacter('l');
        terminal.putCharacter('l');
        terminal.putCharacter('o');
        terminal.putCharacter('\n');
        terminal.putCharacter('W');
        terminal.putCharacter('o');
        terminal.putCharacter('r');
        terminal.putCharacter('l');
        terminal.putCharacter('d');
        
        //Flush changes to terminal
        terminal.flush();
        
        Thread.sleep(5000);
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
