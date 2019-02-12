package headles;

import java.awt.Desktop;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.interactions.Actions;

public class robotclass 
{
	public static void main(String []args) throws Exception
	{
		Thread.sleep(2000);
		String command = "E://eclipse-jee-mars-2-win32-x86_64//eclipse//eclipse.exe"; 
	    Runtime run = Runtime.getRuntime(); 
        run.exec(command); 
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) 
        { 
            // TODO Auto-generated catch block 
            e.printStackTrace(); 
        } 
		
		Robot robot = new Robot();
		Thread.sleep(2000);
		
		StringSelection stringselection = new StringSelection("C://Joydip1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(5000);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(5000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	
		
		
		/*robot.mouseMove(630, 420);
		
		
		
		
		Thread.sleep(5000);
		int x = 10;
		int y = 10;
		int width = 500;
		int height = 200;
		Rectangle area = new Rectangle(x, y, width, height);
		//Rectangle area = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())
		BufferedImage bufferedImage = robot.createScreenCapture(area);
		File imageFile = new File("C://Users//joydip.bhattacharjee//Desktop//Test//test.png");
		ImageIO.write(bufferedImage, "png", imageFile);		*/				
	}
}
