package getTitleAfterClickingonTab;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {
	public static void main(String[] args) throws AWTException, Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement mobilesBtn = driver.findElement(By.linkText("Mobiles"));
		Actions actions = new Actions(driver); 
		actions.moveToElement(mobilesBtn).perform();
		actions.contextClick(mobilesBtn).perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement bestSellersBtn = driver.findElement(By.linkText("Best Sellers"));
		actions.moveToElement(bestSellersBtn).perform();
		actions.contextClick(bestSellersBtn).perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement customerService = driver.findElement(By.linkText("Customer Service"));
		actions.moveToElement(customerService).perform();
		actions.contextClick(customerService).perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		String expectedTitle="Help - Amazon Customer Service";
		//System.out.println("parent window="+ parentWindow);
		//String pWindow=driver.getWindowHandle();

		Set<String> allWindows = driver.getWindowHandles();
		//String parentWindow = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		for(String singlewindow:allWindows)
		{
			String title=driver.switchTo().window(singlewindow).getTitle();
	//		System.out.println(title);
			if(expectedTitle.equalsIgnoreCase(title)) {
				//driver.close();
				driver.findElement(By.xpath("//h3[normalize-space()='Your Orders']")).click();
			}
			else {
				//driver.switchTo().window(pWindow);
				driver.close();
			}


		}



	}

}
