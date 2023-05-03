package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/international-flights/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		driver.findElement(By.xpath("//div[text()='Email or phone']")).sendKeys("chillalesravankumar1995@gmail.com");
		//driver.findElement(By.xpath("https://www.makemytrip.com/"));
		//driver.findElement(By.xpath("//p[text()='Hi Traveller']")).click();
		driver.findElement(By.xpath("//p[text()='Bangkok, Thailand']"));
		driver.findElement(By.xpath("//p[text()='Indira Gandhi International Airport']"));
		driver.findElement(By.xpath("//a[text()='Search']"));
		
			
		
	}

}
