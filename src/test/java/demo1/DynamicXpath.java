package demo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicXpath {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Mobiles")).click();
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,3000)");
		//following-sibling
		////p[text()='Armed Forces ']/parent::li/following-sibling::li/p[normalize-space(text())='Student']
		//how to inspect dynamic xpath using ancestors
		////span[.='Redmi A1 (Light Blue, 2GB RAM, 32GB Storage) | Segment Best AI Dual Cam | 5000mAh Battery | Leather Texture Design | Android 12']/ancestor::div[@class='a-section a-spacing-small puis-padding-left-small puis-padding-right-small']//span[@class='a-size-base s-underline-text']
		//using following-sibling
		////p[normalize-space(text())='Armed Forces']/parent::li/following-sibling::li/p[normalize-space(text())='Student']
		////span[@class='a-price-whole' and text()='18,999'][1]
		////div[@class='a-section a-spacing-base']//div[2]/child::div[3]/div[2]/a/span[1]/span[2]/span[text()='18,999']
		////span[text()='OnePlus Nord CE 2 Lite 5G (Blue Tide, 6GB RAM, 128GB Storage)' and @class='a-size-base-plus a-color-base a-text-normal']
		String mobilePrice = driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"]//ancestor::span[@aria-hidden=\"true\"])[1]")).getText();
		System.out.println(mobilePrice);
	}

}
