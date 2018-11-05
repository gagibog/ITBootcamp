package metode;

import org.openqa.selenium.By;
import testData.*;
import metode.businessTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BusinessPage {
	//private static WebElement element;
	public static WebElement getBusinessKlik(WebDriver driver) {
		WebElement BusinessClick = driver.findElement(By.xpath("//*[@id='nav-bar-business']/div"));
		return BusinessClick;
	}
		public static void setBusinessKlik(WebDriver driver) {
		getBusinessKlik(driver).click();
	}
	
	
	
	public static WebElement getAddNewBussines(WebDriver driver)
	{
		WebElement addnewBiz = driver.findElement(By.xpath("//*[@id=\"add-new-business\"]/div"));
		return addnewBiz;
	}
		public static void setAddNewBussines(WebDriver driver) {
			getAddNewBussines(driver).click();
		}
	
	
	
	public static WebElement getBussinesName(WebDriver driver)
	{
		WebElement bizName = driver.findElement(By.xpath("//input[@id='business-form-name']"));
		return bizName;
	}
		public static void setBussinesName(WebDriver driver, String bussinesName) {
			getBussinesName(driver).sendKeys(bussinesName);
		}
	
	
	// kantris
	
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
		WebElement bizCountry = driver.findElement(By.xpath("//input[@id='business-form-country']"));
		return bizCountry;
	}
	
	
	
	
	public static WebElement getBussinesCity(WebDriver driver)
	{
		WebElement bizCity = driver.findElement(By.xpath("//input[@id='business-form-city']"));
		return bizCity;
	}
		public static void setBussinesCity(WebDriver driver, String bussinesCity) {
			getBussinesCity(driver).sendKeys(bussinesCity);
		}
	
	
	
	public static WebElement getBussinesStreet(WebDriver driver)
	{
		WebElement bizStreet = driver.findElement(By.xpath("//input[@id='business-form-street']"));
		return bizStreet;
	}
		public static void setBussinesStreet(WebDriver driver, String bussinesStreet) {
			getBussinesStreet(driver).sendKeys(bussinesStreet);
		}
	
	
	
	
	public static WebElement getBussinesZip(WebDriver driver)
	{
		WebElement bizZip = driver.findElement(By.id("business-form-zip"));
		return bizZip;
	}
		public static void setBussinesZip(WebDriver driver,String bussinesZip) {
			getBussinesZip(driver).sendKeys("" +bussinesZip);
		}
	
	
		
	public static WebElement getBussinesRegNum(WebDriver driver)
	{
		WebElement bizRegNum = driver.findElement(By.xpath("//input[@id='business-form-reg-num']"));
		return bizRegNum;
	}
		public static void setBussinesRegNum(WebDriver driver,String registerNumber) {
			getBussinesRegNum(driver).sendKeys(""+registerNumber);
		}
	
	
	public static WebElement getAddBankAccount(WebDriver driver)
	{
		WebElement bizAddBankA = driver.findElement(By.xpath("//button[@id='business-form-add-bank-btn']//div[@class='v-btn__content']"));
		return bizAddBankA;
	}
		public static void setAddBankAccount(WebDriver driver) {
			getAddBankAccount(driver).click();
		}
		
	
	public static WebElement getBankName(WebDriver driver) {
	WebElement bankName = driver.findElement(By.xpath("//input[@id='bank-dialog-name']"));
	return bankName;
	}
		public static void setBankName(WebDriver driver, String bankName) {
			getBankName(driver).sendKeys(bankName);
		}
	
	
	public static WebElement getBankAccountNumber(WebDriver driver) {
		WebElement bankAccNum = driver.findElement(By.xpath("//input[@id='bank-dialog-num']"));
		return bankAccNum;
		}
		public static void setBankAccountNumber(WebDriver driver, String accountNumber) {
			getBankAccountNumber(driver).sendKeys(accountNumber);
		}
	
	
	public static WebElement getBankSwiftNumber(WebDriver driver) {
		WebElement bankSwNum = driver.findElement(By.xpath("//input[@id='bank-dialog-swf-num']"));
		return bankSwNum;
		}
		public static void setBankSwiftNumber(WebDriver driver, String swiftNumber) {
			getBankSwiftNumber(driver).sendKeys(swiftNumber);
		}
	
	
	
	 public static WebElement getBankPayInstructions(WebDriver driver) {
		 WebElement bankPayIns = driver.findElement(By.xpath("//textarea[@id='bank-dialog-pay-inst']"));
		 return bankPayIns;
	 }
	 	public static void setBankPayInstructions(WebDriver driver, String payInstructions) {
	 		getBankPayInstructions(driver).sendKeys(payInstructions);
	 	}
	
	 	
	 
	 //kurensi
	 public static WebElement getCurrency(WebDriver driver)	{
		 WebElement currency = driver.findElement(By.xpath("//div[@class='v-select__selections']"));
		 return currency;
	 }
	 
	 	
	 	
	 	
	 	
	 	
	 public static void setCurrency(WebDriver driver, String currencyValue) throws InterruptedException
		{   
		Actions builder = new Actions(driver);
		Actions currency = builder
		.moveToElement(getCurrency(driver))
		.click()
		.sendKeys(currencyValue)
		.click();
		currency.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
		currency.perform();
		}
		
	 	
	 
	 	

	 
	public static WebElement getBankAccSave(WebDriver driver) {
		 WebElement accSave = driver.findElement(By.xpath("//div[contains(text(),'Add bank account')]"));
		 return accSave;
	 }
	 	public static void setBankAccSave(WebDriver driver) {
	 		getBankAccSave(driver).click();
	 	}
	 
	 
	 public static WebElement getBankAccCancel(WebDriver driver) {
		 WebElement bankCancel = driver.findElement(By.xpath("//div[contains(text(),'Cancel')]"));
		 return bankCancel;
	 }
	 	public static void setBankAccCancel(WebDriver driver) {
	 		getBankAccCancel(driver).click();
	 	}
	
	 
	 
	 
	 public static WebElement getSave(WebDriver driver) {
		 WebElement bizSave = driver.findElement(By.xpath("//div[contains(text(),'Save')]"));
		 return bizSave;
	 }
	 	public static void setSave(WebDriver driver) {
	 		getSave(driver).click();
	 	}
	
	
	
	
	
	
	}

