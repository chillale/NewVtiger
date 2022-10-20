package com.crm.vtigertestcases.Utility2.copy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import genericUtility.ExcelFileUtility;
import genericUtility.JavaUtillity;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import objectRepository.HomePageClass;
import objectRepository.LoginPageClass;
import objectRepository.OrganisationDetailsPageClass;
import objectRepository.OrganisationInfoPageClass;
import objectRepository.OrganisationPageClass;

public class CreateorganisationwithIndustrytypeTest {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wdu=new WebDriverUtility(driver);
		wdu.maximize();
		wdu.implicitlywait();
		PropertyFileUtility pfu=new PropertyFileUtility();
		String uRl = pfu.readDatafromPropertyFile("url");
		String uName = pfu.readDatafromPropertyFile("username");
		String pWd = pfu.readDatafromPropertyFile("password");
		ExcelFileUtility efu=new ExcelFileUtility();
		String indType = efu.readDatafromExcelFile("sheet1", 4, 2);
		
		driver.get(uRl);
		LoginPageClass lpc=new LoginPageClass(driver);
		lpc.loginpage(uName, pWd);
		
    String orgname1="amsa1"+JavaUtillity.generateRanNum();
        HomePageClass hpc=new HomePageClass(driver);
        hpc.orgB();
        OrganisationPageClass opc=new OrganisationPageClass(driver);
        opc.newOrgBtn();
        
        OrganisationDetailsPageClass odp=new OrganisationDetailsPageClass(driver);
        odp.orgPageDetails(orgname1, indType);
        
        OrganisationInfoPageClass oipc = new OrganisationInfoPageClass(driver);
        
		if(oipc.gethText1().contains(orgname1))
		{
			System.out.println("validation successful");
		}
		else
		{
			System.out.println("validation not successful");
		}
  
		opc.signout(driver);	     
	      driver.close();
		
	}


}
