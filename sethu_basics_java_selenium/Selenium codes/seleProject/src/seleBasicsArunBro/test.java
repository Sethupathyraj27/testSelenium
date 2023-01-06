package seleBasicsArunBro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\selenium jars\\chrome drivers\\chromedriver.exe");
WebDriver d = new ChromeDriver();
d.get("https://demoqa.com/menu/");
d.manage().window().maximize();
Actions a = new Actions(d);

//d.findElement(By.id("txt_unam")).sendKeys("sylix");
//d.findElement(By.name("txt_pass")).sendKeys("admin");
//d.findElement(By.id("Button3")).click();
//Thread.sleep(6000);
//d.switchTo().alert().accept();
	}
}
