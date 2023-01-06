
package seleBasicsArunBro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktxt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//String baseurl = "http://www.demo.guru99.com/test/link.html";
		String baseurl ="https://www.amazon.in";
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Siddhu_jarFiles\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		//d.manage().window().maximize();
		d.get(baseurl);
		Thread.sleep(5000);
		d.findElement(By.linkText("Best Sellers")).click();
		Thread.sleep(5000);
		d.navigate().refresh();
		System.out.println("Title of the page is : "+d.getTitle());
	}

}
