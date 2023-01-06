package autoComplete;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoCom2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"E:\\Siddhu_jarFiles\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		
		d.get("http://leafground.com/pages/autoComplete.html");
		WebElement inputBox = d.findElement(By.id("tags"));
		inputBox.sendKeys("s");
		d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		List<WebElement> optList= d.findElements
				(By.xpath("//*[@id=\'ui-id-1\']/li"));
//		System.out.println(optList.size());
		
		for (WebElement webElement : optList) {
			if(webElement.getText().equals("Selenium")) {
				webElement.click();
				break;
			}
		}
		
		}
		
	}


