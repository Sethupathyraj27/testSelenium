package windowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle_Simple {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", 
			"E:\\Siddhu_jarFiles\\geckodriver.exe");
	WebDriver d = new FirefoxDriver();
	
	String url = "http://leafground.com/pages/Window.html";
	d.get(url);
	
//	first we have to locate parent window position by using
//	getWindowHandle(), will be used any time to redirect back to main window easily
	
//	getWindowHandle() --- parent / main window
//	getWindowHandles() --- all child windows
	
	String parant=	d.getWindowHandle();
// accessing new window by click
	
	WebElement firstBtn = d.findElement
			(By.xpath("//button[normalize-space()='Open Home Page']"));
			firstBtn.click();
	
// identify new or child windows by set collection type (getWindowHandles)
	Set<String>handles= d.getWindowHandles();
		
//	iterate by advanced for loop or forEach loop
			
//			after entering new window we have to change access 
//			to new/child window by getWindowHandles()
for (String child : handles) {
	d.switchTo().window(child);
}

	Thread.sleep(3000);
	
//	acces child/new windows
	WebElement btnHandle = d.findElement
			(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a"));
	btnHandle.click();
	Thread.sleep(3000);
	
//	if single child window only opened we can directly 
//	use d.close() to come back to parant otherwise we can redirect to particular window
//	but remaining unclosed tabs are minimized
	
//	d.close();
	
	d.switchTo().window(parant);
	
	int noOfWin=d.getWindowHandles().size();
	System.out.println(noOfWin);
	
	d.quit();
	
}
}
