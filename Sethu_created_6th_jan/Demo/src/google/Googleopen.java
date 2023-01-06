package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Googleopen {
	
	@Test
	public void test() {
		  System.setProperty
			("webdriver.chrome.driver", "D:\\WORK\\chromedriver.exe");
			WebDriver d = new ChromeDriver();

			String url="https://www.selenium.dev/downloads/";
			d.get(url);

}
}