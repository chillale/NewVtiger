package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class OrganisationDetailsPageClass {
	WebDriver driver;
	WebDriverUtility wdu=new WebDriverUtility(driver);
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createOrg;
	
	@FindBy(name = "accountname")
	private WebElement orgName;
	
	@FindBy(name = "industry")
	private WebElement indName;
	
	@FindBy(name = "accounttype")
	private WebElement indtype;

	@FindBy(name = "button")
	private WebElement sButton;
	
	@FindBy(xpath = "//a[text()='amsa']")
	private WebElement org2name;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminImg;
	
	
	@FindBy(xpath = "//a[contains(text(),'Sign Out')]")
	private WebElement signot;

//	public WebElement getOrg2name() {
//		return org2name;
//	}

	public WebElement getCreateOrg() {
		return createOrg;
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getIndName() {
		return indName;
	}

	public WebElement getIndtype() {
		return indtype;
	}

	public WebElement getsButton() {
		return sButton;
	}
	public OrganisationDetailsPageClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void orgPageDetails(String value, String value1) {
		orgName.sendKeys(value);
		wdu.selectByvalue(indName, value1);
		sButton.click();
		//org2name.click();
		
	}
	
	public void orgName(String value) {
		orgName.sendKeys(value);
	}
	
	public void saveB() {
		sButton.click();
	}

//	public void actionOnAdmin(WebDriver driver) {
//		Actions act=new Actions(driver);
//		act.moveToElement(adminImg).perform();
//	}
	
	public void signout(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(adminImg).perform();
		signot.click();
		
	}
	
	
}
