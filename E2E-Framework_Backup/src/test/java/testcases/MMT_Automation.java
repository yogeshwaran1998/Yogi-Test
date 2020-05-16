package testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basefiles.base;
import pageObjects.MMT_Booking;
import pageObjects.MMT_Home;

public class MMT_Automation extends base {

	public static Logger Log= LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {

        driver=initializeDriver();
        
        driver.get(prop.getProperty("mmturl"));
		
	}
        @Test
        public void bookflight() throws InterruptedException
        {
        MMT_Home mh= new MMT_Home(driver);
        MMT_Booking mb= new MMT_Booking(driver);
		mh.getfrom().click();
		sleep();
		Actions ac= new Actions(driver);
		ac.moveToElement(mh.getfromCity()).click().pause(3000).sendKeys("goa").build().perform();
		sleep();
		mh.getdesiredFromCity().click();
		ac.moveToElement(mh.gettoCity()).click().pause(3000).sendKeys("maa").build().perform();
		mh.getdesiredToCity().click();
		sleep();
		mh.getnextMonth().click();
		sleep();
		mh.getdepartureDate().click();
		sleep();
		mh.getonreturn().click();
		sleep();
		mh.getreturnDate().click();
		sleep();
		mh.getflightType().click();
		sleep();
		mh.getadultsCount().click();
		sleep();
		mh.getapplyButton().click();
		sleep();
		mh.getsearchButton().click();
		Thread.sleep(7000);
		
		mb.getstops().click();
		sleep();
		mb.getsort().click();
		sleep();
		mb.getsortPrice().click();
		Thread.sleep(4000);
		
		WebElement element = mb.getdepartureFlight();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		sleep();
		mb.getreturnFlight().click();
		sleep();
		mb.getbookButton().click();
		sleep();
		mb.getcontinueButton().click();
		//mb.getfinalContinue().click();
		
	}
        
    	public void sleep() throws InterruptedException
		{
			Thread.sleep(3000);
		}
        
}
