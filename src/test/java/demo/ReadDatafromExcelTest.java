package demo;

import java.io.FileInputStream;



import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//import org.testng.annotations.Test;

public class ReadDatafromExcelTest {
	public static void main(String[] args) throws Throwable {
		//DataFormatter df=new DataFormatter();
		//step1 convert property file into java object
		FileInputStream fis=new FileInputStream("./Sravan.xlsx");
		
		Workbook book= WorkbookFactory.create(fis);
		String url=book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(url);
		String name=book.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();		
		System.out.println(name);
		
	}

}
