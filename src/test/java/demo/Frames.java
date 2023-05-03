package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Frames']")).click();
		WebDriver frame1 = driver.switchTo().frame(0);
		System.out.println(frame1);
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//span[text()='Alert']")).click();
		driver.switchTo().frame(7);
		WebElement ele=driver.findElement(By.xpath("//h2[text()='Interface-Alert']"));
		String str=ele.getText();
		System.out.println(str);
		
				
	}


}
