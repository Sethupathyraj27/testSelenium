package seleBasicsSiddhu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.out.println("test");
System.setProperty("webdriver.chrome.driver", "E:\\Siddhu_jarFiles\\chromedriver.exe");
WebDriver d = new ChromeDriver();

// main codes

d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
System.out.println(d.getTitle());
d.manage().window().maximize();
d.findElement(By.id("txt_unam")).sendKeys("sylix");
d.findElement(By.id("txt_pass")).sendKeys("admin");
d.findElement(By.id("Button3")).click();
d.switchTo().alert().accept();

d.findElement(By.linkText("LOGOUT")).click();
d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
d.findElement(By.className("level1 static")).click();
//Thread.sleep(40000);
	d.findElement(By.id("auth-signin-button")).click();
//	Thread.sleep(5000);
//	d.findElement(By.id("nav-search-submit-button")).click();
//	
d.findElement(By.linkText("Amazon Pay")).click();
	}
}