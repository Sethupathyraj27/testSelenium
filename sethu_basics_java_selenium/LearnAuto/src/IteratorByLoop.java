import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IteratorByLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Siddhu_jarFiles\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.automationtesting.in/Windows.html");
		System.out.println(d.getTitle());
		
//		d.findElement(By.xpath("//a[normalize-space()='Open Seperate Multiple Windows']")).click();
		d.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
		d.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Set<String> childWin = d.getWindowHandles();
//		Iterator<String> itr = childWin.iterator();
//		String parent = itr.next();
//		Thread.sleep(2000);
//		String child = itr.next();
//		System.out.println(d.getTitle());
//		Thread.sleep(2000);
//		d.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
//		d.switchTo().window(child);
//		System.out.println(d.getTitle());
//		d.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
//		d.switchTo().window(parent);
//		System.out.println(d.getTitle());
		for (String childWindows : childWin) {
			d.switchTo().window(childWindows);
		}
		System.out.println(d.getTitle());
		Thread.sleep(2000);
		d.close();
	}

}
