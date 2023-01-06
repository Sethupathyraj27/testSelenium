package seleBasicsSiddhu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fileUpload {
	WebDriver d;
	
	@Test
	public void fu() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Siddhu_jarFiles\\chromedriver.exe");
		d = new ChromeDriver();

		//		main code
		String uploadLink="http://demo.guru99.com/test/upload";
		d.get(uploadLink);
		
		WebElement uploadBtn = d.findElement(By.id("uploadfile_0"));
		uploadBtn.sendKeys("C:\\Program Files (x86)\\Notepad++\\notepad++.exe");
		Thread.sleep(2000);
		d.findElement(By.id("terms")).click();
		Thread.sleep(2000);
		d.findElement(By.cssSelector("#submitbutton")).click();
		
	}
	@Test
	public void second() throws InterruptedException {
		d.navigate().refresh();
		Thread.sleep(2000);
		  d.manage().window().maximize();
		Thread.sleep(2000);
		d.close();
	}
		
}
