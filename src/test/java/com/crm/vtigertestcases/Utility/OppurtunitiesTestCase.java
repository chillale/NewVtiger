package com.crm.vtigertestcases.Utility;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.WebDriverUtility;
import objectRepository.HomePageClass;
import objectRepository.OppurtunitiesPageClass;

public class OppurtunitiesTestCase extends BaseClass {
	
	@Test
	public void oppurtunitiestest() throws Throwable{
		WebDriverUtility webDriverUtility = new WebDriverUtility(driver);
		
		HomePageClass hpc=new HomePageClass(driver);
		hpc.oppurBtn();
		OppurtunitiesPageClass opc=new OppurtunitiesPageClass(driver);
		opc.getOppurPlusBtn().click();
		opc.getOppurName().sendKeys("Chillale");
		opc.getOrgplusBtn().click();
		 String parentWindow = webDriverUtility.switchToParent();
         webDriverUtility.allHandles(parentWindow);
         opc.getOrgText().sendKeys("Testyantra");;
         opc.getSearchBtn().click();
         opc.getOrgclick().click();
         driver.switchTo().window(parentWindow);
         opc.getSaveBtn().click();
         Thread.sleep(3000);
         
        


}
}
