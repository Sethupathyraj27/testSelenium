package basicEdits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty
		("webdriver.chrome.driver", "E:\\Siddhu_jarFiles\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		String url="http://leafground.com/pages/Alert.html";
		d.get(url);

		WebElement firstAlert = 
				d.findElement(By.xpath("//button[normalize-space()='Alert Box']"));
		firstAlert.click();
		Thread.sleep(2000);
		d.switchTo().alert().accept();Thread.sleep(2000);

		WebElement secondAlert =
				d.findElement(By.xpath("//button[normalize-space()='Confirm Box']"));

		secondAlert.click();
		d.switchTo().alert().dismiss();

		WebElement thirdAlert = 
				d.findElement(By.xpath("//button[normalize-space()='Prompt Box']"));
		thirdAlert.click();
		if(d.switchTo().alert().getText().contains("Pleas")) {
			System.out.println("test ok");
		}
		else {
			System.out.println("test not ok");
		}
		d.switchTo().alert().sendKeys("siddharth_test_prompt");
		System.out.println(d.switchTo().alert().getText());
		Thread.sleep(5000);
		d.switchTo().alert().accept();
		Thread.sleep(5000);

		d.close();

	}
}
