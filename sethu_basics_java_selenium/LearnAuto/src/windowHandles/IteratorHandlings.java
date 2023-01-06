package windowHandles;

import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IteratorHandlings {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"E:\\Siddhu_jarFiles\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.automationtesting.in/Windows.html");
		System.out.println(d.getTitle());
		d.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
		System.out.println(d.getTitle());
		WebElement clickBtn = d.findElement(By.xpath("//button[@class='btn btn-primary']"));
		clickBtn.click();
		
		Set<String>  childWindows = d.getWindowHandles();
		java.util.Iterator<String> itr = childWindows.iterator();
		String parant=itr.next();
		String child = itr.next();
		d.switchTo().window(child);
		System.out.println(d.getTitle());
		d.switchTo().window(parant);
		System.out.println(d.getTitle());
		Thread.sleep(2000);

}
}
