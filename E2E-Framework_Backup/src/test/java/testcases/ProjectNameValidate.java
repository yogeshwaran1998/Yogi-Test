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

public class ProjectNameValidate extends base {

	public static Logger Log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		// Invoking the method from base class and assigning it to "driver", since
		// return type is driver
		driver = initializeDriver();
		Log.info("Driver is initialized for ProjectNameValidate class");

		// Navigating to the Linarc Website, URL is driven from Properties Files in
		// resources folder.
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to given URL for ProjectNameValidate class");
	}

	@Test
	public void validateProjectName() throws IOException {

		// Instantiating HomePage Class to access the locators and perform the below
		// operations.
		driver.get(prop.getProperty("url"));

		// Instantiating LandingPage class and creating an object to perform operations
		// on the Locators written in that file
		LandingPage lp = new LandingPage(driver);

		// Instantiating HomePage Class to access the locators and perform the below
		// operations
		HomePage hp = new HomePage(driver);

		// Entering the Username, Password and Clicking on Signin button
		// username and password is driven from properties file
		lp.getUname().sendKeys(prop.getProperty("uname1"));
		lp.getPass().sendKeys(prop.getProperty("pass1"));
		lp.signIn().click();

		// This will look for the text present in the mentioned locator and store it in
		// a string.
		String checkProject = hp.getProject().getText();

		// Validating if "Project" is present in the website after login or not. Script
		// will fail if "Project" is not present
		// Hence, saving time and no further code will be executed.
		Assert.assertEquals(checkProject, "Project");

	}

	@AfterTest
	public void finish() {
		driver.close();
		driver = null;
		// making the driver object null to remove the object from heap memory
		// to release the memory
		Log.info("Closed the browser for ProjectNameValidation class");
	}

}
