package GenericLib;


import org.testng.annotations.DataProvider;

public class Dataprovider {

	@DataProvider(name = "Regression")
	public static Object[][] Regression() throws Exception {

		Excellconfig config = new Excellconfig(Constants.excelconfig);
		int rows = config.getRowcount(0);
		int column=config.getColumnCount(0);

		Object[][] data = new Object[rows][column];
		for (int i = 1; i <= rows; i++) {
			for(int j=1;j<column;j++){

			data[i][j] = config.GetCellData(0, i, j);

		}
		}
		return data;

	}}
