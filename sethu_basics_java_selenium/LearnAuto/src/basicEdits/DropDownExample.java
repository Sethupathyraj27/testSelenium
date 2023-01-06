package basicEdits;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Siddhu_jarFiles\\geckodriver.exe");
		WebDriver d =new FirefoxDriver();

		String url = "http://leafground.com/pages/Dropdown.html";
		d.get(url);

//		 Drop down by index - first drop down
		
		WebElement selectOpt1 = d.findElement
				(By.xpath("//select[@id='dropdown1']"));
		Select choose = new Select(selectOpt1);
		choose.selectByIndex(2);
		choose.selectByValue("1");
		choose.selectByVisibleText("Selenium");

//		second dropdown
		
		WebElement  selectopt2 = d.findElement
				(By.xpath("/html/body/div/div/div[3]/section/div[2]/select"));
		Select choose2 = new Select(selectopt2);
		choose2.selectByValue("3");
		Thread.sleep(3000);
		selectopt2.sendKeys("Loadrunner");
		Thread.sleep(3000);
		
//		third drop down
		
		WebElement thirdDD = 
				d.findElement(By.xpath("//select[@id='dropdown3']"));
		Select select3rdDD = new Select(thirdDD);
		List<WebElement>thirdOptions = select3rdDD.getOptions();
		int thirdrd_dropDown_size = thirdOptions.size();
		System.out.println("Third drop down size is: "+thirdrd_dropDown_size);

//		dropdown size(length) by creating a list
		
		WebElement selectOpt3 = d.findElement
				(By.xpath("//select[@id='dropdown3']"));
		Select listOpt = new Select(selectOpt3);
		List<WebElement> lisOpt = listOpt.getOptions();
		int size = lisOpt.size();
		System.out.println("third dd list size is: "+size);
		
		
//		list selection
		
		WebElement fourthDD = d.findElement
				(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select DDlist = new Select (fourthDD);
		DDlist.selectByIndex(0);
		DDlist.selectByIndex(1);
		DDlist.selectByIndex(3);
		Thread.sleep(2000);
		
		
		d.close();

}
}
