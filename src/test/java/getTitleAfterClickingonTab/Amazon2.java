package getTitleAfterClickingonTab;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon2 {
	public static void main(String[] args) throws AWTException, Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		driver.get("http://www.amazon.in");
		WebElement bestSellersBtn = driver.findElement(By.linkText("Best Sellers"));
		Actions actions = new Actions(driver);
		actions.moveToElement(bestSellersBtn).perform();
		actions.contextClick(bestSellersBtn).perform();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement mobilesBtn = driver.findElement(By.linkText("Mobiles"));
		actions.moveToElement(mobilesBtn).perform();
		actions.contextClick(mobilesBtn).perform();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement todaysDealsBtn = driver.findElement(By.linkText("Today's Deals"));
		actions.moveToElement(todaysDealsBtn).perform();
		actions.contextClick(todaysDealsBtn).perform();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		String parentWindow=driver.getWindowHandle();
		
		Set<String> allHandles = driver.getWindowHandles();
		
		String pWindowTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		for(String singleWindow:allHandles) {
			String pTitle=driver.switchTo().window(singleWindow).getTitle();
			if(!pTitle.equals(pWindowTitle)) {
				driver.close();
			}
			else {
				driver.switchTo().window(parentWindow);
			}
		}
		
	}
	
		
}


