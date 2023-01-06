package seleBasicsSiddhu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vertical_slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Siddhu_jarFiles\\chromedriver.exe");
WebDriver d =new ChromeDriver();

String site = "https://jqueryui.com/slider/#slider-vertical";
d.get(site);
d.switchTo().frame(0);
WebElement handle = d.findElement(By.xpath("//*[@id='slider-vertical']/span"));

for(int i=00;i<100;i++){
	handle.sendKeys(Keys.ARROW_DOWN);
}
Thread.sleep(3000);

for(int i=100;i>50;i--){
	handle.sendKeys(Keys.ARROW_UP);
}
Thread.sleep(2000);
d.close();

}
}
