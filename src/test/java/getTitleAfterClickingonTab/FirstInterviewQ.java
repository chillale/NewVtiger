package getTitleAfterClickingonTab;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstInterviewQ {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Mobiles")).click();
		String text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-medium _octopus-search-result-card_style_apbSearchResultsContainer__bCqjb']/div[4]/div/div/div/div/div/span[2]")).getText();
		System.out.println(text);
		
//		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='nav-xshop-container']"));
//		for(WebElement link:elements) {
//			System.out.println(link.getText());
//		}
		
//		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='nav-xshop-container']/div"));
//		for(WebElement link:elements) {
//			System.out.println(link.getText());
//		}
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='nav-xshop-container']/div")));
//		driver.findElement(By.linkText("Mobiles")).click();
		
		String text1=driver.findElement(By.xpath("//div[@class='_octopus-search-result-card_style_apbSearchResultItem__2-mx4'][4]//div/span[2]/a/span")).getText();
		System.out.println(text1);
	}

}
