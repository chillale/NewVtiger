package com.crm.vtigertestcases.Utility;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.ExcelFileUtility;
import genericUtility.JavaUtillity;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;

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
		
		WebElement name=driver.findElement(By.name("user_name"));
		name.sendKeys(uName);
		
	    WebElement pwd=driver.findElement(By.name("user_password"));
	    pwd.sendKeys(pWd);
	    
        WebElement	loginButton=driver.findElement(By.id("submitButton"));
        loginButton.click();
        String orgname1="Testyantra solutions"+JavaUtillity.generateRanNum();
        
        WebElement orgclick=driver.findElement(By.xpath("//a[text()='Organizations']"));
        orgclick.click();
        
        WebElement createorgclick=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
        createorgclick.click();
        
        WebElement orgname=driver.findElement(By.name("accountname"));
        orgname.sendKeys(orgname1);
        
        WebElement indnameDd=driver.findElement(By.name("industry"));
		wdu.selectByvalue(indnameDd, indType);
		
		WebElement savebutton=driver.findElement(By.name("button"));
		savebutton.click();
		
		Thread.sleep(3000);
		
//		WebElement orgname2=driver.findElement(By.xpath("//a[text()='Testyantra']"));
//		orgname2.click();
		String orgnametext=driver.findElement(By.className("dvHeaderText")).getText();
		if(orgnametext.contains(orgname1))
		{
			System.out.println("validation successful");
		}
		else
		{
			System.out.println("validation not successful");
		}
	      WebElement admdd=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	      wdu.mouseoverAction(admdd);
	      
	       WebElement signout = driver.findElement(By.xpath("//a[text()='Sign Out']"));

	      signout.click();
	     
	      
	      driver.close();
		
	}


}
