 package genericUtility;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFileUtility {
	public String readDatafromPropertyFile(String key) throws Throwable
	{
		FileInputStream fileInputStream=new FileInputStream("./CommonData/CommonD.properties");
		 Properties p = new Properties();
		 p.load(fileInputStream);
		 return p.getProperty(key);
//		Properties p=new Properties();
//		p.load(fileInputStream);
//		String value = p.getProperty(key);
//		return value;
	}

}
