package demo;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDatafromExcel1Test {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./Sravan.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		 Sheet sh=wb.getSheet("Sheet1");	
		  Row r=sh.getRow(0);
		  Cell c=r.getCell(0);
		  String value=c.getStringCellValue();
		  System.out.println(value);
		  }

}
