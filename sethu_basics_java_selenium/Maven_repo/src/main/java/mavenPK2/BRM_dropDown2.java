package mavenPK2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BRM_dropDown2 {
public static void main(String[] args) throws InterruptedException {
	System.out.println("test");
	
	System.setProperty("webdriver.chrome.driver", 
			"E:\\Siddhu_jarFiles\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
	d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	d.manage().window().maximize();
	d.findElement(By.id("txt_unam")).sendKeys("sylix");
	d.findElement(By.name("txt_pass")).sendKeys("admin");
	d.findElement(By.id("Button3")).click();
	Thread.sleep(6000);
	d.findElement(By.xpath("//*[@id=\"hmenu\"]/ul/li[2]/a")).click();
	
	
	Select state = new Select(d.findElement(By.id("ContentPlaceHolder1_ddl_state")));
	state.selectByIndex(10);
	Thread.sleep(3000);
	state.selectByVisibleText("Goa");
	Thread.sleep(3000);
	state.selectByValue("Madhya Pradesh");
	d.close();
}
}
