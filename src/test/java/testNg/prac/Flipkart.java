package testNg.prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(ListImp.class)
public class Flipkart  {
	 public static WebDriver driver;
	
	@Test
	@Parameters()
	public void amazon(String browser) {
		if(browser.equals("chrome"))
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://amazon.in");
		System.out.println(driver.getTitle());
		Assert.assertEquals(true, true);
	}


}
