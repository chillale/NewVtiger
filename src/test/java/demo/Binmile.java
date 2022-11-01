package demo;

import org.testng.annotations.Test;

public class Binmile {
	@Test
	public void binMile()
	{
		String uRl=System.getProperty("url");
		String uN=System.getProperty("un");
		String pWd=System.getProperty("pwd");
		System.out.println(uRl);
		System.out.println(uN);
		System.out.println(pWd);
		
	}

}
