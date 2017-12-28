package GenericLib;

import java.io.File;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Dataprovider {

	 @DataProvider(name = "Regression")
	 public static Object[][] Regression() throws Exception {
	 Excellconfig config = new Excellconfig();
	 int rows = config.getRowcount(0);
	 System.out.println(rows);
	 int column = config.getColumnCount(0,7)+1;
	 System.out.println(column);
	 Object[][] data = new Object[rows-1][column];
	 for (int i = 7; i <rows; i++) {
	 for (int j = 0; j <column; j++) {
	 data[i-1][j] = config.GetCellData(0, i, j);
	 }   }
	 return data;
	 }
//	@DataProvider(name = "Regressionn")
//	public static Object[][] Regressionn() throws IOException, BiffException {
//		File fs = new File(Constants.excelconfig);
//		Workbook ws = Workbook.getWorkbook(fs);
//		Sheet s = ws.getSheet(1);
//		int rows = s.getRows();
//		System.out.println(rows);
//		int columns = s.getColumns();
//		String inputdata[][] = new String[rows - 2][columns];
//		for (int i = 2; i < rows; i++) {
//			for (int j = 0; j < columns; j++) {
//				Cell cl = s.getCell(j, i);
//				inputdata[i - 2][j] = cl.getContents();
//
//			}
//		}
//		return inputdata;
//
//	}

}
