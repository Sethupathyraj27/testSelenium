package mavenproject12;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mavendummy {
	@Test(priority = 0)
	public void dtest5() {
		  System.setProperty
			("webdriver.chrome.driver", "D:\\WORK\\chromedriver.exe");
			WebDriver d = new ChromeDriver();

			String url="https://www.selenium.dev/downloads/";
			d.get(url);
	}
	@Test(priority = 1)
	public void atest1() {
		System.out.println("hello world");
	
	}
	@Test(priority = 2)
	public void btest2() {
		System.out.println("hello world2");
	
	}
	@Test(priority = 3)
	public void ctest3() {
		System.out.println("hello world3");
		
	
	}
	
}

		  
