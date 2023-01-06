package windowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle2 {
	
//	get parent/home/default page - getWindowHandle()
//	new window/tab open
//	create collection - set
//	for each(advanced for loop)
//	switch to child window
//	switch to parent window
//	get child/new window page - getWindowHandles()
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"E:\\Siddhu_jarFiles\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		
		d.get("http://leafground.com/pages/Window.html");
		
		String defaultWindow = d.getWindowHandle();
		
		WebElement homeBtn = 
				d.findElement(By.xpath("//button[normalize-space()='Open Home Page']"));
		homeBtn.click();
		
		Set<String> childWindows =  d.getWindowHandles();
//		new window
		
		for (String child : childWindows) {
			d.switchTo().window(child);
		}
		Thread.sleep(3000);
		d.findElement(By.xpath("//img[@alt='Link']")).click();
		
		Thread.sleep(3000);
		d.close();
		
		d.switchTo().window(defaultWindow);
		
	}

}
