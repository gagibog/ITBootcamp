package metode;

import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClientPage {

	public static WebElement getNewClient(WebDriver driver) {
		WebElement getNewClientNav = driver.findElement(By.xpath("//a[@id='nav-bar-clients']//div[@class='v-btn__content']"));
		return getNewClientNav;
		}
	public static void setNewClient(WebDriver driver) {
		getNewClient(driver).click();
	}
	
	
	
	
	public static WebElement getAddNewClient(WebDriver driver)
	{
		WebElement addnewC = driver.findElement(By.xpath("//a[@class='primary mt-5 mr-5 v-btn v-btn--flat v-btn--router v-btn--small']//div[@class='v-btn__content']"));
		return addnewC;
	}
	public static void setAddNewClient(WebDriver driver) {
		getAddNewClient(driver).click();
	}
	
	
	
	public static WebElement getClientName(WebDriver driver) {
		WebElement newname = driver.findElement(By.xpath("//*[@id=\"app\"]/div[6]/main/div/div/div[2]/div[2]/div/div[1]/div/form/div[1]/div[1]/div/div[2]/div[1]/div/input"));
		return newname;
		}
	
	public static void setClientName(WebDriver driver, String clientName) {
		getClientName(driver).sendKeys(clientName);
	}
	
	
	public static WebElement getClientContactName(WebDriver driver) {
		WebElement contactname = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[6]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		return contactname;
		}
	public static void setClientContactName(WebDriver driver, String contactName) {
		getClientContactName(driver).sendKeys(contactName);
	}
	
	
	
	
	public static WebElement getEmail(WebDriver driver) {
		WebElement email = driver.findElement(By.xpath("//*[@id=\"app\"]/div[6]/main/div/div/div[2]/div[2]/div/div[1]/div/form/div[2]/div[1]/div/div[2]/div[1]/div/input"));
		return email;
		}
	public static void setEmail(WebDriver driver, String email) {
		getEmail(driver).sendKeys(email);
	}
	
	
	
	public static WebElement getNewRegNum(WebDriver driver) {
		WebElement regnum = driver.findElement(By.xpath("//div[@class='flex xs6']//div[@class='v-input v-text-field v-input--has-state error--text warning--text']//input[@type='text']"));
		return regnum;
		}
	public static void setNewRegNum(WebDriver driver, String regNum) {
		getNewRegNum(driver).sendKeys(regNum);
	}
	
	
	
	
	
	// kantri
	public static void setCountry(WebDriver driver, String countryName) throws InterruptedException
	{   
	Actions builder = new Actions(driver);
	Actions country = builder
	.moveToElement(getCountries(driver))
	.click()
	.sendKeys(countryName);
	country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
	country.perform();
	}
	

private static WebElement getCountries(WebDriver driver) {
	WebElement bizCountry = driver.findElement(By.xpath("//div[@class='v-select__slot']//input[@type='text']"));
	return bizCountry;
}
	
	
	
	
	
	
	
	public static WebElement getNewClientCity(WebDriver driver) {
		WebElement city = driver.findElement(By.xpath("//*[@id=\"app\"]/div[6]/main/div/div/div[2]/div[2]/div/div[1]/div/form/div[3]/div[2]/div/div[2]/div[1]/div/input"));
		return city;
		}
	public static void setNewClientCity(WebDriver driver, String newCity) {
		getNewClientCity(driver).sendKeys(newCity);
	}
	
	
	
	
	
	public static WebElement getNewClientStreet(WebDriver driver) {
		WebElement street = driver.findElement(By.xpath("//*[@id=\"app\"]/div[6]/main/div/div/div[2]/div[2]/div/div[1]/div/form/div[3]/div[3]/div/div[2]/div[1]/div/input"));
		return street;
		}
	public static void setNewClientStreet(WebDriver driver, String newStreet) {
		getNewClientStreet(driver).sendKeys(newStreet);
	}
	
	
	
	

	public static WebElement getNewClientZip(WebDriver driver) {
		WebElement zip = driver.findElement(By.xpath("//*[@id=\"app\"]/div[6]/main/div/div/div[2]/div[2]/div/div[1]/div/form/div[3]/div[4]/div/div[2]/div[1]/div/input"));
		return zip;
		}
	public static void setNewClientZip(WebDriver driver, String newZip) {
		 getNewClientZip(driver).sendKeys(newZip);
	}
	

	
	
	// add date
	
	
	
	
	
	
	
	public static WebElement getNewClientCode(WebDriver driver) {
		WebElement code = driver.findElement(By.xpath("//*[@id=\"app\"]/div[6]/main/div/div/div[2]/div[2]/div/div[1]/div/form/div[4]/div[2]/div/div[2]/div[1]/div/input"));
		return code;
		}
	
	public static void setNewClientCode(WebDriver driver, String clientCode) {
		getNewClientCode(driver).sendKeys(clientCode);
	}
	
	

	
	//status
	
	
	public static WebElement getNewClientSave(WebDriver driver) {
		WebElement save = driver.findElement(By.xpath("//div[contains(text(),'Save')]"));
		return save;
		}
	
	
	

}
