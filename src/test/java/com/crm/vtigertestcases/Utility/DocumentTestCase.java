package com.crm.vtigertestcases.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.DocumentPageClass;
import objectRepository.HomePageClass;
import objectRepository.LoginPageClass;

public class DocumentTestCase {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		WebDriverUtility wdu=new WebDriverUtility(driver);
		wdu.maximize();
		wdu.implicitlywait();
		PropertyFileUtility pfu=new PropertyFileUtility();
		String uRl = pfu.readDatafromPropertyFile("url");
		String uName = pfu.readDatafromPropertyFile("username");
		String pWd = pfu.readDatafromPropertyFile("password");
		driver.get(uRl);
		
		LoginPageClass lpc=new LoginPageClass(driver);
		lpc.loginpage(uName, pWd);
		
		HomePageClass hpc=new HomePageClass(driver);
		hpc.getDocumentsBtn().click();
		
		DocumentPageClass dpc=new DocumentPageClass(driver);
		dpc.getDocumentPlusBtn().click();
		dpc.getTitleTf().sendKeys("Tharun1");
		dpc.getsButton().click();
		Thread.sleep(3000);
		
		hpc.actionOnAdmin(driver);
	    hpc.getSignot().click();
	    driver.close();
		
		
		
		
	}

}
