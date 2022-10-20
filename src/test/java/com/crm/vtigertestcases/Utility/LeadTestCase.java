package com.crm.vtigertestcases.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.ExcelFileUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePageClass;
import objectRepository.LeadPageClass;
import objectRepository.LoginPageClass;

public class LeadTestCase {
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
		String data = efu.readDatafromExcelFile("Sheet1", 11, 1);
		String data1 = efu.readDatafromExcelFile("Sheet1", 11, 2);
		
		driver.get(uRl);
		LoginPageClass lpc=new LoginPageClass(driver);
		lpc.loginpage(uName, pWd);
		HomePageClass hpc=new HomePageClass(driver);
		hpc.leadB();
		
		LeadPageClass lpc1=new LeadPageClass(driver);
		lpc1.getLeadPlusBtn().click();
		lpc1.leadPageDetails();
		
		lpc1.leadSrcType(data);
		lpc1.industryType(data1);
		lpc1.getPhoneTf().sendKeys("8374514165");
		lpc1.getMobileTf().sendKeys("9502976146");
		lpc1.getEmailTf().sendKeys("Chillale@gmail.com");
		lpc1.getSaveButton().click();
		
		Thread.sleep(3000);
		
		
		
		hpc.actionOnAdmin(driver);
		hpc.getSignot().click();
		driver.close();
		
	}

}
