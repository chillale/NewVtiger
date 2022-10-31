 package genericUtility;

import java.io.FileInputStream;
//import java.io.IOException;

//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	public String readDatafromExcelFile(String sheetNUm, int rowNum, int cellNum) throws Throwable
	{
		FileInputStream fileInputStream=new FileInputStream("./CommonData/CommonD.xlsx");
		Workbook workbook=WorkbookFactory.create(fileInputStream);
		Sheet sheet=workbook.getSheet(sheetNUm);
	    Row row = sheet.getRow(rowNum);
	    Cell cell = row.getCell(cellNum);
	    String value = cell.getStringCellValue();
	    return value;
	}
	public int getLastRowCount(String sheetNUm) throws Throwable
	{
		FileInputStream fileInputStream=new FileInputStream("./CommonData/CommonD.xlsx");
		Workbook workbook=WorkbookFactory.create(fileInputStream);
		return workbook.getSheet(sheetNUm).getLastRowNum();
	    
	}

}
