package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// identify FROM and TO elements
		// clickAndHold(from element)
		// moveToElement(To element)
		// relese()
		// build().perform()

		//		or use
		//		actionClass_variable.dragAndDrop(from,to).build().perform();
		System.setProperty("webdriver.gecko.driver",
				"E:\\\\Siddhu_jarFiles\\\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("http://leafground.com/pages/drop.html");
		Actions act = new Actions(d);
		WebElement from = d.findElement(By.id("draggable"));
		WebElement to = d.findElement(By.id("droppable"));
		Thread.sleep(3000);
		
		act.dragAndDrop(from, to).build().perform();
//		act.clickAndHold(from).moveToElement(to).release(to).build().perform();
		Thread.sleep(3000);
		d.close();
	}

}
