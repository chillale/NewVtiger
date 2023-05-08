package getTitleAfterClickingonTab;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HarikaTest {
	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chill\\git\\vtiger\\Sdet\\drive\\chrome_proxy.exe");
//		 ChromeOptions co = new ChromeOptions();
//		 co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://platform.votigo.com/fbsweeps/sweeps/Testsweepforautomation");
		
		driver.findElement(By.xpath("//input[@class='form-control stndField stndField-fname textInput']")).sendKeys("harish");
		driver.findElement(By.xpath("//input[@class='form-control stndField stndField-lname textInput']")).sendKeys("hanumanthu");
		driver.findElement(By.xpath("//input[@class='form-control stndField stndField-email']")).sendKeys("seleniumauto13@gmail.com");
		driver.findElement(By.xpath("//input[@class='form-control stndField stndField-conemail']")).sendKeys("seleniumauto13@gmail.com");
		driver.findElement(By.xpath("//input[@type='text']/ancestor::div[@class='fb-text form-group forminput SweepuserentryDob']")).click();
		WebElement selectMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select se = new Select(selectMonth);
		se.selectByVisibleText("Jan");
		
		WebElement selectYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select se2 = new Select(selectYear);
		se2.selectByVisibleText("2019");
		
		
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/descendant::a[text()='4']")).click();
		driver.findElement(By.xpath("//input[@class='checkbox stndField stndField-newsletterCheck']")).click();
		driver.findElement(By.xpath("//input[@class='checkbox stndField stndField-rulesCheck']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
