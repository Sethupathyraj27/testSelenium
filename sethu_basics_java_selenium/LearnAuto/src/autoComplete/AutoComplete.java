package autoComplete;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoComplete {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "E:\\Siddhu_jarFiles\\geckodriver.exe");
	WebDriver d = new FirefoxDriver();
	d.get("http://leafground.com/pages/autoComplete.html");
	
	WebElement search = d.findElement(By.xpath("//input[@id='tags']"));
	search.sendKeys("c");
	d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	List<WebElement> searchOptions = d.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
	System.out.println(searchOptions.size());
	

	for (WebElement webElement : searchOptions) {
		if(webElement.getText().equals("Cucumber")) {
			webElement.click();
			break;
//			use break stmt for efficient coding, 
//			because looping continues even we get result
		}
	}
	Thread.sleep(2000);
	d.close();
}
}
