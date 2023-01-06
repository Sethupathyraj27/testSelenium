package Selectable_List;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"E:\\Siddhu_jarFiles\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("http://leafground.com/pages/selectable.html");

		List<WebElement> ol = d.findElements(By.xpath("//*[@id=\'selectable\']/li"));

		//	create actions class
		Actions act = new Actions (d);
		act.keyDown(Keys.CONTROL).
		click(ol.get(3)).click(ol.get(5)).build().perform();
		Thread.sleep(6000);

		d.close();
	}
}
