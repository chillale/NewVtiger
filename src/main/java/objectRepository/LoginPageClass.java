package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {
	@FindBy(name = "user_name")
	private WebElement userName;
	
	@FindBy(name = "user_password")
	private WebElement passWord;
	
	@FindBy(id = "submitButton")
	private WebElement loginBtn;
	
	public LoginPageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public void loginpage(String uname , String passWd) {
		userName.sendKeys(uname);
		passWord.sendKeys(passWd);
		loginBtn.click();
	}
	
	

}