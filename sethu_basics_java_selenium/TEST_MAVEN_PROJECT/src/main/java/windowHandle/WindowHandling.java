package windowHandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",
		"E:\\Siddhu_jarFiles\\chromedriver.exe");
WebDriver d = new ChromeDriver();
d.get("https://www.cityunionbank.com/");
d.manage().window().maximize();

String parent = d.getWindowHandle();

WebElement login = d.findElement(By.xpath("//span[@class='login-content']"));
login.click();
d.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
WebElement personalBank = d.findElement(By.xpath("//a[normalize-space()='Personal Banking']"));
personalBank.click();
Thread.sleep(3000);
Set<String> childWindows= d.getWindowHandles();
for (String child : childWindows) {
	d.switchTo().window(child);
}
WebElement userId = d.findElement(By.id("uid"));
userId.sendKeys("anandh");
Thread.sleep(3000);
d.quit();


	
}
}
