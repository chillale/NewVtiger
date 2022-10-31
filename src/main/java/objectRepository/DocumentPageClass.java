package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentPageClass {
	WebDriver driver;
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement documentPlusBtn;
	
	@FindBy(name = "notes_title")
	private WebElement titleTf;
	
	@FindBy(name = "button")
	private WebElement sButton;
	
	public DocumentPageClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getDocumentPlusBtn() {
		return documentPlusBtn;
	}

	public WebElement getTitleTf() {
		return titleTf;
	}

	public WebElement getsButton() {
		return sButton;
	}
	

	
	
	

}
