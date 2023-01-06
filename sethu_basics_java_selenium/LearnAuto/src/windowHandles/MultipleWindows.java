package windowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"E:\\Siddhu_jarFiles\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		
		String url = "http://leafground.com/pages/Window.html";
		d.get(url);
		
		String mainWin = d.getWindowHandle();
		
		WebElement multi_btn = d.findElement
				(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
		multi_btn.click();
		
		Set<String> handles= d.getWindowHandles();
		
		for (String childWindows : handles) {
			d.switchTo().window(childWindows);
			if(!mainWin.equals(childWindows)) {
				Thread.sleep(3000);
				d.close();
			}
			
		}
		
		
		
		
	}

}
