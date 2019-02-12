package Gmail.Gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserClass
{
	public static WebDriver BrowserDetails(String browser,WebDriver Driver) throws Exception
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			Driver = new ChromeDriver();
			//Driver = new HtmlUnitDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			Driver = new FirefoxDriver();
		}
		String str="https://accounts.google.com/";
		Driver.get(str);
		Driver.manage().window().maximize();
		return Driver;
	}
}
