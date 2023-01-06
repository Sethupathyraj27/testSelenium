package images;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageChecking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"E:\\Siddhu_jarFiles\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		
		String url = "http://leafground.com/pages/Image.html";
		d.get(url);
//		logo img
		WebElement logo = d.findElement(By.xpath("//*[@id=\'text-2\']/a/img"));
		System.out.println("logo width: "+logo.getAttribute("naturalWidth"));
//		home img
		WebElement homeImg = d.findElement(By.xpath
				("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		Thread.sleep(3000);
		System.out.println("1st img width: "+homeImg.getAttribute("naturalWidth"));
		homeImg.click();
		d.navigate().back();
//		currepted img
		WebElement currImg = d.findElement(By.xpath
				("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		
		System.out.println("2nd img width: "+currImg.getAttribute("naturalWidth"));
		if(currImg.getAttribute("naturalWidth").equals("0")) {
			System.out.println("img is currepted");
		}
		else {
			System.out.println("not currpt");
		}
	}

}
