package testNg.prac;

import org.testng.Assert;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Demo {
	@Test
	public static void test1()
	{
		System.out.println("test1");
	}
	
	
	@Test
	public void test2()
{
		String name="bharat";
		String name1="bharat1";
		Assert.assertEquals(name, name1);
		System.out.println("ravi");
		
		


		
		}
	
	
	@Test
	public void test3()
{
		System.out.println("test3");
		}
	
	@Test
	public void test4() {
		System.out.println("test4");
	}
}
