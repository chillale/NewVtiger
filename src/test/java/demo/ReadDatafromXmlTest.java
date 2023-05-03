package demo;

import org.junit.runners.Parameterized.Parameters;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDatafromXmlTest {

	
		@Test
		
		public void readDatafromtest(XmlTest xml)
		{
			String Url=xml.getParameter("url");
			System.out.println(Url);
//			System.out.println(xml.getParameter("un"));
//			System.out.println(xml.getParameter("pwd"));
		}
		// TODO Auto-generated method stub

	}


