package demo;

import org.testng.annotations.Test;

public class ReadDatafromCmdTest {
	@Test
	public void readDataTest()
	{
		String Url=System.getProperty("url");
		String Un=System.getProperty("un");
		System.out.println("------------->"+Url);
		System.out.println("------------>"+Un);
	}
	

}
