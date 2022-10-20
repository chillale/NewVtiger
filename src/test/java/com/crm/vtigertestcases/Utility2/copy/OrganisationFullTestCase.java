package com.crm.vtigertestcases.Utility2.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.ExcelFileUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.ContactDetailsPageClass;
import objectRepository.CreateConPageClass;
import objectRepository.HomePageClass;
import objectRepository.LoginPageClass;

public class OrganisationFullTestCase {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();  
		WebDriverUtility wdu=new WebDriverUtility(driver);
		
		wdu.maximize();
		wdu.implicitlywait();
		
		PropertyFileUtility pfu=new PropertyFileUtility();
		String uRl = pfu.readDatafromPropertyFile("url");
		String uName = pfu.readDatafromPropertyFile("username");
		String pWd = pfu.readDatafromPropertyFile("password");
		ExcelFileUtility efu=new ExcelFileUtility();
		
		String firstNameType = efu.readDatafromExcelFile("Sheet1", 0, 0);
		String fName = efu.readDatafromExcelFile("Sheet1", 0, 1);
		String lName = efu.readDatafromExcelFile("Sheet1", 0, 2);
		String orgName = efu.readDatafromExcelFile("Sheet1", 0, 3);
		String leadsrcType= efu.readDatafromExcelFile("Sheet1", 0, 4);
		String titleName = efu.readDatafromExcelFile("Sheet1", 0, 5);
		String departmentName = efu.readDatafromExcelFile("Sheet1", 0, 6);
		String emailName = efu.readDatafromExcelFile("Sheet1", 0, 7);
		String assistantName = efu.readDatafromExcelFile("Sheet1", 0, 8);
		String assistantPhn = efu.readDatafromExcelFile("Sheet1", 1, 0);
		String officePhn = efu.readDatafromExcelFile("Sheet1", 1, 1);
		String mobile = efu.readDatafromExcelFile("Sheet1", 1, 2);
		String homePhone = efu.readDatafromExcelFile("Sheet1", 1, 3);
		String otherPhone = efu.readDatafromExcelFile("Sheet1", 1, 4);
		
		driver.get(uRl);
		LoginPageClass lpc=new LoginPageClass(driver);
		lpc.loginpage(uName, pWd);
		HomePageClass hpc=new HomePageClass(driver);
		hpc.conB();
		
		CreateConPageClass ccpc=new CreateConPageClass(driver);
		ccpc.createCon();
		
		ContactDetailsPageClass cdpc=new ContactDetailsPageClass(driver);
		cdpc.firstNameType(firstNameType);
		cdpc.firstName(fName);
		cdpc.lastName(lName);
		cdpc.orgClick();
		String parentWindow = wdu.switchToParent();
		wdu.allHandles(parentWindow);
		cdpc.getSrchTxt().sendKeys(orgName);
		 cdpc.searchClick();
         Thread.sleep(3000);
         cdpc.orgNameClick(); 
         driver.switchTo().window(parentWindow);
		cdpc.leadSrcType(leadsrcType);
		cdpc.getTitleTf().sendKeys(titleName);
		cdpc.getDepartmentTf().sendKeys(departmentName);
		cdpc.getEmailTf().sendKeys(emailName);
		cdpc.getAssistantTf().sendKeys(assistantName);
		cdpc.getAssistantPhnTf().sendKeys(assistantPhn);
		cdpc.getOfficePhnTf().sendKeys(officePhn);
		cdpc.getMobileTf().sendKeys(mobile);
		cdpc.getHomePhoneTf().sendKeys(homePhone);
		cdpc.getOtherPhoneTf().sendKeys(otherPhone);
		cdpc.sBtn();
		Thread.sleep(3000);;
		cdpc.signout(driver);
		driver.close();
		
		
		
		
		
	}

}
