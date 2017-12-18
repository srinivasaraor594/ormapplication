package GenericLib;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excellconfig {

	protected Globalmethods Globalmethods=new Globalmethods();
	
	public static String gettingecelldata() throws Exception
{
		FileInputStream fis=new FileInputStream("");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet  sheet=workbook.getSheetAt(1);
		XSSFRow row=sheet.getRow(1);
		String columndata=row.getCell(1).getStringCellValue();
		workbook.close();
		return columndata;
}}
