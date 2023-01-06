package hyperLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Total_ImgCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Siddhu_jarFiles\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		String url = "https://youtube.com";
		d.get(url);	
		List<WebElement> TotalImg = d.findElements(By.tagName("img"));
		System.out.println(TotalImg.size());
	}

}
