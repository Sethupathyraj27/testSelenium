package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Siddhu_jarFiles\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		String url = "http://leafground.com/pages/Calendar.html";
		d.get(url);
		WebElement inputDate = d.findElement
				(By.xpath("//*[@id=\'datepicker\']"));
		inputDate.click();
		Thread.sleep(2000);
		WebElement previous = d.findElement
				(By.xpath("//*[@id=\'ui-datepicker-div\']/div/a[1]"));
		previous.click();
		Thread.sleep(2000);
		WebElement juneOne = d.findElement(By.xpath("//a[normalize-space()='1']"));
		juneOne.click();
		Thread.sleep(2000);
		d.close();
	}

}
