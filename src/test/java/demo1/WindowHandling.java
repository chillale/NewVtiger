package demo1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		WebElement bestSellers = driver.findElement(By.linkText("Best Sellers"));
		Actions actions = new Actions(driver);
		actions.moveToElement(bestSellers).perform();
		actions.contextClick(bestSellers).perform();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement mobiles = driver.findElement(By.linkText("Mobiles"));
		actions.moveToElement(mobiles).perform();
		actions.contextClick(mobiles).perform();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement todaysDeals = driver.findElement(By.linkText("Today's Deals"));
		actions.moveToElement(todaysDeals).perform();
		actions.contextClick(todaysDeals).perform();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
	    Thread.sleep(1000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    WebElement customerService = driver.findElement(By.linkText("Customer Service"));
	    actions.moveToElement(customerService).perform();
	    actions.contextClick(customerService).perform();
	    
	    robot.keyPress(KeyEvent.VK_DOWN);
	    robot.keyRelease(KeyEvent.VK_DOWN);
	    Thread.sleep(1000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    String parentWindow = driver.getWindowHandle();
	    String parentTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	    Set<String> allHandles = driver.getWindowHandles();
	    
	    for(String singleWindow:allHandles) {
	    	String childTitle=driver.switchTo().window(singleWindow).getTitle();
	    	if(!childTitle.equals(parentTitle)) {
	    		driver.close();
	    	}
	    	else {
	    		driver.switchTo().window(parentWindow);
	    	}
	    }
		
	}

}
