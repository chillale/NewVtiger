package getTitleAfterClickingonTab;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HarikaTest1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chill\\git\\vtiger\\Sdet\\drive\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement seriesButton = driver.findElement(By.xpath("//a[text()='Series']"));
		Actions act = new Actions(driver);
		act.moveToElement(seriesButton).perform();
		driver.findElement(By.xpath("//a[text()='Indian Premier League 2023']")).click();
        
		driver.findElement(By.xpath("//a[text()='Points Table']")).click();
		List<WebElement> teampointsTable = driver
				.findElements(By.xpath("//table[@class='table cb-srs-pnts']/tbody/tr"));
		for (int i = 1; i <= teampointsTable.size(); i=i+2) {
			String singleTeam="";
			for(int j=1;j<=1;j++) {
				singleTeam=driver.findElement(By.xpath("//table[@class='table cb-srs-pnts']/tbody/tr["+i+"]/td/descendant::div[3]")).getText();
			}
			//System.out.println(singleTeam);
			if(singleTeam.equals("Punjab Kings")) {
				System.out.println(singleTeam);
				for(int j=2;j<=8;j++) {
					
					System.out.println(driver.findElement(By.xpath("//table[@class='table cb-srs-pnts']/tbody/tr["+i+"]/td["+j+"]")).getText());
				}
			}
		}

	}
}
