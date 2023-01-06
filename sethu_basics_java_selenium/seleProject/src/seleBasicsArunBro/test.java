package seleBasicsArunBro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				 "E:\\Siddhu_jarFiles\\geckodriver.exe");
WebDriver d = new FirefoxDriver();
d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
d.manage().window().maximize();

d.findElement(By.id("txt_unam")).sendKeys("sylix");
d.findElement(By.name("txt_pass")).sendKeys("admin");
d.findElement(By.id("Button3")).click();
Thread.sleep(3000);
//d.switchTo().alert().accept();
//Thread.sleep(2000);
d.quit();
	}
}
