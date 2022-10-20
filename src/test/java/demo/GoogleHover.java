package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleHover {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		WebDriverUtility wdu=new WebDriverUtility(driver);
		wdu.maximize();
		wdu.implicitlywait();
		driver.get("http://www.google.com/");
		
		WebElement searchTf = driver.findElement(By.name("q"));
		searchTf.click();
		
		List<WebElement> allText = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li/div"));
		
		for(int i=0;i<allText.size();i++) {
			String singleText=allText.get(i).getText();
			System.out.println(singleText);
		}
	}

}
