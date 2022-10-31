package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CreateConPageClass {
	
	WebDriver driver;
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createCn;
	
	
	
	

	


	public WebElement getCreateCn() {
		return createCn;
	}

	

	public CreateConPageClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public void createCon() {
		createCn.click();
	}
	
	
	

}
