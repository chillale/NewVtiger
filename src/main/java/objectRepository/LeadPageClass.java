package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.JavaUtillity;
import genericUtility.WebDriverUtility;

public class LeadPageClass {
	WebDriver driver;
	WebDriverUtility wdu=new WebDriverUtility(driver);
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement leadPlusBtn;
	
	@FindBy(name = "salutationtype")
	private WebElement nameType;
	
	@FindBy(name ="firstname")
	private WebElement firstName;
	
	@FindBy(name = "lastname")
	private WebElement lastName;
	
	@FindBy(name = "company")
	private WebElement companyName;
	
	@FindBy(name = "designation")
	private WebElement titleTf;
	
	@FindBy(name = "leadsource")
	private WebElement leadSrcDd;
	
	@FindBy(name = "industry")
	private WebElement industryDd;
	
	@FindBy(name = "phone")
	private WebElement phoneTf;
	
	@FindBy(name = "mobile")
	private WebElement mobileTf;
	
	@FindBy(name = "email")
	private WebElement emailTf;
	
	@FindBy(name = "button")
	private WebElement saveButton;
	
	public LeadPageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeadPlusBtn() {
		return leadPlusBtn;
	}

	public WebElement getNameType() {
		return nameType;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCompanyName() {
		return companyName;
	}
	

	public WebElement getTitleTf() {
		return titleTf;
	}
	

	public WebElement getLeadSrcDd() {
		return leadSrcDd;
	}

	public WebElement getIndustryDd() {
		return industryDd;
	}

	public WebElement getPhoneTf() {
		return phoneTf;
	}

	public WebElement getMobileTf() {
		return mobileTf;
	}

	public WebElement getEmailTf() {
		return emailTf;
	}
	public void leadSrcType(String value) {
		wdu.selectByvalue(leadSrcDd, value);
	}
	public void industryType(String value) {
		wdu.selectByvalue(industryDd , value);
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	public void nameType(String value) {
		wdu.selectByvalue(nameType, value);
	}
	
	public void leadPageDetails() {
		nameType.sendKeys("Mr");
		firstName.sendKeys("Tarun");
		lastName.sendKeys("Chillale");
		companyName.sendKeys("amsa"+JavaUtillity.generateRanNum());
		titleTf.sendKeys("Human Resource");

	}
	
	

}
