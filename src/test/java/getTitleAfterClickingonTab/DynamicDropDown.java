package getTitleAfterClickingonTab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicDropDown {
	public static void main(String[] args) {
	   // System.setProperty("webdriver.chrome.driver", "C:\\Users\\chill\\git\\vtiger\\Sdet\\drive\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='All']")).click();
	}

}
