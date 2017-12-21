package testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import GenericLib.Baseconfig;


@Listeners(GenericLib.SampleLisner.class)

public class Happyflow extends Baseconfig {

	@Test
	public void Regression() throws InterruptedException {
		loginobjects.ValidLogin();
		homeobjects.clickOnApplication();
		homeobjects.ClickonSocietyinvoicing();
		invoiceObjects.FilingFixedInvoiceForm();
		invoiceObjects.clicking();
		invoiceObjects.clickingonGeneration();
		invoiceObjects.gettingnumberofinvoice();
		financeVouchersObjects.Clickonvoacher();
		
	}
	

}
