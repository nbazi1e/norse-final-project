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


import java.io.IOException;

public class masterapp
{

	public static void main(String[] args) throws InterruptedException 
	{
		//initialize and create terminal window
		DefaultTerminalFactory defaultTerminalFactory = new DefaultTerminalFactory();
		Terminal terminal = null;

		
		try 
		{
		
		//start terminal window
		terminal = new DefaultTerminalFactory().createTerminal();
		
		final TextGraphics loadMessage = terminal.newTextGraphics();
		loadMessage.putString(1,1, "Loading ...", SGR.BOLD);
		terminal.flush();
		Thread.sleep(5000);

		
		terminal.flush();
		
		
		
		
		
		
		
		
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
