package testcases;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basefiles.base;
import pageObjects.LandingPage;

public class SigninPage extends base {

	public static Logger Log= LogManager.getLogger(base.class.getName());
	int count=0;
	
	@BeforeTest
	public void initialize() throws IOException {
		// Invoking the method from base class and assigning it to "driver", since
		// return type is driver
		driver = initializeDriver();
		Log.info("Driver is initialized for SigninPage class");
		
	}

	// Using DataProvider so that multiple user credentials can be automated. Method
	// is written at the bottom
	@Test(dataProvider = "getData")
	public void LoginPage(String username, String password) throws IOException, InterruptedException {
		
		// Navigating to the Linarc Website, URL is driven from Properties Files in
		// resources folder.
		driver.get(prop.getProperty("url"));
		
		Log.info("Navigated to Given URL for SigninPage class");

		// Instantiating LandingPage class and creating an object to perform operations
		// on the Locators written in that file
		LandingPage lp = new LandingPage(driver);

		// Entering the Username, Password and Clicking on Signin button
		lp.getUname().sendKeys(username);
		lp.getPass().sendKeys(password);
		lp.signIn().click();
		count++;
	
		Log.info("User credentials entered and clicked on Signin Button for the user "+count+" [Data driven from DataProvider method]");

	}

	@DataProvider
	public Object[][] getData() {
		// row stands for how many times the test must run
		// column stands for how many values are used per test
		Object[][] data = new Object[2][2];

		data[0][0] = "testp3935";
		data[0][1] = "1LinarcTester@";

		data[1][0] = "jamestn6385";
		data[1][1] = "1LinarcTester@";

		return data;

	}

	@AfterTest
	public void finish() {
		driver.close();
		
		//making the driver object null to remove the object from heap memory
		        //to release the memory 
		driver=null;
		Log.info("Closed the browser for SigninPage class");
	}
}
