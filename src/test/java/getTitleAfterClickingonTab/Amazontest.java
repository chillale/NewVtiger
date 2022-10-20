package getTitleAfterClickingonTab;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazontest {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		WebDriverUtility wdu=new WebDriverUtility(driver);
		wdu.maximize();
		wdu.implicitlywait();
		driver.get("https://www.amazon.in/");
		
		WebElement searchText = driver.findElement(By.id("twotabsearchtextbox"));
		searchText.sendKeys("iphone");
		
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();
		
	     List<WebElement> totalText = driver.findElements(By.xpath("//span[contains(@class,'a-size-medium a-color-base a-')]/../../../following-sibling::div/div/div/div/div/a/span/span"));
		for(WebElement seperateText: totalText)
		{
			String singleText = seperateText.getText();
			System.out.println(singleText);
		}
		
		
	}

}
