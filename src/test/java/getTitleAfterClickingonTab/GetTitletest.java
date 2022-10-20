package getTitleAfterClickingonTab;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitletest {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wdu=new WebDriverUtility(driver);
		wdu.maximize();
		wdu.implicitlywait();
		
		driver.get("https://www.amazon.in/");
		
		WebElement mobileClick = driver.findElement(By.xpath("//a[text()='Customer Service']"));
		wdu.mouseoverAction(mobileClick);
		
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement booksClick = driver.findElement(By.xpath("//a[text()='Books']"));
		wdu.mouseoverAction(booksClick);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement bestSellers = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		wdu.mouseoverAction(bestSellers);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	    String parentWindow = driver.getWindowHandle();
	    Set<String> allhandles = driver.getWindowHandles();
	    for(String aw:allhandles) {
	    
	    		String title = driver.switchTo().window(aw).getTitle();
	    		//System.out.println(title);
	    		if(title.equals("Customer")) {
	    			System.out.println(driver.getCurrentUrl());
	    			break;	    			
	    			
	    		}
	    	
	    	
	    }
	    
		
		
		
		
		
		
	}

}
