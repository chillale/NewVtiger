package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationInfoPageClass {
	@FindBy(className = "dvHeaderText")
	private WebElement hText;

	public WebElement gethText() {
		return hText;
	}
	
	public OrganisationInfoPageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String gethText1() {
		return hText.getText();
	}
	

}
