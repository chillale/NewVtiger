package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import genericUtility.WebDriverUtility;

public class ContactDetailsPageClass {
	
	
	
	WebDriver driver;
	WebDriverUtility wdu=new WebDriverUtility(driver);
	@FindBy(name = "salutationtype")
	private WebElement nameType;
	
	@FindBy(name = "firstname")
	private WebElement fName;
	
	@FindBy(name = "lastname")
	private WebElement lName;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
	private WebElement selOrg;
	
	@FindBy(id = "search_txt")
	private WebElement srchTxt;
	
	@FindBy(name = "search")
	private WebElement searchBtn;
	
	@FindBy(id = "1")
	private WebElement companyNameClick;
	
	@FindBy(name = "button")
	private WebElement sButton;
	
	@FindBy(name = "leadsource")
	private WebElement leadSrcDd;
	
	@FindBy(name = "title")
	private WebElement titleTf;
	
	@FindBy(name = "department")
	private WebElement departmentTf;
	
	@FindBy(name = "email")
	private WebElement emailTf;
	
	@FindBy(name = "assistant")
	private WebElement assistantTf;
	
	@FindBy(name = "assistantphone")
	private WebElement assistantPhnTf;
	
	@FindBy(name = "phone")
	private WebElement officePhnTf;
	
	@FindBy(name = "mobile")
	private WebElement mobileTf;
	
	@FindBy(name = "homephone")
	private WebElement homePhoneTf;
	
	@FindBy(name = "otherphone")
	private WebElement otherPhoneTf;
	
	
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminImg;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signot;
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSignot() {
		return signot;
	}
	
	public WebElement getsButton() {
		return sButton;
	}

	public WebElement getAdminImg() {
		return adminImg;
	}

	public WebElement getCompanyNameClick() {
		return companyNameClick;
	}
	

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getSrchTxt() {
		return srchTxt;
	}

	public ContactDetailsPageClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getNameType() {
		return nameType;
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}
	
	public WebElement getSelOrg() {
		return selOrg;
	}
	
	
	public WebElement getTitleTf() {
		return titleTf;
	}

	public WebElement getDepartmentTf() {
		return departmentTf;
	}

	public WebElement getEmailTf() {
		return emailTf;
	}

	public WebElement getAssistantTf() {
		return assistantTf;
	}

	public WebElement getAssistantPhnTf() {
		return assistantPhnTf;
	}

	public WebElement getOfficePhnTf() {
		return officePhnTf;
	}

	public WebElement getMobileTf() {
		return mobileTf;
	}

	public WebElement getHomePhoneTf() {
		return homePhoneTf;
	}

	public WebElement getOtherPhoneTf() {
		return otherPhoneTf;
	}

	public void firstNameType(String value) {
		wdu.selectByvalue(nameType, value);
//		Select select=new Select(nameType);
//		select.selectByValue(value);
	}
	public void firstName(String fName1) {
		fName.sendKeys(fName1);
	}
	public void lastName(String lName1) {
		lName.sendKeys(lName1);
	}
	public void orgClick() {
		selOrg.click();
	}
	public void searchClick() {
		searchBtn.click();
	}
	public void orgNameClick() {
		companyNameClick.click();
	}
	public void sBtn() {
		sButton.click();
	}
	
	public WebElement getLeadSrcDd() {
		return leadSrcDd;
	}
	public void leadSrcType(String value) {
		wdu.selectByvalue(leadSrcDd, value);
	}

	public void signout(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(adminImg).perform();
		signot.click();
		
	}
	

	

	
	

}
