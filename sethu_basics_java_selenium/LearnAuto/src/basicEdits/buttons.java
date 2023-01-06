package basicEdits;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class buttons {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"E:\\Siddhu_jarFiles\\geckodriver.exe");

		WebDriver d = new FirefoxDriver();
		String url = "http://leafground.com/pages/Button.html";

		d.get(url);

		// get location or coordinate
		WebElement locateBtn = d.findElement
				(By.xpath("//button[normalize-space()='Get Position']"));
		org.openqa.selenium.Point loc = locateBtn.getLocation();
		int loc2 = loc.getX();
		int loc3 = loc.getY();

		System.out.println("x coordiate: "+ loc2 +"y coordiate: "+loc3);

		// get css property- bg color of an element
		WebElement getBg_btn = d.findElement(By.id("color"));
		String bg = getBg_btn.getAttribute("style");
		String bg2 = getBg_btn.getCssValue("background-color");
		System.out.println(bg);
		System.out.println(bg2);
		Thread.sleep(2000);

		WebElement getSize_btn = 
			d.findElement(By.xpath("//*[@id=\"size\"]"));

		Dimension btnSize = getSize_btn.getSize();
		int btnHeight=btnSize.getHeight();
		int btnWidth=btnSize.getWidth();
		System.out.println(btnSize); /* both width and height */
		System.out.println(btnHeight); /* only height */
		System.out.println(btnWidth); /* only width */

		//	normal btn click
		WebElement homeBtn = d.findElement
				(By.xpath("//button[normalize-space()='Go to Home Page']"));
		homeBtn.click();

		d.quit();


	}
}
