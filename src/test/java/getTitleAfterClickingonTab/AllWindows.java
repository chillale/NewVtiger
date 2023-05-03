package getTitleAfterClickingonTab;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.safari.SafariDriver;

public class AllWindows {
	public static void main(String[] args) throws AWTException, Throwable {
//	  String path = SeleniumManager.getInstance().getDriverPath("chromedriver");
//	  System.out.println(path);
//	  ChromeOptions co = new ChromeOptions();
//	  co.addArguments("--remote-allow-origins=*");
//	  WebDriver driver = new ChromeDriver(co);
//	  driver.get("https://www.google.com");
//	  System.out.println(driver.getTitle());
//	  driver.quit();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chill\\git\\vtiger\\Sdet\\drive\\chromedriver.exe");
		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
	}

}
