package demo;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDatafromXml {
	@Test
	public void readData(XmlTest xml) {
	String URl=	xml.getParameter("url");
	System.out.println(URl);
		
	}

}
