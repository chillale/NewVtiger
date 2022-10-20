package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePageClass {
	public WebDriver driver;
	
	
	@FindBy(linkText = "Contacts")
	private WebElement conBtn;
	
	@FindBy(linkText = "Organizations")
	private WebElement orgBtn;
	
	@FindBy(linkText = "Leads")
	private WebElement leadBtn;
	
	@FindBy(linkText = "Opportunities")
	private WebElement oppurtunitiesBtn;
	
	@FindBy(linkText = "Products")
	private WebElement productBtn;
	
	@FindBy(linkText = "Documents")
	private WebElement documentsBtn;
	
	@FindBy(linkText = "Trouble Tickets")
	private WebElement troubleTBtn;
	
	@FindBy(linkText = "More")
	private WebElement morebtn;
    

	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminImg;
	
	
	@FindBy(xpath = "//a[contains(text(),'Sign Out')]")
	private WebElement signot;
	

	
	
	public HomePageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getConBtn() {
		return conBtn;
	}
	

	public WebElement getOrgBtn() {
		return orgBtn;
	}
	public WebElement getLeadBtn() {
		return leadBtn;
	}

	public WebElement getOppurtunitiesBtn() {
		return oppurtunitiesBtn;
	}
	
	
	public WebElement getProductBtn() {
		return productBtn;
	}

	public WebElement getDocumentsBtn() {
		return documentsBtn;
	}
	

	public WebElement getTroubleTBtn() {
		return troubleTBtn;
	}
	

	public WebElement getMorebtn() {
		return morebtn;
	}

	public void conB() {
		conBtn.click();
	}
	public void orgB()
	{
		orgBtn.click();
		
	}
	public void leadB() {
		leadBtn.click();
	}
	
	public void oppurBtn()
	{
		oppurtunitiesBtn.click();
	}
	
	public void productBtn() {
		productBtn.click();
	}
	public WebElement getSignot() {
		return signot;
	}
	
	public WebElement getAdminImg() {
		return adminImg;
		
	}
//	public void signout(WebDriver driver) {
//		Actions act=new Actions(driver);
//		act.moveToElement(adminImg).perform();
//		signot.click();
//		
//	}
	
	public void actionOnAdmin(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(adminImg).perform();
	}
}

	
