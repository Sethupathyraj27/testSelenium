package FRAMES;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class imageCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", 
				"E:\\Siddhu_jarFiles\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		
		d.get("https://www.amazon.in/");
		List<WebElement> totImg =	d.findElements(By.tagName("img"));
		
		System.out.println("Total images: "+totImg.size());
		
	}

}
