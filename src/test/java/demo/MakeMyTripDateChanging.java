package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.JavaUtillity;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTripDateChanging {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wdu=new WebDriverUtility(driver);
		
		JavaUtillity ju=new JavaUtillity();
		String todaysDate = ju.generateDate();
		
		wdu.maximize();
		wdu.implicitlywait();
		
		driver.get("http://www.makemytrip.com/");
		
		WebElement closeButton = driver.findElement(By.className("langCardClose"));
		closeButton.click();
		
		WebElement departureButton = driver.findElement(By.xpath("//label[@for='departure']"));
		departureButton.click();
		
		WebElement dateButton = driver.findElement(By.xpath("//div[@aria-label='"+todaysDate+"']"));
		dateButton.click();
		
		WebElement searchButton = driver.findElement(By.xpath("//a[text()='Search']"));
		searchButton.click();
		
		WebElement returnButton = driver.findElement(By.id("return"));
		returnButton.click();
		
		WebElement pickTheDate = driver.findElement(By.xpath("//div[@aria-label='Friday, 7 October 2022']"));
		pickTheDate.click();
		
		WebElement searchButton2 = driver.findElement(By.xpath("//span[text()='SEARCH']"));
		searchButton2.click();
	}

}
