package seleBasicsSiddhu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetTextSample {
	WebDriver d;
	
	@BeforeTest public void fBefore() {
		  System.setProperty("webdriver.chrome.driver", "E:\\Siddhu_jarFiles\\chromedriver.exe");
		  d = new ChromeDriver();
	}
  @Test public void f() {
	  
	  d.get("https://www.snapdeal.com/");
	  System.out.println(d.getTitle());
	  
	 
  }
  @Test
  public void g(){
  d.manage().window().maximize();
}
  
  @AfterTest public void fAfter() throws InterruptedException {
	  Thread.sleep(1000);
	d.close();
}
}
