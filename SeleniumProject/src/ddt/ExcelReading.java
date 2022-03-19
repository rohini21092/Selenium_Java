package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ExcelReading {
	
	@Test
	public void getSheetName() throws IOException {
		FileInputStream fis =new FileInputStream("F:\\excel\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheetcount= workbook.getNumberOfSheets();
		System.out.println("total sheet count "+sheetcount);
		System.out.println("active sheet index :"+workbook.getActiveSheetIndex());
		for(int i=0;i<sheetcount;i++) {
			System.out.println("sheet name="+workbook.getSheetName(i));
		}
	}

	@Test
	public void getRowOperation() throws IOException {
		FileInputStream fis = new FileInputStream("F:\\excel\\Book1.xlsx");		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("loginsheet");
		int rowcount = sheet.getLastRowNum();
		System.out.println("row count ="+rowcount);
		XSSFRow row =sheet.getRow(0);
		
	}
	

	@Test
	public void getCellOperation() throws IOException { 
		FileInputStream fis = new FileInputStream("F:\\excel\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("loginsheet");
		System.out.println("sheet count = "+workbook.getNumberOfSheets());
		XSSFRow row = sheet.getRow(0);
		System.out.println("row count ="+row.getLastCellNum());
		
		for(int i=0;i<row.getLastCellNum();i++) {
			System.out.print(row.getCell(i).getStringCellValue()+"\t");
		}
		
	}
	
	@Test
	public void getDifferentCellValues() throws IOException {
		FileInputStream fis =new FileInputStream("F:\\excel\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheetcount= workbook.getNumberOfSheets();
		System.out.println("total sheet count "+sheetcount);
		
		XSSFSheet sheet = workbook.getSheet("loginsheet");
		XSSFRow row= sheet.getRow(0);
		System.out.println("cell count in row="+sheet.getLastRowNum());
		for(int i=0;i<sheet.getLastRowNum();i++) {
			XSSFCell cell = row.getCell(i);
			switch(cell.getCellType())
			{
			case STRING:
				System.out.println(cell.getStringCellValue());
				break;
			case NUMERIC:
				System.out.println(cell.getStringCellValue());
				break;
			case BOOLEAN:
				System.out.println(cell.getStringCellValue());
				break;
			case BLANK:
				System.out.println(cell.getStringCellValue());
				break;
			default:
				throw new RuntimeException("There is no support for this type of cell");
				
			}
		}				
	}
	
//	@Test
//	public void getDifferentCellValues2() throws IOException {
//		FileInputStream fis = new FileInputStream("F:\\excel\\Book1.xlsx");
//		Workbook workbook =new XSSFWorkbook(fis);
//		
//		Workbook x = new XSSFWorkbook(fis);
//		// 3. get sheet
//		Sheet sheet = x.getSheet("LoginDetails");
//		// 4. get row count
//		int rowCount = sheet.getLastRowNum();
//		for (int i = 0; i <= rowCount; i++) {
//			Row row =sheet.getRow(i);
//			Cell cell=row.getCell(0);
//			// or
////			Cell cell=sheet.getRow(i).getCell(0);
//			System.out.println(cell.getStringCellValue());
//			// or
//		}

	//}
	
	
}
