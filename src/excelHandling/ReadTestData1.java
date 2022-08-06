package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestData1 {

	public static void main(String[] args) throws IOException {
		//path
		String path="C:\\Users\\INTEL\\eclipse-workspace\\AutomationProgram\\src\\excel  file\\testdata.xlsx";
		//create object file class
		File file=new File (path);
		//create input file stream
		FileInputStream fis=new FileInputStream(file);
		//workbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//sheet
		XSSFSheet sheet=wb.getSheetAt(0);
		//row
		XSSFRow row=sheet.getRow(0);
		
		String data = sheet.getRow(0).getCell(0).getStringCellValue();
		
		//row count
		int r1=sheet.getLastRowNum();
		int row_count=r1+1;
		System.out.println(row_count);

		//cell count
		int cell_count=row.getLastCellNum();
		System.out.println(cell_count);
		
		for(int i=0;i<row_count;i++)
		{
			for(int j=0;j<cell_count;j++)
			{
				String data1=sheet.getRow(i).getCell(j).getStringCellValue();
				System.err.println(data1 + " ");
				
			}
			System.out.println();
		}
		
	}

}
