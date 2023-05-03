package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartIphonePrices {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement crossButton = driver.findElement(By.xpath("//button[text()='✕']"));
		crossButton.click();
//		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
//		javascriptExecutor.executeScript("window.scrollBy(0,1500);");
//		
		
//		WebElement homeDropDown = driver.findElement(By.xpath("//button[text()='Home']"));
//		homeDropDown.click();
//		
		
		WebElement electronicsButton = driver.findElement(By.xpath("//div[text()='Electronics']"));
		electronicsButton.click();
	}

}
