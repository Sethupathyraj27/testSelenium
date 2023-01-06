package commonFunctions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {
	public static WebDriver d;
	public static Properties property;

	public Properties loadPropertyFile() throws IOException, InterruptedException {

		//		file read by fileInputStream

		FileInputStream file = new FileInputStream("config.properties");
		property = new Properties();
		property.load(file);
		System.out.println(property);
		Thread.sleep(2000);

		//		file read by Buffered file

		//		BufferedReader reader = new BufferedReader(new FileReader("config.property"));
		//		Properties property = new Properties();
		//		property.load(reader);
		//		System.out.println(property);
		return property;
	}

	@BeforeSuite
	public void launchBrowser() throws IOException, InterruptedException {
		Thread.sleep(2000);
		loadPropertyFile();

		System.out.println("prop="+property);
		
		String browser = property.getProperty("browserName");
		String driverLocation = property.getProperty("driverPath");
		
		String url = property.getProperty("url");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",driverLocation );
			d=new ChromeDriver();
			System.out.println("driver = "+d);
			d.get("https://testng.org/doc/documentation-main.html");
		}


		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverLocation);
			d=new FirefoxDriver();
		}
		System.out.println(d);
		d.get(url);

	}

}
