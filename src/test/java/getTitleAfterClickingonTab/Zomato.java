package getTitleAfterClickingonTab;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Zomato {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		int num=13;
		driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]/descendant::div[@class='DayPicker-Day']/div/p[text()="+num+"]")).click();
		
//		driver.get("http://zomato.com");
//		driver.findElement(By.xpath("//h2[text()='Collections']/parent::div/following-sibling::div[@class='sc-bke1zw-0 fIuLDK cards']//section"
//				+ "/div[@class='sc-AhSAr hMlncR']/h6[text()='16 Places']")).click();
		//using axes 
		//ul[@class='makeFlex font12']/li/descendant::span[text()='Activities']
		
		
	}

}
