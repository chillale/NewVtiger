package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutusingSelectClass {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//driver.findElement(By.id("searchDropdownBox")).click();
		 List<WebElement> ele=driver.findElements(By.name("url"));
		 for(WebElement ele1:ele)
		 {
			 String data=ele1.getText();
			 System.out.println(data);
		 }
		driver.findElement(By.xpath("//select[@name='url']/option[3]")).click();
	}

}
