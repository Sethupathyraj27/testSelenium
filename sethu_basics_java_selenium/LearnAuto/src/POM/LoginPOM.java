package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPOM {
public static WebElement username(WebDriver d) {
	return d.findElement(By.name("email"));
}
public static WebElement pwd(WebDriver d) {
	return d.findElement(By.name("password"));
}public static WebElement loginBtn(WebDriver d) {
	return d.findElement(By.cssSelector("body > div:nth-child(6) > form.form-signin.form-horizontal.wow.fadeIn.animated.animated > button"));
}

}
