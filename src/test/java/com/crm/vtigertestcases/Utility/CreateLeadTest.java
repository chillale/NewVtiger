package com.crm.vtigertestcases.Utility;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadTest {
	@Test
	public void createLeadTest() throws Throwable{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wdu=new WebDriverUtility(driver);
		wdu.maximize();
		PropertyFileUtility pfu=new PropertyFileUtility();
		String uRl = pfu.readDatafromPropertyFile("url");
		String uName = pfu.readDatafromPropertyFile("username");
		String pWd = pfu.readDatafromPropertyFile("password");
		ExcelFileUtility efu=new ExcelFileUtility();
		String data = efu.readDatafromExcelFile("Sheet1", 10, 0);
		String data1=efu.readDatafromExcelFile("Sheet1", 10, 1);
		String data2 = efu.readDatafromExcelFile("Sheet1", 10, 2);
		String data3 = efu.readDatafromExcelFile("Sheet1", 10, 3);
		String data4 = efu.readDatafromExcelFile("Sheet1", 10, 4);
		String data5 = efu.readDatafromExcelFile("Sheet1", 10, 5);
		
		driver.get(uRl);
		
		wdu.implicitlywait();
		WebElement name=driver.findElement(By.name("user_name"));
		name.sendKeys(uName);
		
	    WebElement pwd=driver.findElement(By.name("user_password"));
	    pwd.sendKeys(pWd);
	    
        WebElement	loginButton=driver.findElement(By.id("submitButton"));
        loginButton.click();
        
        WebElement leadButton = driver.findElement(By.linkText("Leads"));
        leadButton.click();
        
        WebElement plusButton = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
        plusButton.click();
        
        WebElement leadDd = driver.findElement(By.name("salutationtype"));
        wdu.selectByvalue(leadDd, data);
        
        WebElement fName = driver.findElement(By.name("firstname"));
        fName.sendKeys(data1);
        
        WebElement lName = driver.findElement(By.name("lastname"));
        lName.sendKeys(data2);
        
        WebElement cName = driver.findElement(By.name("company"));
        cName.sendKeys(data3);
        
        WebElement leadsrcDd = driver.findElement(By.name("leadsource"));
        wdu.selectByvalue(leadsrcDd, data4);
        
        WebElement indDd = driver.findElement(By.name("industry"));
        wdu.selectByvalue(indDd, data5);
        
        WebElement saveButton = driver.findElement(By.name("button"));
        saveButton.click();
        
        WebElement admdd=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
        wdu.mouseoverAction(admdd);
        
        
	      WebElement signout=driver.findElement(By.xpath("//a[text()='Sign Out']"));
	      signout.click();
	      
	      driver.close();
	      
        
        
        
        
	}

}
