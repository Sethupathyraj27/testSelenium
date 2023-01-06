package hyperLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class links {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", 
			"E:\\Siddhu_jarFiles\\geckodriver.exe");
	WebDriver d = new FirefoxDriver();
	
	String url = "http://leafground.com/pages/Link.html";
	d.get(url);	
	
	List<WebElement> totLinks = d.findElements(By.tagName("a"));
	Thread.sleep(3000);
	System.out.println("Total links: "+totLinks.size());
	
	WebElement find = d.findElement(By.partialLinkText("Find"));
	String findReusult= find.getAttribute("href");
	System.out.println(findReusult);

	d.navigate().back();
	
	WebElement broke = d.findElement(By.partialLinkText("Verify"));
	broke.click();
	String titleBroken= d.getTitle();
	if(titleBroken.contains("404")) {
		System.out.println("site broken");
	}
	else {
		System.out.println("site not broken");
	}
	
	
	
	
}
}
