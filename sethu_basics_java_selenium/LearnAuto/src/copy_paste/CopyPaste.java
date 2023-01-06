package copy_paste;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Siddhu_jarFiles\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://stackoverflow.com/questions/36840886/how-to-copy-and-paste-a-value-using-selenium");
		
		Thread.sleep(2000);
		WebElement askBtn = d.findElement
				(By.xpath("//*[@id=\'openid-buttons\']/a"));
		String get_text = askBtn.getText();
		System.out.println(get_text);
		
//		WebElement searchBox = d.findElement(By.xpath("//*[@id=\'search\']/div/input"));
		
		
		StringSelection selection = new StringSelection(get_text);
		java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
//		virtual keyboard
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_C);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_C);
		
		d.close();
		
		
	}

}
