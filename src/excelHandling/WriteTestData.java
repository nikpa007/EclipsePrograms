package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteTestData {

	public static void main(String[] args) throws IOException
{
		String path="C:\\Users\\INTEL\\eclipse-workspace\\AutomationProgram\\src\\excel  file\\testdata.xlsx";
		//File 
		File file=new File(path);
		//fileinputstream
		FileInputStream fis=new FileInputStream(file);
		//workbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//sheet
		XSSFSheet sheet=wb.getSheet("Sheet1");
		//row
		sheet.getRow(1).createCell(2).setCellValue("Pass");
		sheet.getRow(2).createCell(2).setCellValue("Fail");
		
		//to save output
		FileOutputStream fos=new FileOutputStream(file);
		wb.write(fos);
		wb.close();
		System.out.println("Data save successfully");
		
		
	}

}
