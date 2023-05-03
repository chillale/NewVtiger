package demo;

import org.testng.annotations.Test;

public class VtigerSravantest {
	@Test
	public void readingDatafromCmd() {
		String uN=System.getProperty("username");
		
		System.out.println("==========>"+uN);
	}

}
