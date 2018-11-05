package metode;
import konstante.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	public static WebElement getUserName(WebDriver driver)
	{
		WebElement username = driver.findElement(By.xpath("//input[@id='login-form-email']"));
		return username;
	}
	
	public static WebElement getPassword(WebDriver driver)
	{
		WebElement password = driver.findElement(By.xpath("//input[@id='login-pass']"));
		return password;
	}
	public static WebElement getLogIn(WebDriver driver)
	{
		WebElement logIn = driver.findElement(By.xpath("//div[@class='v-btn__content']"));
		return logIn;
	}
	
	
}
