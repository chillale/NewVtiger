package getTitleAfterClickingonTab;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("ChillaleSravan");
		driver.findElement(By.name("password")).sendKeys("Anusuyabaic@23");
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
	}

}
