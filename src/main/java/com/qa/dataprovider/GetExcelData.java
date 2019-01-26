package com.qa.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExcelData {
	FileInputStream Fis;
	XSSFWorkbook Workbook;
	XSSFSheet Sheet;
	File file;

	public Object[][] getdata(String SheetName, String ExcelLocation) throws IOException {
		file = new File(ExcelLocation);
		Fis = new FileInputStream(file);
		Workbook = new XSSFWorkbook(Fis);
		Sheet = Workbook.getSheet(SheetName);
		Object[][] data1 = new Object[Sheet.getLastRowNum()][Sheet.getRow(0).getLastCellNum()];
		for (int row = 0; row < Sheet.getLastRowNum(); row++) {
			for (int col = 1; col < Sheet.getRow(0).getLastCellNum(); col++) {
				data1[row][col] = Sheet.getRow(row + 1).getCell(col).getStringCellValue();
			}
		}
		return data1;
	}

}
