package com.crm.vtigertestcases.Utility;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;

public class CreateorganisationTest {
	@Test
	public void createOrganisationTest() throws Throwable{
		WebDriver driver=new ChromeDriver();
//		WebDriverUtility wdu=new WebDriverUtility(driver);
		WebDriverUtility wdu=new WebDriverUtility(driver);
		wdu.maximize();
		PropertyFileUtility pfu=new PropertyFileUtility();
		String uRl = pfu.readDatafromPropertyFile("url");
		String uName = pfu.readDatafromPropertyFile("username");
		String pWd = pfu.readDatafromPropertyFile("password");
		
		
		ExcelFileUtility efu=new ExcelFileUtility();
		String orgName1 = efu.readDatafromExcelFile("Sheet1", 4, 4);
		//String orgName2 = efu.readDatafromExcelFile("Sheet1", 9, 1);
		
		driver.get(uRl);
		wdu.implicitlywait();
		WebElement userName=driver.findElement(By.name("user_name"));
		userName.sendKeys(uName);
		
		WebElement pwd = driver.findElement(By.name("user_password"));
		pwd.sendKeys(pWd);
		
		WebElement loginButton = driver.findElement(By.id("submitButton"));
		loginButton.click();
		
		WebElement orgclick = driver.findElement(By.linkText("Organizations"));
		orgclick.click();
		
		WebElement searchOrgName = driver.findElement(By.className("txtBox"));
		searchOrgName.sendKeys(orgName1);
		
		 driver.findElement(By.xpath("//select[@name='search_field']/option[2]"));
		//wdu.selectByvalue(orgNameDd, orgName2);
		 Thread.sleep(2000);
		
		WebElement searchNow = driver.findElement(By.name("submit"));
		searchNow.click();
		
		WebElement orgName = driver.findElement(By.linkText("Testyantra"));
		orgName.click();
		
		String data=driver.findElement(By.className("dvHeaderText")).getText();
		String data1="Testyantra";
		System.out.println(data.contains(data1));
		WebElement ele=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		wdu.mouseoverAction(ele);
		
		WebElement signOut = driver.findElement(By.xpath("//a[text()='Sign Out']"));
		signOut.click();
		Thread.sleep(3000);
		driver.close();

		
	    
	}

}
