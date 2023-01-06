package click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clicks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Siddhu_jarFiles\\chromedriver.exe");
		WebDriver d  = new ChromeDriver();
		d.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		
		Actions act = new Actions(d);
		WebElement btn1 = d.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(btn1).perform();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[7]")).click();
		d.switchTo().alert().accept();
		Thread.sleep(2000);
		
		WebElement btn2 = d.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
		act.doubleClick(btn2).perform();
		Thread.sleep(2000);
		d.switchTo().alert().accept();
		Thread.sleep(2000);
		d.close();
		
	}

}
