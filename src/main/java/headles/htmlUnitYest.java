package headles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class htmlUnitYest 
{
	public static void main(String[] args) 
	{
		System.out.println("joy");
        // Creating a new instance of the HTML unit driver         
        WebDriver driver = new HtmlUnitDriver();
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
         
		// Navigate to Google		
        driver.get("http://www.google.com");					

		// Locate the searchbox using its name		
        WebElement element = driver.findElement(By.name("q"));	
        
       // Enter a search query		
       element.sendKeys("joydip");	
      
       // Submit the query. Webdriver searches for the form using the text input element automatically		
       // No need to locate/find the submit button		
       element.submit();			
       
		// This code will print the page title		
       System.out.println("Page title is: " + driver.getTitle());		
       
       driver.quit();			
	}		
}
