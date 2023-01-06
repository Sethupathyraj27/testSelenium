package Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Siddhu_jarFiles\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		String url = "http://leafground.com/pages/table.html";
		d.get(url);
		
		List<WebElement> colounCount =  d.findElements(By.tagName("th"));
		System.out.println("tot col: "+colounCount.size());
		List<WebElement> rowCount =  d.findElements(By.tagName("tr"));
		System.out.println("tot rows: "+rowCount.size());
		
//		custom xpath
		
		WebElement percentTD = d.findElement(By.
		xpath("//td[normalize-space()='Learn to interact using Keyboard, Actions']//following::td[4]"));
		System.out.println("percentage: "+percentTD.getText());
	
	}

}
