package com.TableTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TableTestCase1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wdu=new WebDriverUtility(driver);
		wdu.maximize();
		wdu.implicitlywait();
		
//		WebElement rankingButton = driver.findElement(By.xpath("//button[normalize-space()='Rankings']"));
//		rankingButton.click();
		
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		
		//List<WebElement> col = driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td"));
		
		for(int i=1;i<=row.size();i++) {
			for(int j=1;j<=5;j++)
			{
				String text = driver.findElement(By.xpath("//table[@class='table']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(text+"  ");
			}
			System.out.println();
		}
		
		
		
	}

}
