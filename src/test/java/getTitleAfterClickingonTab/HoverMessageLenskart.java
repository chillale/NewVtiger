package getTitleAfterClickingonTab;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HoverMessageLenskart {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wdu=new WebDriverUtility(driver);
		wdu.maximize();
		wdu.implicitlywait();
		
		driver.get("http://lenskart.com/");
		
		String attribute = driver.findElement(By.xpath("//a[text()='Store Locator']")).getAttribute("title");
		System.out.println(attribute);
		
		WebElement searchTf = driver.findElement(By.name("q"));
		searchTf.click();
		
		List<WebElement> allName = driver.findElements(By.xpath("//ul[@class='trending_list menu-link']/li/a"));
		for(int i=0;i<allName.size();i++) {
			String singleName=allName.get(i).getText();
			System.out.println(singleName);
		}
		
	}

}
