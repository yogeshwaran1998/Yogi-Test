package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	
	public WebDriver driver;
	
    private By project= By.xpath("//strong[@class='switcher-projects__title']");
    private By dashboard= By.xpath("//span[contains(text(),'Dashboard')]");
    
    
    
    public HomePage(WebDriver driver) {
		
    	this.driver=driver;
	}



	public WebElement getProject()
    {
    	return driver.findElement(project);
    }
	
	public WebElement getDashboard()
	{
		return driver.findElement(dashboard);
	}
    
}
