package seleBasicsSiddhu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class slider {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\Siddhu_jarFiles\\chromedriver.exe");
WebDriver d = new ChromeDriver();

d.get("https://jqueryui.com/slider/");
d.switchTo().frame(0);
WebElement ele = d.findElement(By.xpath("//*[@id='slider']/span"));

for(int i=0;i<40;i++){
	ele.sendKeys(Keys.ARROW_RIGHT);
}

for(int i=40;i>20;i--){
	ele.sendKeys(Keys.ARROW_LEFT);
}


}
}
