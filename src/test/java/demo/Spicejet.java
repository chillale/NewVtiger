package demo;

import java.util.Arrays;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Spicejet {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wdu=new WebDriverUtility(driver);
		wdu.maximize();
		wdu.implicitlywait();
		
		
		
		driver.get("http://spicejet.com/");
		
		Alert alt=driver.switchTo().alert();
		//String str=alt.getText();
		alt.dismiss();
		
		WebElement sourceName = driver.findElement(By.className("css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep"));
		sourceName.sendKeys("Del");
		
		WebElement destinationName = driver.findElement(By.className("css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu"));
		destinationName.sendKeys("agr");
	}

}
