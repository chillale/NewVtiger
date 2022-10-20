package com.TableTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TableTestCase3 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wdu=new WebDriverUtility(driver);
		wdu.maximize();
		wdu.implicitlywait();
		
		
        driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		for(int i=1;i<=row.size();i++) {
			for(int j=1;j<=5;j++) {
				if(j==2) {
				 String text = driver.findElement(By.xpath("//table[@class='table']/tbody/tr["+i+"]/td["+(j+2)+"]")).getText();
				 String text1 = driver.findElement(By.xpath("//table[@class='table']/tbody/tr["+i+"]/td["+(j+3)+"]")).getText();
				 System.out.print(text+ "points and rankings" +text1);
				}
	}
			System.out.println();

}
	}
}
