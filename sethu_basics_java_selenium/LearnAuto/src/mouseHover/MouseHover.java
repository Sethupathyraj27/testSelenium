package mouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", 
			"E:\\Siddhu_jarFiles\\geckodriver.exe");
	WebDriver d = new FirefoxDriver();
	
	String url = "http://leafground.com/pages/mouseOver.html";
	d.get(url);
	
	Actions act = new Actions(d);
	WebElement hoverBtn = d.findElement(By.xpath("//a[normalize-space()='TestLeaf Courses']"));
	

	act.moveToElement(hoverBtn).perform();
	
	d.findElement(By.linkText("Selenium")).click();
	Thread.sleep(2000);
	d.switchTo().alert().accept();
	
	String txt1=d.findElement(By.linkText("Selenium")).getText();
	String txt2=d.findElement(By.linkText("RPA")).getText();
	String txt3= d.findElement(By.linkText("WebServices")).getText();
	System.out.println(txt1+  txt2 + txt3);
	Thread.sleep(2000);
	d.close();
}
}
