package testPK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.out.println("test");
System.setProperty("webdriver.chrome.driver", "D:\\infomats\\chromedriver.exe");
WebDriver d = new ChromeDriver();
d.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
System.out.println(d.getTitle());
d.manage().window().maximize();
d.findElement(By.id("ap_email")).sendKeys("siddhuashok143@gmail.com");
d.findElement(By.id("continue")).click();
d.findElement(By.id("ap_password")).sendKeys("siddhu@amazon");
d.findElement(By.id("signInSubmit")).click();
	d.findElement(By.className("hm-icon nav-sprite"));
	}
}