package com.crm.vtiger.testcases;


import org.testng.annotations.Test;
import genericUtility.BaseClass;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.ContactDetailsPageClass;
import objectRepository.CreateConPageClass;
import objectRepository.HomePageClass;

public class CreateContactWithOrgNameTest extends BaseClass {

	@Test(groups = "smoke")
	public void createConWithOrgNametest() throws Throwable {
	   
		WebDriverUtility webDriverUtility = new WebDriverUtility(driver);
		HomePageClass homePageClass = new HomePageClass(driver);
		homePageClass.conB();
		CreateConPageClass createConPageClass = new CreateConPageClass(driver);
		createConPageClass.createCon();
		ContactDetailsPageClass contactDetailsPageClass = new ContactDetailsPageClass(driver);
		contactDetailsPageClass.firstName("Mr.");

		contactDetailsPageClass.firstName("Bahubali");
		contactDetailsPageClass.lastName("Amarendra");
		contactDetailsPageClass.getSelOrg().click();

		String parentwin = webDriverUtility.switchToParent();
		webDriverUtility.allHandles(parentwin);
		contactDetailsPageClass.getSrchTxt().sendKeys("amsa");
		contactDetailsPageClass.getSearchBtn().click();
		contactDetailsPageClass.getCompanyNameClick().click();
		driver.switchTo().window(parentwin);
		contactDetailsPageClass.getsButton().click();
		Thread.sleep(3000);

	}

}
