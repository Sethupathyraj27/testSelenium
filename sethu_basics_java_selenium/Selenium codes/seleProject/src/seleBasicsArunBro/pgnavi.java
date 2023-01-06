package seleBasicsArunBro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgnavi {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\infomats\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		d.get("https://www.flipkart.com/");
		d.get("https://www.shopclues.com/");
		d.navigate().back();
		Thread.sleep(5000);
		d.navigate().back();
		Thread.sleep(5000);
		d.navigate().forward();
		Thread.sleep(5000);
		d.navigate().forward();
		Thread.sleep(5000);
	}

}
