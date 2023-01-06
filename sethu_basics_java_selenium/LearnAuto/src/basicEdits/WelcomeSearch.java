package basicEdits;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WelcomeSearch {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "E:\\Siddhu_jarFiles\\geckodriver.exe");
	WebDriver d = new FirefoxDriver();
	
	d.get("https://www.google.com");
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@title='Search']"))
	.sendKeys("siddharth wikipedia"+Keys.ENTER);
	Thread.sleep(2000);
	d.navigate().back();
	Thread.sleep(2000);
	d.navigate().forward();
	d.close();
}
}
