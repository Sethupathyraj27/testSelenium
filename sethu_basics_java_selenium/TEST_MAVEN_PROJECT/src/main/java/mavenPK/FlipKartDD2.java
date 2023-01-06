package mavenPK;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class FlipKartDD2 {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Siddhu_jarFiles\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");

		FileInputStream file = new 
				FileInputStream("E:\\Siddhu_jarFiles\\dataDrivenExcelFiles\\flipKart.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet s = wb.getSheet(1);
		int rowCounts = s.getRows();

		//		looping excel data

		for(int i=1;i<rowCounts;i++) {
			String uname=s.getCell(0,i).getContents();
			String pass=s.getCell(1,i).getContents();
			Thread.sleep(2000);
			
			System.out.println("row count"+rowCounts);
			
			d.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"))
			.sendKeys(uname);
			d.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).
			sendKeys(pass);
			WebElement loginBtn = d.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div._1D1L_j > button"));
			loginBtn.click();
			Thread.sleep(2000);
			Actions act = new Actions(d);	
			WebElement hoverBtn = d.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div"));
			act.moveToElement(hoverBtn).perform();
			Thread.sleep(2000);
			WebElement logOut=d.findElement(By.linkText("Logout"));
			logOut.click();

		}
		d.close();
	}
}
