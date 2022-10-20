package com.crm.vtigertestcases.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.ExcelFileUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePageClass;
import objectRepository.LoginPageClass;
import objectRepository.TroubleTickPage;

public class TroubleTicketTestCase {
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
		String priority = efu.readDatafromExcelFile("Sheet2", 1, 0);
		String severity = efu.readDatafromExcelFile("Sheet2", 1, 1);
		String category = efu.readDatafromExcelFile("Sheet2", 1, 2);
		
		driver.get(uRl);
		LoginPageClass lpc=new LoginPageClass(driver);
		lpc.loginpage(uName, pWd);
		
		HomePageClass hpc=new HomePageClass(driver);
	    hpc.getTroubleTBtn().click();
	    
	    TroubleTickPage ttp=new TroubleTickPage(driver);
	    ttp.getTroubletickBtn().click();
	    ttp.getTicketTitleTf().sendKeys("we Will do work");
	    ttp.priorityDd(priority);
	    ttp.severityDd(severity);
	    ttp.categoryDd(category);
	    
	    ttp.gettConPlusBtn().click();
	    
	    String parentwindow = wdu.switchToParent();
	    wdu.allHandles(parentwindow);
	    ttp.getConsrchTf().sendKeys("akkupalli");
	    ttp.getConsrchBtn().click();
	    ttp.getConSrchClick().click();
	    
	    driver.switchTo().window(parentwindow);
	    
	    ttp.getsButton().click();;
	    
	    Thread.sleep(3000);
	    hpc.actionOnAdmin(driver);
	    hpc.getSignot().click();
	    driver.close();
}
}
