package com.crm.vtigertestcases.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePageClass;
import objectRepository.LoginPageClass;
import objectRepository.OppurtunitiesPageClass;

public class OppurtunitiesTestCase {
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
		driver.get(uRl);
		LoginPageClass lpc=new LoginPageClass(driver);
		lpc.loginpage(uName, pWd);
		HomePageClass hpc=new HomePageClass(driver);
		hpc.oppurBtn();
		OppurtunitiesPageClass opc=new OppurtunitiesPageClass(driver);
		opc.getOppurPlusBtn().click();
		opc.getOppurName().sendKeys("Chillale");
		opc.getOrgplusBtn().click();
		 String parentWindow = wdu.switchToParent();
         wdu.allHandles(parentWindow);
         opc.getOrgText().sendKeys("Testyantra");;
         opc.getSearchBtn().click();
         opc.getOrgclick().click();
         driver.switchTo().window(parentWindow);
         hpc.actionOnAdmin(driver);
         hpc.getSignot().click();
         
        


}
}
