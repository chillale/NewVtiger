package com.crm.vtigertestcases.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.ContactDetailsPageClass;
import objectRepository.HomePageClass;
import objectRepository.LoginPageClass;
import objectRepository.ProductPageClass;

public class ProductTestCase {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();  
		WebDriverUtility wdu=new WebDriverUtility(driver);
		wdu.maximize();
		PropertyFileUtility pfu=new PropertyFileUtility();
		String uRl = pfu.readDatafromPropertyFile("url");
		String uName = pfu.readDatafromPropertyFile("username");
		String pWd = pfu.readDatafromPropertyFile("password");
		wdu.implicitlywait();
		driver.get(uRl);
		
		LoginPageClass lpc=new LoginPageClass(driver);
		lpc.loginpage(uName, pWd);
		HomePageClass hpc = new HomePageClass(driver);
		hpc.productBtn();
		
		ProductPageClass ppc=new ProductPageClass(driver);
		ppc.getProductPlusBtn().click();;
		ppc.getProductNameTf().sendKeys("Sonusood");
		ppc.getCalenderBtn().click();
		 String parentWindow = wdu.switchToParent();
         wdu.allHandles(parentWindow);
         ppc.getSelectDate().click();
         driver.switchTo().window(parentWindow);
        ContactDetailsPageClass cdpc = new ContactDetailsPageClass(driver);
        cdpc.getsButton().click();
        hpc.actionOnAdmin(driver);
        hpc.getSignot().click();
        driver.close();
         
		

}
}
