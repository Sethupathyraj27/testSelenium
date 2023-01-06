package seleBasicsSiddhu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\infomats\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
//		main code
		
		String uploadLink="http://demo.guru99.com/test/upload";
		d.get(uploadLink);
		
		
		WebElement uploadBtn = d.findElement(By.id("uploadfile_0"));
		uploadBtn.sendKeys("C:\\Users\\123\\Desktop\\javaSelenium.docx");
		Thread.sleep(2000);
		d.findElement(By.id("terms")).click();
		Thread.sleep(2000);
		d.findElement(By.cssSelector("#submitbutton")).click();
		
		
}
}
