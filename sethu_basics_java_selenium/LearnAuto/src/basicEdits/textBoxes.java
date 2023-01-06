package basicEdits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class textBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"E:\\Siddhu_jarFiles\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();

		String url = "http://leafground.com/pages/Edit.html";
		d.get(url);

		//		normal sendKeys
		WebElement emailInput = d.findElement(By.id("email"));
		emailInput.sendKeys("siddharth1807@protonmail.com");

		//		normal sendKeys but append as default
		WebElement emailAppend = d.findElement
				(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		emailAppend.sendKeys("siddhu@gmail.com");

		//		get value of text box by getText or getAttribute
		WebElement emailGetVal = d.findElement(By.xpath
				("/html/body/div/div/div[3]/section/div[3]/div/div/input"));
		String txtVal=emailGetVal.getAttribute("value");
		System.out.println(txtVal);

		//		clear text box
		WebElement clrTxt = d.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/input"));
		clrTxt.clear();

//		disabled or not check
		WebElement dis_txt_chk = d.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input"));
		boolean disTrue = dis_txt_chk.isEnabled();
		System.out.println(disTrue);

	}

}
