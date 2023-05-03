package com.TableTestCases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.struc.LinkedList;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SatishTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    List<WebElement> totalCountries = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
	   // LinkedList linkedList = new LinkedList();
	    ArrayList<String>  arrayList = new ArrayList();
	    for(int i=1;i<=totalCountries.size();i++) {
	    	String value=driver.findElement(By.xpath("//table[@class='table']/tbody/tr["+i+"]/td[3]")).getText();
	    	arrayList.add(value);
	    }
	    System.out.println(arrayList);
	    String firstIndex=arrayList.get(0);
	    String secondIndex=arrayList.get(3);
	    int a=Integer.parseInt(firstIndex);
	    int b = Integer.parseInt(secondIndex);
	    System.out.println(a+b);
	    
//	    System.out.println(noOfRows.size());
//	    for(int i=1;i<=noOfRows.size();i++) {
//	    	String afgTest=driver.findElement(By.xpath("//span[text()='Afghanistan']")).getText();
//	    	
//	    	for(int j=1;j<=5;j++) {
//	    		String getNameOfCountry=driver.findElement(By.xpath("//table[@class='table']/tbody/tr["+i+"]/td[2]")).getText();
//	    		if(getNameOfCountry.equals(afgTest)) {
//	    			System.out.println(driver.findElement(By.xpath("//table[@class='table']/tbody/tr[10]")).getText());
//	    			break;
//	    		}
//	    		
//	    	}
//}
	}

}
