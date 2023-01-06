package FRAMES;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"E:\\Siddhu_jarFiles\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();

		String url = "http://leafground.com/pages/frame.html";
		d.get(url);

		d.switchTo().frame(0);
		WebElement frameBox = d.findElement(By.id("Click"));
		frameBox.click();
		String btnText = d.findElement(By.id("Click")).getText();
		System.out.println(btnText);

		d.switchTo().defaultContent();

		d.switchTo().frame(1);
		d.switchTo().frame("frame2");
		Thread.sleep(3000);
		d.findElement(By.id("Click1")).click();

//		finding total number of frames present
		d.switchTo().defaultContent();
		List<WebElement> totalF = d.findElements(By.tagName("img"));
		System.out.println("Total frames present: "+totalF.size());
	}

}
