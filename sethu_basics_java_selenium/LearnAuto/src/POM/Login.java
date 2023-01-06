package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Siddhu_jarFiles\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.phptravels.net/admin");

		
		LoginPOM.username(d).sendKeys("sid");
		LoginPOM.pwd(d).sendKeys("sidhu");
		Thread.sleep(2000);
		LoginPOM.loginBtn(d).click();
	}

}
