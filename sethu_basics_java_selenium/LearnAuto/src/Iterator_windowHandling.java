import java.util.Iterator;
import java.util.Set;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iterator_windowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Siddhu_jarFiles\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		String url = "http://demo.automationtesting.in/Windows.html";
		d.get(url);
		
		d.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
		System.out.println("Parant window title: "+d.getTitle());
		WebElement clickBtn = d.findElement(By.xpath("//button[@class='btn btn-primary']"));
		clickBtn.click();
		
		Set<String> child = d.getWindowHandles();
		Iterator<String> itr = child.iterator();
		String parent = itr.next();
//		d.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		String childWindow = itr.next();
		d.switchTo().window(childWindow);
//		d.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		d.switchTo().parentFrame();
		System.out.println("Child window title: "+d.getTitle());
		d.switchTo().window(parent);
		System.out.println("Parant window title: "+d.getTitle());
		d.quit();
	
	}
	

}
