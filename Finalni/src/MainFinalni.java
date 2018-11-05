import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import metode.*;
import konstante.*;
import excel.*;

public class MainFinalni {

	//private static WebDriver driver = null;
	public static void main(String[] args) throws Exception {

System.setProperty("webdriver.chrome.driver", "/Users/milos/Desktop/chromedriver");
		String message ="";
		WebDriver driver = new ChromeDriver();
		
		elcelUtility.setExcelFile(constatnts.path_TestData+constatnts.file_TestData, "Sheet1");
		
		driver.get(konstante.constatnts.URL);
		
		signIn.Execute(driver);
		Thread.sleep(2000);
//		BusinessPage.getBusinessKlik(driver).click();
//		Thread.sleep(2000);
//		BusinessPage.getAddNewBussines(driver).click();
//		Thread.sleep(2000);
//	
		elcelUtility.setExcelFile(constatnts.path_businnesTest +constatnts.file_businnesTest, "Sheet1");		
		message = businessTest.AddNewBusiness(driver);
		System.out.println("AddNewBusiness :" + message);
		message= businessTest.AddNewBusinessNoName(driver);
		System.out.println("AddNewBusinessNoName :" + message);
		message = businessTest.AddNewBusinessNoCity(driver);
		System.out.println("AddNewBusinessNoCity :" + message);
		
		
		
		
//		elcelUtility.setExcelFile(constatnts.path_clientsTest +constatnts.file_clientsTest, "Sheet1");
//		message = clientTest.AddNewClient(driver);
//		System.out.println("AddNewClient :" + message);
		
		driver.close();
		driver.quit();
	
	
	
		
	}

}
