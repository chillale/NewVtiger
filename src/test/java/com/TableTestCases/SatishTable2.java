package com.TableTestCases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class SatishTable2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		 List<WebElement> list = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));  
		 System.out.println(list.size());
		 ArrayList<String> arrayList = new ArrayList();
		for (int i=1;i<=list.size();i++) 
		
		{			
		arrayList.add(driver.findElement(By.xpath("//table[@class='table']/tbody/tr["+i+"]/td[2]")).getText());
		}
	
//		System.out.println(arrayList);
//		Collections.sort(arrayList);
//		System.out.println(arrayList);
		 Object[] stringArray = arrayList.toArray();
		 String[] str = Arrays.copyOf(stringArray, stringArray.length, String[].class);
		
		for(int i=0;i<str.length;i++) {
			
				if(str[i].charAt(i)<str[i+1].charAt(i)&&i<str.length) {
					String temp=str[i];
					str[i]=str[i+1];
					str[i+1]=temp;
					break;
				
			}
		}
		System.out.println(Arrays.toString(str));

	
	
			 
	} 
}
