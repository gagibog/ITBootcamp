package metode;

import org.openqa.selenium.WebDriver;
import metode.*;

import excel.elcelUtility;

public class signIn {
	public static void Execute(WebDriver driver) throws Exception {
		
		String sUserName = elcelUtility.getCellData(1, 0);

		String sPassword = elcelUtility.getCellData(1, 1);

		//Home_Page.lnk_MyAccount(driver).click();
System.out.println(sUserName);
		LogInPage.getUserName(driver).sendKeys(sUserName);

		LogInPage.getPassword(driver).sendKeys(sPassword);

		LogInPage.getLogIn(driver).click();
		
		
	}

}
