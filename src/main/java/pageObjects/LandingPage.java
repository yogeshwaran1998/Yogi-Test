package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage  {
	
	public WebDriver driver;
	
	//Declaring variables private to acheive Encapsulation
	//Method accessors will be made public.
	private By uname=By.cssSelector("#username");
	private By pass= By.cssSelector("#password");
	private By signin= By.xpath("//button[contains(text(),'Sign in')]");
	
	//Giving driver knowledge from base class to this class.
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
	}
	public WebElement getUname()
	{
		return driver.findElement(uname);
	}
	public WebElement getPass()
	{
		return driver.findElement(pass);
	}
	
	public WebElement signIn()
	{
		return driver.findElement(signin);
	}

}
