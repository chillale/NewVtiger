package demo;

import java.time.Duration;
import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Blueston {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https:www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.id("denyBtn")).click();
		WebElement ele=driver.findElement(By.xpath("//a[text()='Rings ']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='Diamond Rings']")).click();
		List<WebElement> ele1=driver.findElements(By.className("new-price"));
		int count=ele1.size();
		System.out.println(count);
		for(int i=0;i<=count;i++)
		{
			String ele2=ele1.get(i).getText();
			System.out.println(ele2);
			System.out.println();
		}
			
	}

}
