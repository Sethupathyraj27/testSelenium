package toolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tooltip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"E:\\Siddhu_jarFiles\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("http://amazon.in");
		
		WebElement youlogo = d.findElement(By.xpath("//*[@id=\'searchDropdownBox\']"));
		String titleLogo =  youlogo.getAttribute("title");
		System.out.println(titleLogo);
		
//		WebElement searchBox = d.findElement(By.id("twotabsearchtextbox"));
//		searchBox.sendKeys(titleLogo);
		
		Thread.sleep(3000);
		d.close();
	}

}
