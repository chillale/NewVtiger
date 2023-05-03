package com.crm.vtiger.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TsrtcTEstCase {
	public static void main(String[] args) throws AWTException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins*=");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.redbus.in/online-booking/tsrtc?gclid=Cj0KCQjwn9CgBhDjARIsAD15h0DNvMeaD0rrIbx_U5bUcb1a9e8x7wqqUqFuuiM-IfaElmG58LxaR6gaAiKSEALw_wcB");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.id("txtSource")).sendKeys("hy");
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    driver.findElement(By.id("txtDestination")).sendKeys("bang");

	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    WebElement calenderData = driver.findElement(By.id("txtOnwardCalendar"));
	    Actions act = new Actions(driver);
	    act.moveToElement(calenderData).perform();
	    
	    driver.findElement(By.xpath("//input[text()='text']")).sendKeys("24-03-2023");
	    
	
	}

}
