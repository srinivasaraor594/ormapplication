package testcases;

import org.testng.annotations.Test;

import GenericLib.Baseconfig;

public class Happyflow extends Baseconfig {

	@Test
	public void Regression() throws InterruptedException {
		loginobjects.ValidLogin();
		homeobjects.clickOnApplication();
		homeobjects.ClickonSocietyinvoicing();
		invoiceObjects.FilingFixedInvoiceForm();

	}

}
