package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationPageClass {
	WebDriver driver;
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement orgplusBtn;

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminImg;

	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signot;

	public WebElement getAdminImg() {
		return adminImg;
	}

	public WebElement getSignot() {
		return signot;
	}

	public WebElement getOrgplusBtn() {
		return orgplusBtn;
	}

	public OrganisationPageClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void newOrgBtn() {
		orgplusBtn.click();
	}

	public void signout(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(adminImg).perform();
		signot.click();

	}

}
