package windowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CUB_login_window_handle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"E:\\Siddhu_jarFiles\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		
		String url="https://www.cityunionbank.com/login";
		d.get(url);
		
//		prent window
		String parentWindow = d.getWindowHandle();
		
		WebElement loginBtn = d.findElement
				(By.xpath("//span[@class='login-content']"));
		loginBtn.click();
		
		Set <String> childWindows = d.getWindowHandles();
		
		for (String newWindows : childWindows) {
			d.switchTo().window(newWindows);
		}
		WebElement fastTag = d.findElement(By.xpath("//a[normalize-space()='Personal Banking']"));
		fastTag.click();
		
		Thread.sleep(3000);
		d.close();
			
				
}
}
