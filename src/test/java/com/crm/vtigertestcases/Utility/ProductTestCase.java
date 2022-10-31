package com.crm.vtigertestcases.Utility;


import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import objectRepository.ContactDetailsPageClass;
import objectRepository.HomePageClass;
import objectRepository.ProductPageClass;

public class ProductTestCase extends BaseClass {
	 @Test
	 public void productTest() throws Throwable{
		
		PropertyFileUtility pfu=new PropertyFileUtility();
		WebDriverUtility webDriverUtility = new WebDriverUtility(driver);
		
		
		
		HomePageClass hpc = new HomePageClass(driver);
		hpc.productBtn();
		
		ProductPageClass ppc=new ProductPageClass(driver);
		ppc.getProductPlusBtn().click();;
		ppc.getProductNameTf().sendKeys("Sonusood");
		ppc.getCalenderBtn().click();
		 String parentWindow = webDriverUtility.switchToParent();
         webDriverUtility.allHandles(parentWindow);
         ppc.getSelectDate().click();
         driver.switchTo().window(parentWindow);
        ContactDetailsPageClass cdpc = new ContactDetailsPageClass(driver);
        cdpc.getsButton().click();
       Thread.sleep(3000);
         
		

}
}
