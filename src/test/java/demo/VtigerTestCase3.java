package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerTestCase3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.TAB,Keys.SPACE,Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		driver.findElement(By.xpath("//select[@name='salutationtype']")).click();
		driver.findElement(By.xpath("//select[@name='salutationtype']/option[2]")).click();
		driver.findElement(By.name("lastname")).sendKeys("akkupalli");//,Keys.TAB,Keys.TAB,Keys.ENTER,"Sravan solutions",Keys.TAB,Keys.TAB,Keys.ENTER);
		driver.findElement(By.xpath("//img[@style='cursor:hand;cursor:pointer']")).click();
		//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

}
