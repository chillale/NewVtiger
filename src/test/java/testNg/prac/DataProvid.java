package testNg.prac;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvid {
	@Test(dataProvider = "getDate")
	public void bookTicket(String src, String dest) {
		System.out.println(src+ " --->"+dest);
	}
	
	@DataProvider
	public Object[][] getDate() {
		Object arr[][]=new Object[3][2];
		
		arr[0][0]="BLR"; 
		arr[0][1]="Vizag";
		
		arr[1][0]="Maa";
		arr[1][1]="Hyd0";
		
		arr[2][0]= "bangkok";
		arr[2][1]="chaitanyapuri";
		
		return arr;
	}

}
