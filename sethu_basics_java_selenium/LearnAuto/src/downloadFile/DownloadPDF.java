package downloadFile;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadPDF {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"E:\\Siddhu_jarFiles\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	
	String url = "http://leafground.com/pages/download.html";
	d.get(url);
	WebElement downlodLink = d.findElement(By.linkText("Download PDF"));
	downlodLink.click();
	
Thread.sleep(10000);	
// download manually
//	checking file is downloaded prpoerly
	File fileLocation = new File("C:\\Users\\Admin\\Downloads");
	File[] fileArray = fileLocation.listFiles();
	d.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	
	for (File file : fileArray) {
		if(file.getName().equals("testleaf.pdf")) {
			System.out.println("downloaded tesetleaf pdf ok");
			break;
		}
	}
	
}
}
