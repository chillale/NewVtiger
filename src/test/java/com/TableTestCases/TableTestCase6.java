package com.TableTestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableTestCase6 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/odi");
		WebElement teamRankings = driver.findElement(By.xpath("//a[text()='Team Rankings']"));
		 List<WebElement> listofTeams = (List<WebElement>) driver.findElement(By.xpath("//table[@class='table']/tbody/tr"));
		 System.out.println(listofTeams.size());
		
		
	}

}
