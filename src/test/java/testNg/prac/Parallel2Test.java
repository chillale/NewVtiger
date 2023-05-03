package testNg.prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel2Test {
	@Parameters("Browser")
	@Test
	public void d(String Browser) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println("d parallel method");
	}

}
