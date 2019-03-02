package Gmail.Gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpageelement
{
	WebDriver Driver;
	public loginpageelement(WebDriver driver)
	{
		this.Driver=driver;
	}
	
	@FindBy(id="identifierId")
	@CacheLookup
	WebElement Username;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement Password;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	@CacheLookup
	WebElement Nextbtn;
	
	@FindBy(xpath="//span[contains(text(),'Nex')]")
	@CacheLookup
	WebElement Nextbtn1;
	
	@FindBy(xpath="//a[@title ='Google apps']")
	@CacheLookup
	WebElement Gbtn;

	@FindBy(xpath="//span[contains(text(),'Gmail')]")
	@CacheLookup
	WebElement Gmailbtn;
	
	public void GUsername(String Uname)
	{
		Username.sendKeys(Uname);
	}
	public void Gnext()
	{
		Nextbtn.click();
	}
	public void GPassword(String Pass)
	{
		Password.sendKeys(Pass);
	}
	public void Gnext1()
	{
		Nextbtn1.click();
	}
	public void Gmbtn()
	{
		Gbtn.click();
	}
	public void Gmailbtn()
	{
		Gmailbtn.click();
	}

	public void Glogin(String Uname, String Pass)
	{
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		GUsername(Uname);
		Gnext();
		GPassword(Pass);
		int i=0;
		WebDriverWait wait=new WebDriverWait(Driver, 20);
		while(i<1)
		{
			try
			{
				wait.until(ExpectedConditions.visibilityOf(Nextbtn1));
				Gnext1();
			}
			catch(StaleElementReferenceException e)
			{
			}
			i++;
		}
		//Gmbtn();		
		//Gmailbtn();
	}
	
}
