package commonFun;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class CommonFunctions{
	public static WebDriver driver;
	public static Properties properties;

	public Properties loadPropertyFile() throws IOException {
		//		file load , read and return

		FileInputStream file = new FileInputStream("config.properties");
//		Properties properties = new Properties(); 
		/* no need to create another one fresh class */
		properties = new Properties();
		properties.load(file);
		System.out.println("value is "+properties);


//		System.out.println("property file reads = "+properties);
		return properties;
	}

	@BeforeTest
	public void launchBrowser() throws IOException, InterruptedException {

		loadPropertyFile();
		//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String browser=properties.getProperty("browser");
		String url = properties.getProperty("url");
		String driverName = properties.getProperty("driverName");
		System.out.println("driver = "+driver);
		System.out.println(driverName);
		System.out.println("browser is: "+browser);
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",driverName);
			driver = new ChromeDriver();
		}
		//		else if(browser.equals("firefox")) {
		//			System.setProperty("webdriver.gecko.driver",null);
		//			driver = new FirefoxDriver();
		//		}
		driver.manage().window().maximize();
		System.out.println(driver);
		driver.get(url);
		//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterSuite
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
