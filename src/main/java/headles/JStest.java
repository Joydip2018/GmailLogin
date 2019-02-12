package headles;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JStest 
{
	WebDriver Driver;
	@Test		
    public void Login() throws Exception
    {		
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();			
        		
		Driver.manage().window().maximize();
        //Creating the JavascriptExecutor interface object by Type casting		
       // JavascriptExecutor js = (JavascriptExecutor)Driver;		
        		
        //Launching the Site.		
        Driver.get("https://www.javatpoint.com/java-tutorial");			
        		
        WebElement button =Driver.findElement(By.xpath("//div[@id='whatlearn']//ul//li//a[@href='history-of-java'][contains(text(),'History of Java')]"));			
        	
        Click_Btdsan(button);
        System.out.println(Get_Title());
        
        Date date = new Date();
        File scr = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
        File dest = new File(("./joy/"+"Testpic"+date.toString().replace(":", "_") + ".JPG")); 
        // because windows can't capture screenshot with colon
        FileUtils.copyFile(scr, dest);
        Driver.close();
    }
	public void Click_Btn(WebElement element) 
	{
		JavascriptExecutor jse = (JavascriptExecutor)Driver;
		jse.executeScript("arguments[0].click();", element);
	}
	public String Get_Title() 
	{
		JavascriptExecutor jse = (JavascriptExecutor)Driver;
		String sText =  jse.executeScript("return document.title;").toString();
		return sText;
	}
	public void Refresh() 
	{
		JavascriptExecutor jse = (JavascriptExecutor)Driver;
		jse.executeScript("history.go(0)");
	}

	public void Click_Btdsan(WebElement element) 
	{
		JavascriptExecutor jse = (JavascriptExecutor)Driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
