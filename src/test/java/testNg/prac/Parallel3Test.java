package testNg.prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parallel3Test {
	@Parameters("Browser")
	@Test
	public void e(String Browser) {
		WebDriver driver;
		if(Browser.equals("chrome")) {
		 driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		System.out.println("e parallel method");
		}
	}

}
