package parameterizationExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterClass {
	WebDriver d;
	@Parameters({"browserName","url"})
	@Test

	public void openBrowser(String browserName, String url) {
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					"E:\\Siddhu_jarFiles\\chromedriver.exe");
			d=new ChromeDriver();
			d.get(url);
		}
		else if(browserName.equals("fire")){
			System.setProperty("webdriver.gecko.driver", 
					"E:\\Siddhu_jarFiles\\geckodriver.exe");
			d=new FirefoxDriver();
			d.get(url);
		}

	}
}
