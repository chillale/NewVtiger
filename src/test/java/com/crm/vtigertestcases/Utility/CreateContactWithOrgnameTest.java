package com.crm.vtigertestcases.Utility;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelFileUtility;
import genericUtility.JavaUtillity;
import genericUtility.WebDriverUtility;
import objectRepository.ContactDetailsPageClass;
import objectRepository.CreateConPageClass;
import objectRepository.HomePageClass;

public class CreateContactWithOrgnameTest extends BaseClass {
	@Test
	public void createConWithOrgnameTest() throws Throwable {
		WebDriverUtility webDriverUtility = new WebDriverUtility(driver);
		ExcelFileUtility efu = new ExcelFileUtility();
		String data = efu.readDatafromExcelFile("Sheet1", 7, 1);
		String data1 = efu.readDatafromExcelFile("Sheet1", 7, 2);
		String data2 = efu.readDatafromExcelFile("Sheet1", 7, 3);
		HomePageClass homePageClass = new HomePageClass(driver);
		homePageClass.conB();

		CreateConPageClass createConPageClass = new CreateConPageClass(driver);
		createConPageClass.createCon();
		ContactDetailsPageClass contactDetailsPageClass = new ContactDetailsPageClass(driver);
		contactDetailsPageClass.firstNameType(data);
		contactDetailsPageClass.firstName(data1);
		contactDetailsPageClass.lastName(data2);
		contactDetailsPageClass.getSelOrg().click();
		String parentWindow = webDriverUtility.switchToParent();
		webDriverUtility.allHandles(parentWindow);
		contactDetailsPageClass.getSrchTxt().sendKeys("amsa"+JavaUtillity.generateRanNum());
		contactDetailsPageClass.getSearchBtn().click();
		contactDetailsPageClass.orgNameClick();
		driver.switchTo().window(parentWindow);
		contactDetailsPageClass.getsButton().click();

//       WebElement conButton=driver.findElement(By.linkText("Contacts"));
//       conButton.click();
//       
//       WebElement plusButton = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
//       plusButton.click();
//       
//       WebElement namedd = driver.findElement(By.name("salutationtype"));

//       webDriverUtility.selectByvalue(namedd, data);
//       
//		WebElement firstNameTf = driver.findElement(By.name("firstname"));
//		firstNameTf.sendKeys(data1);
//
//		WebElement lastNameTf = driver.findElement(By.name("lastname"));
//		lastNameTf.sendKeys(data2);
//
//		WebElement selectorg = driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']"));
//		selectorg.click();
//
//		WebElement orgnameTf = driver.findElement(By.name("search_text"));
//		orgnameTf.sendKeys("amsa");
//
//		WebElement searchButton = driver.findElement(By.name("search"));
//		searchButton.click();
//
//		WebElement orgclick = driver.findElement(By.linkText("amsa"));
//		orgclick.click();
//
//		driver.switchTo().window(parentWindow);
//
//		WebElement saveButton = driver.findElement(By.name("button"));
//		saveButton.click();
	}

}
