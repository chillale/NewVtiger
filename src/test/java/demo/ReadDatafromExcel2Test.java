package demo;

import java.io.FileInputStream;



import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDatafromExcel2Test{
	public static void main(String[] args) throws Throwable {
		//DataFormatter df=new DataFormatter();
	FileInputStream fis=new FileInputStream("./Sravan.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Sheet1");
    	 
int row=sh.getLastRowNum();
//int cell=sh.getRow(0).getLastCellNum();
System.out.println("The name of the employees earning more than 35000:");
//String data1="qa";
for(int i=1;i<=row;i++)
{
	//String data=df.formatCellValue(sh.getRow(i).getCell(2));
	double sal=sh.getRow(i).getCell(3).getNumericCellValue();
	//String data=sh.getRow(i).getCell(2).getStringCellValue();
	if(sal<35000)
	{
		System.out.println(sh.getRow(i).getCell(1).getStringCellValue());
	}
	/*if(data.equals("qa"))
	{
		System.out.println(sh.getRow(i).getCell(1).getStringCellValue());
	}*/
}
	

}

}