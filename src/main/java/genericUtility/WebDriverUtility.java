package genericUtility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	WebDriver driver;
	public WebDriverUtility(WebDriver driver) {
		this.driver=driver;
	}
	/**
	 * This method is used to maximize the window
	 * @author chillale sravan
	 */
	public void maximize() {
		driver.manage().window().maximize();
	}
	/**
	 * This method is used to wait for page load
	 * @author vamsi krishna
	 */
	public void implicitlywait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	/**This method is used to use Select Class
	 * @author Saikrishna
	 * @param ele 
	 * @param value 
	 *
	 */
	public void selectByvalue(WebElement ele, String value) {
		Select select=new Select(ele);
		select.selectByValue(value);
	}
	/**
	 * This method is used for select By visible text
	 * @param ele 
	 * @param value 
	 */
	public void selectByvisibletext(WebElement ele, String value) {
		Select select=new Select(ele);
		select.selectByVisibleText(value);
	}
	/**
	 * This method is used for select by index
	 * @author prakash
	 * @param ele
	 * @param value
	 * 
	 */
	public void selectByindex(WebElement ele, int value) {
		Select select=new Select(ele);
		select.selectByIndex(value);
	}
	
	/**
	 * This method is for window handles
	 * @author sravan
	 * parent window handle
	 * @return parentHandle
	 */
	public String switchToParent() {
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		return parentHandle;
	}
	/**
	 * This method is used for allwindowHandles
	 * @author Anish
	 * @param pHandle 
	 * @param pHandle
	 */
	public void allHandles(String pHandle) {
		Set<String> allWinHandles = driver.getWindowHandles();
		System.out.println("All Window handles are");
		for(String aw:allWinHandles) {
			System.out.println(aw);
			if(!pHandle.equals(aw)) {
				driver.switchTo().window(aw);
				break;
			}
			else {
				driver.switchTo().window(pHandle);
			}
			
		}
	}
	/**
	 * This method is to mouse over the element
	 * @author Rohit
	 * @param variable 
	 */
	public void mouseoverAction(WebElement variable) {
		Actions act=new Actions(driver);
		act.moveToElement(variable).perform();
		act.contextClick(variable).perform();
	}
	/*
	 * This method is used for explicit wait
	 * 
	 */
	
	
}
