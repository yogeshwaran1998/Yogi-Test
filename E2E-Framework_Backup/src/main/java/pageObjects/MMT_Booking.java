package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MMT_Booking {

	
	public WebDriver driver;
	
	public MMT_Booking(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By stops= By.cssSelector("span[data-filtertext*='nonStop']");
	
	By sort= By.id("sorter_btn_onward");
	
	By sortPrice= By.cssSelector("span[class='sortByRTname']");
	
	By departureFlight= By.xpath("//div[@id='ow-domrt-jrny']/div/div[2]");
	
	By returnFlight= By.xpath("//div[@id='rt-domrt-jrny']/div/div[2]");
	
	By bookButton= By.cssSelector("button[id*='bookbutton']");
	
	By continueButton = By.xpath("//button[contains(text(),'Continue')]");
	
	By finalContinue= By.xpath("//button[@id='review-continue']");
	
	public WebElement getstops()
	{
		return driver.findElement(stops);
	}
	public WebElement getsort()
	{
		return driver.findElement(sort);
	}
	
	public WebElement getsortPrice()
	{
		return driver.findElement(sortPrice);
	}
	
	public WebElement getreturnFlight()
	{
		return driver.findElement(returnFlight);
	}
	
	public WebElement getdepartureFlight()
	{
		return driver.findElement(departureFlight);
	}
	
	public WebElement getbookButton()
	{
		return driver.findElement(bookButton);
	}
	
	public WebElement getcontinueButton()
	{
		return driver.findElement(continueButton);
	}
	
	public WebElement getfinalContinue()
	{
		return driver.findElement(finalContinue);
	}

	
	
}
