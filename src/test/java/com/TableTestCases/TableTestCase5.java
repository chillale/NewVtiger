package com.TableTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TableTestCase5 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverUtility webDriverUtility = new WebDriverUtility(driver);
		webDriverUtility.maximize();
		webDriverUtility.implicitlywait();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		WebElement rankingsBtn = driver.findElement(By.xpath("//button[normalize-space()='Rankings']"));
		rankingsBtn.click();
		System.out.println(rankingsBtn.getText());
		WebElement teamRankingsBtn = driver.findElement(By.xpath("//a[normalize-space()='Team Rankings']"));
		teamRankingsBtn.click();
		
		
	}

}
