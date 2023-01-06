package TabSwitch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTab {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Siddhu_jarFiles\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.automationtesting.in/Windows.html");
		Thread.sleep(3000);
		//robot class fo keyboard shortcuts
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_W);
		robo.keyRelease(KeyEvent.VK_W);
		robo.keyRelease(KeyEvent.VK_CONTROL);

	}
}
