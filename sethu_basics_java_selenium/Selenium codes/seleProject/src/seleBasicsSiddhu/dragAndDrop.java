package seleBasicsSiddhu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//selenium setup		
System.setProperty("webdriver.chrome.driver", "D:\\infomats\\chromedriver.exe");
WebDriver d = new ChromeDriver();
d.manage().window().maximize();
//main codes

String ddURL = "https://jqueryui.com/droppable/";
d.get(ddURL);
JavascriptExecutor js = (JavascriptExecutor) d;
js.executeScript("window.scrollBy(0,600)");
d.switchTo().frame(0);

Actions act = new Actions(d);
WebElement one = d.findElement(By.xpath("//*[@id='draggable']"));
WebElement two = d.findElement(By.xpath("//*[@id='droppable']"));

act.dragAndDrop(one, two).build().perform();
Thread.sleep(2000);
d.close();
}
}
