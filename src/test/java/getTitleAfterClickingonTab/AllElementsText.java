package getTitleAfterClickingonTab;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllElementsText {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.kfc.co.in/menu/chizza");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='col']/descendant::h2"));
		System.out.println(elements.size());
		for(int i=0;i<elements.size();i++) {
			System.out.println(elements.get(i).getText());
		}
	}

}
