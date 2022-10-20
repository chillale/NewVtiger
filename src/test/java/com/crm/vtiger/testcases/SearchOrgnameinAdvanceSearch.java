package com.crm.vtiger.testcases;

import java.time.Duration;
import java.util.Set;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SearchOrgnameinAdvanceSearch {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		genericUtility.PropertyFileUtility pfu=new genericUtility.PropertyFileUtility();
		String uRl = pfu.readDatafromPropertyFile("url");
		
		
		String uName = pfu.readDatafromPropertyFile("username");
		String pwd1= pfu.readDatafromPropertyFile("password");
		driver.get(uRl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement name=driver.findElement(By.name("user_name"));
		name.sendKeys(uName);
		
	    WebElement pwd=driver.findElement(By.name("user_password"));
	    pwd.sendKeys(pwd1);
	    
        WebElement	loginButton=driver.findElement(By.id("submitButton"));
        loginButton.click();
        
        WebElement orgclick=driver.findElement(By.xpath("//a[text()='Organizations']"));
        orgclick.click();
        
       WebElement advsearch=driver.findElement(By.xpath("//a[text()='Go to Advanced Search']"));
       advsearch.click();
       
       String parentwin = driver.getWindowHandle();
       System.out.println(parentwin);
       
       Set<String> allwin = driver.getWindowHandles();
       
       for(String awindow:allwin)
       {
    	   driver.switchTo().window(awindow);
    	   System.out.println(awindow);
       }
       
       WebElement equalsdd=driver.findElement(By.name("fop0"));
       Select select=new Select(equalsdd);
       select.selectByIndex(1);
       
       WebElement orgnameTf = driver.findElement(By.name("fval0"));
       orgnameTf.sendKeys("Testyantra",Keys.ENTER);
       
       WebElement orgname=driver.findElement(By.linkText("Testyantra"));
       orgname.click();
       
       driver.switchTo().window(parentwin);
       Thread.sleep(3000);
      // String orgnametext=driver.findElement(By.className("dvHeaderText")).getText();
       
       WebElement admdd=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	      Actions act=new Actions(driver);
	      act.moveToElement(admdd).perform();
	      
	      
	      WebElement signout=driver.findElement(By.xpath("//a[text()='Sign Out']"));
	      signout.click();
	      
	      driver.close();
		
       
       
       
}
}
