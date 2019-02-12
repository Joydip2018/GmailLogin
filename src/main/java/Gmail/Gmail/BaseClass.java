package Gmail.Gmail;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass 
{
	public static WebDriver Driver;
	@BeforeMethod
	public static void OpenBrowser() throws Exception
	{
		String str="chrome";
		Driver=BrowserClass.BrowserDetails(str, Driver);
	}
	@AfterMethod
	public static void closebrowser() throws Exception
	{
		Thread.sleep(2000);
		Driver.close();	
	}
}
