package seleBasicsSiddhu;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class GetTitleClass {

	WebDriver d;
	
//	use priority 
	
	@Test(priority=0)
	public void getTiltleFn() throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", "E:\\Siddhu_jarFiles\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://youtube.com");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(d.getTitle());
		
	}
	@Test(priority=1)
	public void closeFn() throws InterruptedException {
		Thread.sleep(3000);
		d.quit();
	}
	
}
