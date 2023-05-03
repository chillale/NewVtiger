package testNg.prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowse {
	@Test
	@Parameters("browser")
	public void m1(String br) {
		WebDriver driver = null;
		if (br.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if(br.equals("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();

	}

}
