package seleBasicsSiddhu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\infomats\\chromedriver.exe");
WebDriver d = new ChromeDriver();

d.get("https://amazon.in");

Actions act = new Actions (d);
WebElement selectCountry= d.findElement(By.id("icp-nav-flyout"));
act.moveToElement(selectCountry).perform();
Thread.sleep(2000);
WebElement selectAccount = d.findElement(By.id("nav-link-accountList"));
act.moveToElement(selectAccount).perform();
Thread.sleep(2000);
d.close();
}
}
