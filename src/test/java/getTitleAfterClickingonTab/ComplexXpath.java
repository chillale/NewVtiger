package getTitleAfterClickingonTab;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ComplexXpath {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[name()='g' and @id='regions']/*[name()='g' and @id='alabama' and @class='region']")).click();
		driver.findElement(By.xpath("//*[name()='g' and @id='states']/*[name()='g' and @id='alabama' and @class='state']")).click();
	}

}
