package mavenPK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Siddhu_jarFiles\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://www.flipkart.com");
}
}

