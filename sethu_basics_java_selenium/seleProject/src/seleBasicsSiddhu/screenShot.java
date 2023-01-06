package seleBasicsSiddhu;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	
public class screenShot {
public static void main(String[] args) throws  InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "E:\\Siddhu_jarFiles\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.flipkart.com/");
	
//	JavascriptExecutor anand = (JavascriptExecutor)d;
	
	File ss= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	
//	FileUtils.copyFile(ss, new File("E:/ssImage.png"));
	
	FileUtils.copyFile(ss, new File("E:/selenium_ss/flipKart.png"));
//	 jpg and png only
	
	Thread.sleep(2000);
	d.close();

}
}
