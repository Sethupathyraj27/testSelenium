package POM_Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPomFlipkart {
//		WebDriver d;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
public static WebElement userName;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
public static WebElement pwd;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
public static WebElement loginBtn;
}
