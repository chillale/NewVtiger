package getTitleAfterClickingonTab;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.org/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[contains(text(),'Afghanistan')]")).click();
		WebElement element = driver.findElement(By.xpath("//ul[@class='country-list hide']/child::li[@class='country' and @data-dial-code='93']"));
		System.out.println(element.getText());
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("arguments[0].click();", element);
		List<WebElement> countries = driver.findElements(By.xpath("//ul[@class='country-list hide']/child::li[@class='country']/descendant::span"));
		for(int i=0;i<countries.size();i++) {
			if(countries.get(i).getText().contains("+93")) {
				System.out.println("clicked");
				countries.get(i).click();
				break;
			}
		}
	}

}
