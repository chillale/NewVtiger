package testNg.prac;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void a()
	{
		System.out.println("a");
	}
	@Test
	public void A()
{
		System.out.println("A");
}
	@BeforeSuite
	public void bs()
{
		System.out.println("Before Suite");
		}
	@org.testng.annotations.BeforeClass
	public void bc()
	{
		System.out.println("Before class");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("Before Method");
	}
	@BeforeTest
	public void bt()
{
System.out.println("Before Test");		
}
	@AfterSuite
	public void as()
{
		System.out.println("After Suite");
		}
	@AfterMethod
	public void am()
{
		System.out.println("After Method");
		}
	@AfterTest
	public void at()
{
		System.out.println("AFter Test");
		}
	@org.testng.annotations.AfterClass
	public void ac() {
		System.out.println("After Class");
	}
}
