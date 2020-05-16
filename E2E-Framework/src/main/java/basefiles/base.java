package basefiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class base {

	protected WebDriver driver;
	protected Properties prop;

	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\resources\\browser.properties");

		prop.load(fis);

		// String browserName=System.getProperty("browser");

		String browserName = prop.getProperty("browser");
		
		ChromeOptions options= new ChromeOptions();

		if (browserName.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			
			if(browserName.contains("headless"))
			{
			//Informing the options class of ChromeOptions to run in headless mode.
			options.addArguments("headless"); 
			}
			
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}

		return driver;
	}

//Take a screenshot on test failiure
	public void getScreenshot(String result) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\TestScreenshots\\" + result + "screenshot.png"));

	}

}