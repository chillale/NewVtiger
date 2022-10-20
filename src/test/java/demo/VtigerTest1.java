package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class VtigerTest1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement name=driver.findElement(By.name("user_name"));
		name.sendKeys("admin");
		
	    WebElement pwd=driver.findElement(By.name("user_password"));
	    pwd.sendKeys("admin");
	    
        WebElement	loginButton=driver.findElement(By.id("submitButton"));
        loginButton.click();
        String orgname1="Testyantra solutions114";
        
        WebElement orgclick=driver.findElement(By.xpath("//a[text()='Organizations']"));
        orgclick.click();
        
        WebElement createorgclick=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
        createorgclick.click();
        
        WebElement orgname=driver.findElement(By.name("accountname"));
        orgname.sendKeys(orgname1);
        
        WebElement indname=driver.findElement(By.name("industry"));
		Select select=new Select(indname);
		System.out.println(select.isMultiple());
		select.selectByValue("Biotechnology");
		
		WebElement savebutton=driver.findElement(By.name("button"));
		savebutton.click();
		
		Thread.sleep(3000);
		
		orgclick.click();
		WebElement orgname2=driver.findElement(By.xpath("//a[text()='Testyantra']"));
		orgname2.click();
		String orgnametext=driver.findElement(By.className("dvHeader Text")).getText();
		if(orgnametext.contains(orgname1))
		{
			System.out.println("validation successful");
		}
		else
		{
			System.out.println("validation not successful");
		}
	      WebElement admdd=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	      Actions act=new Actions(driver);
	      act.moveToElement(admdd);
	      
	      WebElement signout=driver.findElement(By.xpath("//a[text()='Sign Out']"));
	      signout.click();
	      
		
	}

}
