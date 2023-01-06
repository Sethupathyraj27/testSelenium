package webDriverWait;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty
		("webdriver.gecko.driver", "E:\\Siddhu_jarFiles\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("http://leafground.com/pages/alertappear.html");
		d.findElement(By.id("alert")).click();
		WebDriverWait waitw = new WebDriverWait(d,20);
		Alert untilWait = waitw.until(ExpectedConditions.alertIsPresent());
		System.out.println(untilWait.getText());
		untilWait.accept();
	}

}
