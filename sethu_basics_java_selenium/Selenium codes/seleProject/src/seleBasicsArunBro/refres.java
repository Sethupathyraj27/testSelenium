package seleBasicsArunBro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class refres {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium jars\\chrome drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in");
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.navigate().refresh();
		Thread.sleep(3000);
		d.navigate().refresh();
		Thread.sleep(3000);
		d.navigate().refresh();
		Thread.sleep(3000);
		d.manage().window().maximize();
	}

}
