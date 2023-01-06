package webDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TillElementClickable {
	public static void main(String[] args) {
		System.setProperty
		("webdriver.gecko.driver", 
				"E:\\Siddhu_jarFiles\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("http://leafground.com/pages/appear.html");
		WebElement hiddenBtn = d.findElement(By.id("btn"));
		System.out.println("beore appearing "+hiddenBtn.getText());
		WebDriverWait wait = new WebDriverWait(d, 10);
		wait.until(ExpectedConditions.elementToBeClickable
				(By.id("btn")));

		System.out.println("beore appearing "+hiddenBtn.getText());
		hiddenBtn.click();
	}
}
