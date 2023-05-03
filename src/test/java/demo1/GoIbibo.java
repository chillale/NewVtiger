package demo1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoIbibo {
	public static void main(String[] args) throws AWTException, InterruptedException {
		String city = "Hyderabad, India";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/?utm_source=bing&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!B!Brand!RSA!150035352!1211662109442708!!e!goibibo!c!&msclkid=8b755402cac2117909e637b0671f252d");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[.='From']")).click();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Mumbai, India");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		////span[.='From']/../following-sibling::div/div/span
		//driver.findElement(By.xpath("//span[text()='To']/following-sibling::p[text()='Enter city or airport']")).sendKeys(city);
		driver.findElement(By.xpath("//span[.='To']")).click();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(city);
		//driver.findElement(By.xpath("//input[@type='text']/../span[text()='To']/parent::div/parent::div[@class='sc-caiLqq SxNVP']")).sendKeys(city);
		
		//using dynamic xpath
		//div[text()='POCO M4 5G (Cool Blue, 128 GB)']/parent::div/following-sibling::div/descendant::div[2]/div[@class='_30jeq3 _1_WHN1']
		
//		driver.findElement(By.xpath("//ul[@class='sc-gWXbKe cFYvpm']")).click();
//		driver.findElement(By.xpath("//span[.='To']")).sendKeys(city);
//		List<WebElement> list = driver.findElements(By.id("autoSuggest-list"));
//		System.out.println(list);
//		for(WebElement singleState:list) {
//			System.out.println(singleState);
//			if(singleState.equals(city)) {
//				
//				singleState.click();
//			}
//		}
	}

}
