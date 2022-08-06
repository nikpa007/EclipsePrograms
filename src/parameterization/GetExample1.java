package parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExample1 {

	public static void main(String[] args) throws IOException
	{
		//path
		String path = "C:\\Users\\INTEL\\Desktop\\testdata.xlsx";
		//create object file class
		File file=new File(path);
		
		FileInputStream f=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(f);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cell = row.getCell(0);
		
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		 String data1 = sheet.getRow(1).getCell(1).getStringCellValue();
		 System.out.println(data1);
		 
		 String data2 = wb.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
		 System.out.println(data2);
		 
		
		
		
		

	

	
		
	}

}
