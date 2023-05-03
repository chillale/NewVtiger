package getTitleAfterClickingonTab;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Make {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|M|DF|B|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|&s_kwcid=AL!1631!3!!e!!o!!makemytrip&ef_id=b39e37f740c410ae223c5472a5521079:G:s");
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		String parentWindow=driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		for(String singleWindow:allHandles) {
			if(!singleWindow.equals(parentWindow)) {
				driver.switchTo().window(parentWindow);
			}
		}
		driver.findElement(By.xpath("//div[text()='Email or phone']")).sendKeys("chillalesravankumar1995@gmail.com");
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//span[text()='Flights']")).click();
		
		
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//input[type='text']")).sendKeys("jaipur");
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("//input[type='text']")).sendKeys("hyderabad");
		driver.findElement(By.id("departure")).click();
		
	}

}
