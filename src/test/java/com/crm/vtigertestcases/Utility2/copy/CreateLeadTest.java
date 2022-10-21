package com.crm.vtigertestcases.Utility2.copy;




import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelFileUtility;

import objectRepository.HomePageClass;
import objectRepository.LeadPageClass;


public class CreateLeadTest extends BaseClass {
	@Test
	public void createLeadTest() throws Throwable
	{
		
		ExcelFileUtility efu=new ExcelFileUtility();
		String data = efu.readDatafromExcelFile("Sheet1", 10, 0);
		String data1=efu.readDatafromExcelFile("Sheet1", 10, 1);
		String data2 = efu.readDatafromExcelFile("Sheet1", 10, 2);
		String data3 = efu.readDatafromExcelFile("Sheet1", 10, 3);
		String data4 = efu.readDatafromExcelFile("Sheet1", 10, 4);
		String data5 = efu.readDatafromExcelFile("Sheet1", 10, 5);
		HomePageClass homePageClass = new HomePageClass(driver);
		homePageClass.leadB();
		LeadPageClass leadPageClass = new LeadPageClass(driver);
		leadPageClass.getLeadPlusBtn().click();
		leadPageClass.nameType(data);
		leadPageClass.getFirstName().sendKeys(data1);
		leadPageClass.getLastName().sendKeys(data2);
		leadPageClass.getCompanyName().sendKeys(data3);
		leadPageClass.leadSrcType(data4);
		leadPageClass.industryType(data5);
		leadPageClass.getSaveButton().click();
		Thread.sleep(3000);
        
//        WebElement leadButton = driver.findElement(By.linkText("Leads"));
//        leadButton.click();
        
//        WebElement plusButton = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
//        plusButton.click();
//        
//        WebElement leadDd = driver.findElement(By.name("salutationtype"));
//        webdriverUtility.selectByvalue(leadDd, data);
//        
//        WebElement fName = driver.findElement(By.name("firstname"));
//        fName.sendKeys(data1);
//        
//        WebElement lName = driver.findElement(By.name("lastname"));
//        lName.sendKeys(data2);
//        
//        WebElement cName = driver.findElement(By.name("company"));
//        cName.sendKeys(data3);
//        
//        WebElement leadsrcDd = driver.findElement(By.name("leadsource"));
//        webdriverUtility.selectByvalue(leadsrcDd, data4);
//        
//        WebElement indDd = driver.findElement(By.name("industry"));
//        webdriverUtility.selectByvalue(indDd, data5);
//        
//        WebElement saveButton = driver.findElement(By.name("button"));
//        saveButton.click();
//        
      
	     
        
        
        
        
	}

}
