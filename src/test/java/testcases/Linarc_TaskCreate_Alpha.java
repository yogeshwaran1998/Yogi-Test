package testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basefiles.base;
import pageObjects.Linarc_TasksCreate_Objects;

public class Linarc_TaskCreate_Alpha extends base {

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		driver.get(prop.getProperty("linarcLive"));
	}

	@Test
	public void createTasks() throws InterruptedException {

		Linarc_TasksCreate_Objects obj = new Linarc_TasksCreate_Objects(driver);

		obj.username().sendKeys("johnl3883");
		obj.password().sendKeys("1LinarcTester@");
		obj.signin().click();
		obj.projectsDropdown().click();
		obj.projectSelect().click();

		obj.tasksPage().click();
		Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='task-labor--M7IIsvhrIbIsTT2DgQj']")).sendKeys("50000");
}
}