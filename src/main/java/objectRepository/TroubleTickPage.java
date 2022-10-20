package objectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class TroubleTickPage {
	WebDriver driver;
	WebDriverUtility wdu=new WebDriverUtility(driver);
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement troubletickBtn;
	
	@FindBy(name = "ticket_title")
	private WebElement ticketTitleTf;
	
	@FindBy(name = "ticketpriorities")
	private WebElement tPriorityDd;
	
	@FindBy(name = "ticketseverities")
	private WebElement tSeverityDd;
	
	@FindBy(name = "ticketcategories")
	private WebElement tCategoryDd;
	
	
	
	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
	private WebElement tConPlusBtn;
	
	@FindBy(name = "search_text")
	private WebElement consrchTf;
	
	@FindBy(name = "search")
	private WebElement consrchBtn;
	
	@FindBy(id = "1")
	private WebElement conSrchClick;
	
	@FindBy(name = "button")
	private WebElement sButton;
	
	
	public TroubleTickPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTroubletickBtn() {
		return troubletickBtn;
	}

	public WebElement getTicketTitleTf() {
		return ticketTitleTf;
	}

	public WebElement gettPriorityDd() {
		return tPriorityDd;
	}

	public WebElement gettSeverityDd() {
		return tSeverityDd;
	}

	public WebElement gettCategoryDd() {
		return tCategoryDd;
	}

	public WebElement gettConPlusBtn() {
		return tConPlusBtn;
	}

	public WebElement getConsrchTf() {
		return consrchTf;
	}

	public WebElement getConsrchBtn() {
		return consrchBtn;
	}
	

	public WebElement getsButton() {
		return sButton;
	}

	public WebElement getConSrchClick() {
		return conSrchClick;
	}
	public void priorityDd(String value) {
		wdu.selectByvalue(tPriorityDd, value);	
	}
	public void severityDd(String value) {
		wdu.selectByvalue(tSeverityDd, value);
	}
	public void categoryDd(String value) {
		wdu.selectByvalue(tCategoryDd, value);
	}
	
	
	

}
