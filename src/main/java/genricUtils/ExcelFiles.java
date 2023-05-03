package genricUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFiles {
	public String readDataFromExcelFile(String sheetName, int rowNumber, int cellNumber) throws Throwable {
		FileInputStream fileInputStream = new FileInputStream("./InterviewExcel.xlsx");
		Workbook workBook = WorkbookFactory.create(fileInputStream);
		Sheet sheet = workBook.getSheet(sheetName);
		Row rowNum = sheet.getRow(rowNumber);
		Cell cellNum = rowNum.getCell(cellNumber);
		String value = cellNum.getStringCellValue();
		return value;
		
	}
	
	public int getLastRowNum(String sheetName) throws Throwable {
		FileInputStream fileInputStream = new FileInputStream("./InterviewExcel.xlsx");
		Workbook workBook = WorkbookFactory.create(fileInputStream);
		return workBook.getSheet(sheetName).getLastRowNum();
	}

}
