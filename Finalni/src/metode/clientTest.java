package metode;
import org.openqa.selenium.WebDriver;
import excel.elcelUtility;
import konstante.constatnts;
import metode.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class clientTest {
	public static void SetUpClients() throws Exception {
		elcelUtility.setExcelFile(constatnts.path_clientsTest +constatnts.file_clientsTest, "Sheet1");
	}
	public static String AddNewClient(WebDriver driver) throws Exception {
		Thread.sleep(1000);
		String clientsName = elcelUtility.getCellData(1, 0);
		String clientConName = elcelUtility.getCellData(1, 1);
		String clientEmail = elcelUtility.getCellData(2, 1);
		String clientRegNum = elcelUtility.getCellData(3, 3);
		String clientCountry = elcelUtility.getCellData(4, 1);
		String clientCity = elcelUtility.getCellData(5, 1);
		String clientStreet = elcelUtility.getCellData(6, 1);
		String clientZip = elcelUtility.getCellData(7, 1);
		//String clientAddDay = elcelUtility.getCellData(1, 8);
		String clientCode = elcelUtility.getCellData(9, 1);
		//String clientAggDay = elcelUtility.getCellData(1, 10);
		
		
		ClientPage.setNewClient(driver);
		Thread.sleep(1000);
		ClientPage.setAddNewClient(driver);
		Thread.sleep(1000);
		ClientPage.setClientName(driver, clientsName);
		Thread.sleep(1000);
		ClientPage.setClientContactName(driver, clientConName);
		Thread.sleep(3000);
		ClientPage.setEmail(driver, clientEmail);
		Thread.sleep(3000);
		ClientPage.setNewRegNum(driver, clientRegNum);
		Thread.sleep(2000);
		ClientPage.setCountry(driver, clientCountry);
		Thread.sleep(2000);
		ClientPage.setNewClientCity(driver, clientCity);
		Thread.sleep(2000);
		ClientPage.setNewClientStreet(driver, clientStreet);
		Thread.sleep(2000);
		ClientPage.setNewClientZip(driver, clientZip);
		Thread.sleep(2000);
		//ClientPage.setDateAdded(driver, clientAddDay);
		Thread.sleep(2000);
		ClientPage.setNewClientCode(driver, clientCode);
		Thread.sleep(2000);
		//ClientPage.setAgreementDay(driver, clientAggDay);
		Thread.sleep(2000);
		
		
		return"Pass";
		
	}
 	
	
	
	
}
