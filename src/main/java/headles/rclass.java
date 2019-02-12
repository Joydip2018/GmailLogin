package headles;

import java.awt.Desktop;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.interactions.Actions;

public class rclass 
{
	public static void main(String []args) throws Exception
	{
		Thread.sleep(2000);
		String command = "C://Program Files (x86)//Microsoft Office//Office12//WINWORD.exe"; 
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
		// Press keys using robot. A gap of of 500 mili seconds is added after every key press
		
		robot.keyPress(KeyEvent.VK_J);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_O);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_Y);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_D);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_I);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_P);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_B);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_H);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_T);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_T);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_C);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_H);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_R);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_J);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_S);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		int x = 10;
		int y = 10;
		int width = 500;
		int height = 200;
		Rectangle area = new Rectangle(x, y, width, height);
		//Rectangle area = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())
		BufferedImage bufferedImage = robot.createScreenCapture(area);
		File imageFile = new File("C://Users//joydip.bhattacharjee//Desktop//Test//test.png");
		ImageIO.write(bufferedImage, "png", imageFile);
		
				
	}
}
