package testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basefiles.base;
import pageObjects.HomePage;
import pageObjects.LandingPage;

public class DashboardValidate extends base {
	
	public static Logger Log= LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		// Invoking the method from base class and assigning it to "driver", since
		// return type is driver
		driver = initializeDriver();
		Log.info("Driver is initialized for DashboardValidate class");

		// Navigating to the Linarc Website, URL is driven from Properties Files in
		// resources folder.
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to given URL for DashboardValidate class");
	}

	@Test
	public void validateDashboard() throws IOException {

		// Instantiating HomePage Class to access the locators and perform the below
		// operations.
		HomePage hp = new HomePage(driver);


		// Instantiating LandingPage class and creating an object to perform operations
		// on the Locators written in that file
		LandingPage lp = new LandingPage(driver);

		// Entering the Username, Password and Clicking on Signin button
		//username and password is driven from properties file
		lp.getUname().sendKeys(prop.getProperty("uname1"));
		lp.getPass().sendKeys(prop.getProperty("pass1"));
		lp.signIn().click();
		
		Log.info("User credentials entered and clicked on Signin Button [Data driven from Properties file]");

	
		// Validating if Dashboard tab is present in the website or not, and store in in
		// boolean variable
		// This step returns either true or false.
		boolean s = hp.getDashboard().isDisplayed();
		
		Log.info("Returned the boolean value for Dashboard element");

		// AssertTrue expects a condition to be true. If false, the script will fail and
		// no further execution will take place.
		Assert.assertTrue(s);
		
		Log.info("Validation successfull, Dashboard element exists in the webpage");
	}
	
	@AfterTest
	public void finish() {
		driver.close();
		//making the driver object null to remove the object from heap memory
				//to release the memory 
		driver=null;
		Log.info("Closed the browser for DashboardValidate class");
	}

}
