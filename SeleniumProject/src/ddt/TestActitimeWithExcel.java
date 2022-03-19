package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testNgProgram.Utility;

public class TestActitimeWithExcel extends Utility {

	public String readTestData(String filename, String sheetname, int rownum, int cellnum) throws IOException {

		FileInputStream fis = new FileInputStream(filename);
		
		Workbook workbook = new XSSFWorkbook(fis);
		
		Sheet sheet = workbook.getSheet("sheetname");
		
		Row row = sheet.getRow(rownum);
		
		Cell cell = row.getCell(cellnum);

		return row.getCell(cellnum).getStringCellValue();
	}

	String appUrl, username, pass;
	WebDriver driver;

	@BeforeTest
	public void xcelData() throws IOException {
		appUrl = readTestData("F:\\excel\\Book1.xlsx", "loginsheet", 1, 0);

	}
	
	@BeforeMethod
	public void setup() {
		driver=setUp("chrome",appUrl);
	}
	
}
