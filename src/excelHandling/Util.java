package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Util {

	public String getDataFromExcel(String sheetname,int r,int c) throws IOException
	{
		//path
		String path="C:\\Users\\INTEL\\eclipse-workspace\\AutomationProgram\\src\\excel  file\\testdata.xlsx";
		//creat  object file class
		File file=new File(path);
		//file stream
		FileInputStream f=new FileInputStream(file);
		//workbook
		XSSFWorkbook wb=new XSSFWorkbook(f);
		
		//sheet
		XSSFSheet sheet=wb.getSheet(sheetname);
		//row and column
		String data=sheet.getRow(r).getCell(c).getStringCellValue();
		return data;
		
	}

}
