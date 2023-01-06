package seleBasicsSiddhu;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	public static void main(String[] args) throws InterruptedException, NoSuchElementException{
		// TODO Auto-generated method stub


System.setProperty("webdriver.chrome.driver","D:\\infomats\\chromedriver.exe");
WebDriver d = new ChromeDriver();
d.get("https://web.whatsapp.com/");
System.out.println(d.getTitle());

}
}
