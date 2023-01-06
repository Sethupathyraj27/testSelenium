package seleBasicsSiddhu;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DD {

	public static void main(String[] args) throws  IOException, InterruptedException, BiffException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\Siddhu_jarFiles\\chromedriver.exe");
WebDriver d = new ChromeDriver();
String site = "http://www.brm.tremplintech.in/web_pages/login.aspx";
d.get(site);

FileInputStream fl = new FileInputStream("C:\\Users\\123\\Desktop\\wrongUsers.xls");
Workbook wb = Workbook.getWorkbook(fl);
Sheet s = wb.getSheet(0);
int rowCount = s.getRows();
for(int i=1;i<rowCount;i++){
	String uName = s.getCell(0,i).getContents();
	String pwd = s.getCell(1,i).getContents();
	
	d.findElement(By.xpath("//*[@id='txt_unam']")).sendKeys("");
	d.findElement(By.xpath("//*[@id='txt_unam']")).sendKeys(uName);
	d.findElement(By.xpath("//*[@id='txt_pass']")).sendKeys("");
	d.findElement(By.xpath("//*[@id='txt_pass']")).sendKeys(pwd);
	
	d.findElement(By.cssSelector("#Button3")).click();
	Thread.sleep(2000);
	
	d.switchTo().alert().accept();
	
//	d.findElement(By.xpath("//*[@id='LinkButton1']")).click();
	
}


}
}
