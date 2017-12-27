package GenericLib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.format.CellFormat;

public class Excellconfig {

	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;

	public Excellconfig() throws IOException {
		// TODO Auto-generated constructor stub
		FileInputStream fis = new FileInputStream(Constants.excelconfig);
		workbook = new XSSFWorkbook(fis);
	}

	public int getColumnCount(int sheeIndex) {
		sheet = workbook.getSheetAt(sheeIndex);
		row = sheet.getRow(0);
		int colCount = row.getLastCellNum();

		return colCount;

	}

	public int getRowcount(int SheetIndex) {
		int rowCount = workbook.getSheetAt(SheetIndex).getLastRowNum();
		rowCount = rowCount + 1;
		return rowCount;
	}
	// public int getcellcount(int sheetIndex){
	// int cellcount=workbook.getSheetAt(sheetIndex).getLastRowNum
	// }
	//

	public String GetCellData(int sheetnum, int rownum, int cellnum) {
		DataFormatter df = new DataFormatter();
		sheet = workbook.getSheetAt(sheetnum);

		Cell cell = sheet.getRow(rownum).getCell(cellnum);
		
		String celldata=df.formatCellValue(cell); 
		System.out.println(celldata);
		return celldata;
	}
}

//Workbook wb = WorkbookFactory.create(new File("myfile.xls"));
//DataFormatter df = new DataFormatter();
//
//Sheet s = wb.getSheetAt(0);
//Row r1 = s.getRow(0);
//Cell cA1 = r1.getCell(0);
//
//String asItLooksInExcel = df.formatCellValue(cA1);

// int colCount = sheet.getRow(0).getLastCellNum();System.out.println(colCount);
// Object[][] RegressionData = new Object[rowCount][colCount];for(
// int rCnt = 1;rCnt<rowCount;rCnt++)
// {
// for (int cCnt = 0; cCnt < colCount; cCnt++) {
// RegressionData[rCnt - 1][cCnt] =workbook.g
// System.out.println(RegressionData[rCnt - 1][cCnt]);
// }
// }return RegressionData;
// }}

// public Object[][] testData(String FilePath, String sheetName) throws
// Exception {
// Object[][] excelData = null;
// eat = new ExcelApiTest(FilePath);
// int rows = eat.getRowCount(sheetName);
// int columns = eat.getColumnCount(sheetName);
// excelData = new Object[rows - 1][columns];
// for (int i = 1; i < rows; i++) {
// for (int j = 0; j < columns; j++) {
// excelData[i - 1][j] = eat.getCellData(sheetName, j, i);
// }
// }
// return excelData;
// }

// @DataProvider(name = "AdminPostageAndCourier")
// public static Object[][] AdminPostageAndCourier() throws IOException,
// BiffException {
// File fs = new File("");
// Workbook ws = Workbook.getWorkbook(fs);
// Sheet s = ws.getSheet("AdminPostageAndCourier");
// int rows = s.getRows();
// int columns = s.getColumns();
// String inputdata[][] = new String[rows - 1][columns];
// for (int i = 1; i < rows; i++) {
// for (int j = 0; j < columns; j++) {
// Cell cl = s.getCell(j, i);
// inputdata[i - 1][j] = cl.getContents();
// }
// }
// return inputdata;
// }

// public static String getCellData(String sheet, int rCnt, int cCnt) throws
// Exception {
// sheet = workbook.getSheet(Sheet1);
// row = sheet.getRow(rCnt);
// String columndata = row.getCell(cCnt).getStringCellValue();
// workbook.close();
// return columndata;}
//
