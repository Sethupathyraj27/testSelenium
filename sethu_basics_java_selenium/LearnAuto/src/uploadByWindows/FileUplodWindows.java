package uploadByWindows;

//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.datatransfer.StringSelection;
//import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUplodWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Siddhu_jarFiles\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("http://leafground.com/pages/upload.html");
		
		Thread.sleep(2000);
		WebElement uploadBtn = d.findElement(By.name("filename"));
		uploadBtn.sendKeys("E:\\ssImage.png");
		Thread.sleep(3000);
		
//		d.get("http://demo.guru99.com/test/upload/");
//		Thread.sleep(3000);
//		WebElement uploadBtn = d.findElement(By.name("filename"));
//		uploadBtn.click();
//		Thread.sleep(3000);
//		copy location on clip board
//		String filePath="E:\\ssImage.png";
//		StringSelection selection = new StringSelection(filePath);
//		java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//		create robot class to access virtual keyboard 
//		for copy/paste actions
//		Robot robo = new Robot();
//		robo.keyPress(KeyEvent.VK_CONTROL);
//		robo.keyPress(KeyEvent.VK_V);
//		robo.keyRelease(KeyEvent.VK_V);
//		robo.keyRelease(KeyEvent.VK_CONTROL);
//		Thread.sleep(2000);
//		robo.keyPress(KeyEvent.VK_ENTER);
//		robo.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		d.close();
//		
		
	}

}
