package demo;

import org.testng.annotations.Test;

public class ReadDataFromCommandPrompt {
	@Test
	public void readData() {
		String uRl=System.getProperty("url");
		String uN=System.getProperty("username");
		String pWd=System.getProperty("password");
		System.out.println(uRl);
		System.out.println(uN);
		System.out.println(pWd);
	}

}
