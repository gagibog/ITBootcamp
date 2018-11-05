package metode;

import org.openqa.selenium.WebDriver;
import excel.elcelUtility;
import konstante.constatnts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class businessTest {
	public static void SetUpBusiness() throws Exception {
		elcelUtility.setExcelFile(constatnts.path_businnesTest +constatnts.file_businnesTest, "Sheet2");
	}

public static String AddNewBusiness(WebDriver driver) throws Exception {
	
	Thread.sleep(1000);
	String bussinessName =elcelUtility.getCellData(1, 0);
	String bussinesCity = elcelUtility.getCellData(1, 2);
	String bussinesStreet = elcelUtility.getCellData(1, 3);
	String bussinesZip = elcelUtility.getCellData(1, 4);
	String registerNumber = elcelUtility.getCellData(1, 5);
	String countryName = elcelUtility.getCellData(1, 1);
	
	
	// bank acc
	String bankName =elcelUtility.getCellData(1, 0);
	String bankAccNum = elcelUtility.getCellData(1, 2);
	String bankSwift = elcelUtility.getCellData(1, 3);
	String bankPayIns = elcelUtility.getCellData(1, 4);
	String bankCurenccy = elcelUtility.getCellData(1, 5);
	
	

	BusinessPage.setBusinessKlik(driver);
	Thread.sleep(2000);
	BusinessPage.setAddNewBussines(driver);
	Thread.sleep(2000);
	BusinessPage.setBussinesName(driver ,bussinessName);
	Thread.sleep(2000);
	BusinessPage.setCountry(driver, countryName);
	Thread.sleep(2000);
	BusinessPage.setBussinesCity(driver, bussinesCity);
	BusinessPage.setBussinesStreet(driver, bussinesStreet);
	Thread.sleep(2000);
	BusinessPage.setBussinesZip(driver, bussinesZip);
	BusinessPage.setBussinesRegNum(driver, registerNumber);
	Thread.sleep(2000);		
	BusinessPage.setAddBankAccount(driver);
	BusinessPage.setBankName(driver, "bankName");
	BusinessPage.setBankAccountNumber(driver, "bankAccNum");
	BusinessPage.setBankSwiftNumber(driver, "bankSwift");
	BusinessPage.setBankPayInstructions(driver, "bankPayIns");
	Thread.sleep(1000);
	BusinessPage.setCurrency(driver, bankCurenccy);
	BusinessPage.setBankAccSave(driver);
	BusinessPage.setSave(driver);	
	
	return "Pass";
}

public static String AddNewBusinessNoName(WebDriver driver) throws Exception {
	
	Thread.sleep(1000);
	//String bussinessName =elcelUtility.getCellData(1, 0);

	String bussinesCity = elcelUtility.getCellData(1, 2);
	String bussinesStreet = elcelUtility.getCellData(1, 3);
	String bussinesZip = elcelUtility.getCellData(1, 4);
	String registerNumber = elcelUtility.getCellData(1, 5);
	String countryName = elcelUtility.getCellData(1, 1);
	
	
	// bank acc
	String bankName =elcelUtility.getCellData(1, 0);
	String bankAccNum = elcelUtility.getCellData(1, 2);
	String bankSwift = elcelUtility.getCellData(1, 3);
	String bankPayIns = elcelUtility.getCellData(1, 4);
	String bankCurenccy = elcelUtility.getCellData(1, 5);
	
	

	BusinessPage.setBusinessKlik(driver);
	Thread.sleep(2000);
	BusinessPage.setAddNewBussines(driver);
	Thread.sleep(2000);
	//BusinessPage.setBussinesName(driver ,bussinessName);
	Thread.sleep(2000);
	BusinessPage.setCountry(driver, countryName);
	Thread.sleep(2000);
	BusinessPage.setBussinesCity(driver, bussinesCity);
	BusinessPage.setBussinesStreet(driver, bussinesStreet);
	Thread.sleep(2000);
	BusinessPage.setBussinesZip(driver, bussinesZip);
	BusinessPage.setBussinesRegNum(driver, registerNumber);
	Thread.sleep(2000);		
	BusinessPage.setAddBankAccount(driver);
	BusinessPage.setBankName(driver, "bankName");
	BusinessPage.setBankAccountNumber(driver, "bankAccNum");
	BusinessPage.setBankSwiftNumber(driver, "bankSwift");
	BusinessPage.setBankPayInstructions(driver, "bankPayIns");
	Thread.sleep(1000);
	BusinessPage.setCurrency(driver, bankCurenccy);
	BusinessPage.setBankAccSave(driver);
	BusinessPage.setSave(driver);	
	
	return "Failed";
}

public static String AddNewBusinessNoCity(WebDriver driver) throws Exception {
	
	Thread.sleep(1000);
	String bussinessName =elcelUtility.getCellData(1, 0);
	//String bussinesCity = elcelUtility.getCellData(1, 2);
	String bussinesStreet = elcelUtility.getCellData(1, 3);
	String bussinesZip = elcelUtility.getCellData(1, 4);
	String registerNumber = elcelUtility.getCellData(1, 5);
	String countryName = elcelUtility.getCellData(1, 1);
	
	
	// bank acc
	String bankName =elcelUtility.getCellData(1, 0);
	String bankAccNum = elcelUtility.getCellData(1, 2);
	String bankSwift = elcelUtility.getCellData(1, 3);
	String bankPayIns = elcelUtility.getCellData(1, 4);
	String bankCurenccy = elcelUtility.getCellData(1, 5);
	
	
	//System.out.println(countryName);
	BusinessPage.setBusinessKlik(driver);
	Thread.sleep(2000);
	BusinessPage.setAddNewBussines(driver);
	Thread.sleep(2000);
	BusinessPage.setBussinesName(driver ,bussinessName);
	Thread.sleep(2000);
	BusinessPage.setCountry(driver, countryName);
	Thread.sleep(2000);
	//BusinessPage.setBussinesCity(driver, bussinesCity);
	BusinessPage.setBussinesStreet(driver, bussinesStreet);
	Thread.sleep(2000);
	BusinessPage.setBussinesZip(driver, bussinesZip);
	BusinessPage.setBussinesRegNum(driver, registerNumber);
	Thread.sleep(2000);		
	BusinessPage.setAddBankAccount(driver);
	BusinessPage.setBankName(driver, "bankName");
	BusinessPage.setBankAccountNumber(driver, "bankAccNum");
	BusinessPage.setBankSwiftNumber(driver, "bankSwift");
	BusinessPage.setBankPayInstructions(driver, "bankPayIns");
	Thread.sleep(1000);
	BusinessPage.setCurrency(driver, bankCurenccy);
	BusinessPage.setBankAccSave(driver);
	BusinessPage.setSave(driver);	
	
	return "Failed";
}








	
}
