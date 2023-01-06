package mavenPK;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven {

	public static void main(String[] args) throws  IOException, InterruptedException, BiffException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\Siddhu_jarFiles\\chromedriver.exe");
WebDriver d = new ChromeDriver();
String site = "https://www.flipkart.com/";
d.get(site);


FileInputStream fl = new FileInputStream("E:\\flipkart2.xls");
Workbook wb = Workbook.getWorkbook(fl);
Sheet s = wb.getSheet(0);
int rc = s.getRows();
for(int i=1;i<rc;i++){
	String uname = s.getCell(0,i).getContents();
	String pwd = s.getCell(1,i).getContents();
	
	d.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"))
	.sendKeys(uname);
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"))
	.sendKeys(pwd);
	Thread.sleep(1000);

	d.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div._1D1L_j > button"))
	.click();
	Thread.sleep(1000);

	Actions a = new Actions (d);
	WebElement fkHover = d.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div"));
	a.moveToElement(fkHover).perform();
	Thread.sleep(3000);
	d.findElement(By.linkText("Logout")).click();
	
	Thread.sleep(1000);
	
}
d.close();
}
}
