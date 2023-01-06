package POM_Annotation;

import java.util.Stack;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PomWithAnnotation {
	 WebDriver d;
//	@Parameters({"url"})
	@Test(priority = 1,groups= {"browser"})
	public void browser() {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Siddhu_jarFiles\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
	}
	@Test(priority = 2)
	public void login() throws InterruptedException {
		try {
			System.out.println("loginMethod"+d);
			
//			 this.d = d; 
			PageFactory.initElements(d, LoginPomFlipkart.class);
			
			Thread.sleep(2000);
			LoginPomFlipkart.userName.sendKeys("siddhuashok143@gmail.com");
			LoginPomFlipkart.pwd.sendKeys("9751860417");
			LoginPomFlipkart.loginBtn.click();
		}
		catch(Exception e) {
			System.out.println(e+" Login credentials issue");
		}
	}
	
	@Test(priority = 3)
	public void close() throws InterruptedException {
		System.out.println("closeMEthod"+d);
		Thread.sleep(4000);
		d.close();
	}
}
