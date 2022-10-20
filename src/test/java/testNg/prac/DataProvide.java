package testNg.prac;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;

public class DataProvide {
	@Test(dataProvider = "exceldata")
	public void getData(String un, String pwd) {
		System.out.println(un+ " "+pwd);
	}
	@DataProvider
	public Object[][] exceldata() throws Throwable {
		Object arr[][]=new Object[4][2];
		
		ExcelFileUtility efu=new ExcelFileUtility();
		for(int i=0;i<=efu.getLastRowCount("Sheet3");i++) {
			
			arr[i][0]= efu.readDatafromExcelFile("Sheet3", i, 0);
			arr[i][1]= efu.readDatafromExcelFile("Sheet3", i, 1);
		}
		return arr;
	}

}
