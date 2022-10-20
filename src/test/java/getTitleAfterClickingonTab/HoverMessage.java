package getTitleAfterClickingonTab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HoverMessage {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wdu=new WebDriverUtility(driver);
		wdu.maximize();
		
		driver.get("http://www.flipkart.com/");
		
		WebElement crossButton = driver.findElement(By.xpath("//button[text()='✕']"));
		crossButton.click();
		
		//WebElement searchTf = driver.findElement(By.className("_3704LK"));
		//searchTf.sendKeys("iphone");
		
		WebElement cartButton = driver.findElement(By.xpath("//*[name()='svg' and @class='V3C5bO']"));
		cartButton.click();
		
	}

}
