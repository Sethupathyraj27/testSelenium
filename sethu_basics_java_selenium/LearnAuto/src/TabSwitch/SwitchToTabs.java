package TabSwitch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SwitchToTabs {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		
//		go to google on 1st tab 
//		and then amazon on 2nd tab 
//		then back to google
		System.setProperty("webdriver.chrome.driver", "E:\\Siddhu_jarFiles\\chromedriver.exe");
		WebDriver d =new ChromeDriver();
		d.get("https://www.google.com/");
		Thread.sleep(3000);
		System.out.println(d.getTitle());
//		d.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
//		d.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
//		Thread.sleep(5000);
//		d.get("https://www.youtube.com/");
//		System.out.println(d.getTitle());
//		d.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"/t");
		
//		create robot class
		
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_T);
		robo.keyRelease(KeyEvent.VK_T);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		d.get("https://www.youtube.com/");
		System.out.println(d.getTitle());
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_W);
		robo.keyRelease(KeyEvent.VK_W);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		d.get("https://www.youtube.com/");
		System.out.println(d.getTitle());
		
		
	}

}
