package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OppurtunitiesPageClass {
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement oppurPlusBtn;
	
	@FindBy(name = "potentialname")
	private WebElement oppurName;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
	private WebElement orgplusBtn;
	
	
	@FindBy(name = "search_text")
	private WebElement orgText;
	
	@FindBy(name = "search")
	private WebElement searchBtn;
	
	@FindBy(id = "1")
	private WebElement orgclick;
	
	@FindBy(name = "phone")
	private WebElement phoneTf;
	
	@FindBy(name = "otherphone")
	private WebElement otherPhnTf;
	
	@FindBy(name = "email1")
	private WebElement emailTf;
	
	@FindBy(name = "ownership")
	private WebElement ownershipTf;
	
	@FindBy(name = "rating")
	private WebElement ratingDd;
	
	@FindBy(name = "siccode")
	private WebElement siccodeTf;
	
	@FindBy(name = "button")
	private WebElement saveBtn;
	
	public OppurtunitiesPageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOppurPlusBtn() {
		return oppurPlusBtn;
	}

	public WebElement getOppurName() {
		return oppurName;
	}
	
	public WebElement getOrgplusBtn() {
		return orgplusBtn;
	}


	public WebElement getOrgText() {
		return orgText;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getOrgclick() {
		return orgclick;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getPhoneTf() {
		return phoneTf;
	}

	public WebElement getOtherPhnTf() {
		return otherPhnTf;
	}

	public WebElement getEmailTf() {
		return emailTf;
	}

	public WebElement getOwnershipTf() {
		return ownershipTf;
	}

	public WebElement getRatingDd() {
		return ratingDd;
	}

	public WebElement getSiccodeTf() {
		return siccodeTf;
	}
	
	

}
