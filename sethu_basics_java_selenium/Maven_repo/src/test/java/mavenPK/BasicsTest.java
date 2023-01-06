package mavenPK;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class BasicsTest {
	WebDriver d;
  @Test
  public void f() throws InterruptedException {
	  
	  JavascriptExecutor js = (JavascriptExecutor) d;
	//scroll event
	//js.executeScript("window.scrollBy(0,5000)");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-3000)");
			Thread.sleep(2000);
	d.findElement(By.linkText("Amazon Pay")).click();
			
			Select cat = new Select(d.findElement(By.id("searchDropdownBox")));
			cat.selectByIndex(5);
			Thread.sleep(3000);
			cat.selectByVisibleText("Baby");
			Thread.sleep(3000);
			cat.selectByValue("search-alias=amazon-devices");
		
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Siddhu_jarFiles\\chromedriver.exe");
		 d = new ChromeDriver();
		d.get("https://www.amazon.in");
		d.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(2000);
		d.close();
  }

}
