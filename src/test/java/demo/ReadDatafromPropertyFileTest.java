package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDatafromPropertyFileTest {
	public static void main(String[] args) throws Throwable {
		//step 1: convert property file into java object
		FileInputStream fis=new FileInputStream("./CommonData.properties");
		Properties p=new Properties();
		//step 2 load java object
		p.load(fis);
		//step3 read the data
		String value=p.getProperty("url");
		System.out.println(value);
		String value1=p.getProperty("username");
		System.out.println(value1);
	}

}
