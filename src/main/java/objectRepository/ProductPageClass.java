package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageClass {
	WebDriver driver;
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement productPlusBtn;
	
	@FindBy(name = "productname")
	private WebElement productNameTf;
	
	@FindBy(id = "jscal_trigger_sales_start_date")
	private WebElement calenderBtn;
	
	@FindBy(xpath = "//td[text()='12']")
	private WebElement selectDate;
	
	@FindBy(name = "productcategory")
	private WebElement productCatDd;
	
	public ProductPageClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProductPlusBtn() {
		return productPlusBtn;
	}

	public WebElement getProductNameTf() {
		return productNameTf;
	}

	public WebElement getCalenderBtn() {
		return calenderBtn;
	}

	public WebElement getSelectDate() {
		return selectDate;
	}

	public WebElement getProductCatDd() {
		return productCatDd;
	}
	
	

}
