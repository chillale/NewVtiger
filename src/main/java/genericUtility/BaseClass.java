package genericUtility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePageClass;
import objectRepository.LoginPageClass;

public class BaseClass extends Object{
	public WebDriver driver;
	public static WebDriver sdriver;
	PropertyFileUtility propertyFileUtility = new PropertyFileUtility();
	
	
	@BeforeSuite(groups = {"smoke","integration","regression"})
	public void connectDataBase() 
	{
		System.out.println("===DataBase Connected===");
	}
	@AfterSuite(groups = {"smoke","integration","regression"})
	public void disconnectDataBase() 
	{
		System.out.println("===DataBase Disconnected===");
	}
	//@org.testng.annotations.Parameters("sravan")
	@BeforeClass(groups = {"smoke","integration","regression"})
	public void launchTheBrowser() throws Throwable
	{
		//String Browser=propertyFileUtility.readDatafromPropertyFile("Browser");
	
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();  
		
	
		sdriver=driver;
		 WebDriverUtility webDriverUtility=new WebDriverUtility(driver);
		webDriverUtility.maximize();
		webDriverUtility.implicitlywait();
		String uRl = propertyFileUtility.readDatafromPropertyFile("url");
		driver.get(uRl);
	}
	@AfterClass(groups = {"smoke","integration","regression"})
	public void closeTheBrowser()
	{
		driver.close();
	}
	@BeforeMethod(groups = {"smoke","integration","regression"})
	public void loginIntoPage() throws Throwable
	{
		String uName = propertyFileUtility.readDatafromPropertyFile("username");
		String pWd = propertyFileUtility.readDatafromPropertyFile("password");
		LoginPageClass loginPageClass=new LoginPageClass(driver);
		loginPageClass.loginpage(uName, pWd);
	}
	@AfterMethod(groups = {"smoke","integration","regression"})
	public void logoutFromPage()
	{
		HomePageClass homePageClass = new HomePageClass(driver);
		homePageClass.actionOnAdmin(driver);
		homePageClass.getSignot().click();
	}

}
