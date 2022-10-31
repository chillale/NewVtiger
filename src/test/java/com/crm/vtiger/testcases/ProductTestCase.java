package com.crm.vtiger.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductTestCase {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility webDriverUtility = new WebDriverUtility(driver);
		driver.get("http://localhost:8888/");
		webDriverUtility.maximize();
		webDriverUtility.implicitlywait();
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@title = 'Create Product...']")).click();
		driver.findElement(By.name("productname")).sendKeys("hello");
		driver.findElement(By.xpath("//input[normalize-space()='Group']")).click();
		
	}
}