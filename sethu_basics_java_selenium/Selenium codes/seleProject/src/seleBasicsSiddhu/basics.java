package seleBasicsSiddhu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class basics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\infomats\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in");
		d.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) d;
// scroll event
//js.executeScript("window.scrollBy(0,5000)");
//		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-3000)");
		Thread.sleep(5000);
d.findElement(By.linkText("Amazon Pay")).click();
		
		Select cat = new Select(d.findElement(By.id("searchDropdownBox")));
		cat.selectByIndex(5);
		Thread.sleep(3000);
		cat.selectByVisibleText("Baby");
		Thread.sleep(3000);
		cat.selectByValue("search-alias=amazon-devices");
		
		
}
}
