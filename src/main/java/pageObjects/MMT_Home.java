package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MMT_Home {

	
	public WebDriver driver;
	
	public MMT_Home(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By from= By.id("fromCity");
	
	By fromCity= By.xpath("//input[@placeholder='From']");
	By desiredFromCity= By.xpath("//p[contains(text(),'Goa, India')]");
	
	By toCity= By.xpath("//input[@placeholder='To']");
	By desiredToCity= By.xpath("//p[contains(text(),'Chennai, India')]");		
	
	By nextMonth = By.xpath("//span[@aria-label='Next Month']");
	By departureDate= By.xpath("//div[@aria-label='Sat Jun 06 2020']");
	By onreturn = By.cssSelector("p[data-cy='returnDefaultText']");
	By returnDate= By.xpath("//div[@aria-label='Tue Jun 16 2020']");
	
	By flightType= By.xpath("//p[contains(text(),'Economy')]");
	By adultsCount= By.cssSelector("li[data-cy='adults-3']");
	
	By applyButton= By.cssSelector("button[data-cy='travellerApplyBtn']");
	By searchButton= By.xpath("//a[contains(text(),'Search')]");
	
	
	public WebElement getfrom()
	{
		return driver.findElement(from);
	}
	
	public WebElement getfromCity()
	{
		return driver.findElement(fromCity);
	}
	public WebElement getdesiredFromCity()
	{
		return driver.findElement(desiredFromCity);
	}
	public WebElement gettoCity()
	{
		return driver.findElement(toCity);
	}
	public WebElement getdesiredToCity()
	{
		return driver.findElement(desiredToCity);
	}
	public WebElement getnextMonth()
	{
		return driver.findElement(nextMonth);
	}
	public WebElement getdepartureDate()
	{
		return driver.findElement(departureDate);
	}
	public WebElement getreturnDate()
	{
		return driver.findElement(returnDate);
	}
	public WebElement getflightType()
	{
		return driver.findElement(flightType);
	}
	
	public WebElement getadultsCount()
	{
		return driver.findElement(adultsCount);
	}
	
	public WebElement getapplyButton()
	{
		return driver.findElement(applyButton);
	}
	public WebElement getsearchButton()
	{
		return driver.findElement(searchButton);
	}
	public WebElement getonreturn()
	{
		return driver.findElement(onreturn);
	}
	
	
	
	
}
