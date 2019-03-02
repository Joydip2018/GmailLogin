package Gmail.Gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserClass
{
	public static final String USERNAME = "muni.mathur";
	public static final String ACCESS_KEY = "ce2eb1f0-f6c5-4bc5-8b99-66e78850795c";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	
	public static WebDriver BrowserDetails(String browser,WebDriver Driver) throws Exception
	{
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			DesiredCapabilities caps = DesiredCapabilities.chrome();
			caps.setCapability("platform", "Windows 8.1");
			caps.setCapability("version", "latest");
			caps.setCapability("Name", "GmailTest");
			//WebDriverManager.chromedriver().setup();
			//Driver = new ChromeDriver();
			//Driver = new HtmlUnitDriver();
			Driver = new RemoteWebDriver(new java.net.URL(URL),caps);
		}
		/*if(browser.equalsIgnoreCase("chrome"))
		{
			DesiredCapabilities caps = DesiredCapabilities.chrome();
			caps.setCapability("platform", "Windows 7");
			caps.setCapability("version", "latest");
			caps.setCapability("Name", "GmailTest2");
			//WebDriverManager.chromedriver().setup();
			//Driver = new ChromeDriver();
			//Driver = new HtmlUnitDriver();
			Driver = new RemoteWebDriver(new java.net.URL(URL),caps);
		}*/
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
