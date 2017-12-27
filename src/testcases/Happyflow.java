package testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import GenericLib.Baseconfig;
import GenericLib.Dataprovider;
import GenericLib.Excellconfig;
import objectrep.HomePageObjects;

@Listeners(GenericLib.SampleLisner.class)

public class Happyflow extends Baseconfig {

	@Test(dataProvider = "Regression", dataProviderClass = Dataprovider.class)
	public void Regression(String Block, String Appatment, String OwnerAmount, String Squrefeet, String Tenantamount,
			String TenantSqurefeet, String Ownertaxcheck, String TenantTaxCheck, String OpeningBal, String Narration,
			String Narrationn) throws InterruptedException {
		commmethods.sleep();
		commmethods.sendkeys(loginobjects.getUsername_Edit(), "DEMO_12");
		commmethods.sendkeys(loginobjects.getUsername_Edit(), "DEMO_12");
		commmethods.click(loginobjects.getChech_Bttn());
		commmethods.click(loginobjects.getLogin_Bttn());
		commmethods.click(HomePageObjects.getApplication());
		commmethods.click(HomePageObjects.getSocietyInvoice());
		commmethods.click(invoiceObjects.getFixedInvoiceGeneration());
		commmethods.sleep();
		commmethods.SetData(invoiceObjects.getSelectionOfBlock(), Block);
		commmethods.sleep();
		commmethods.SetData(invoiceObjects.getSelectionOfAppartment(), Appatment);
		commmethods.SetData(invoiceObjects.getBasicAmountForOwnerPerMonth(), OwnerAmount);
		commmethods.SetData(invoiceObjects.getBasicAmountForOwnerPerSqureFeet(),Squrefeet );
		commmethods.SetData(invoiceObjects.getBasicAmountForTenant(), Tenantamount);
		commmethods.SetData(invoiceObjects.getBasicAmountForTenantperSqureFeet(),TenantSqurefeet);
		commmethods.checkboxSelect(invoiceObjects.getCheckboxfortaxowner(),Ownertaxcheck );
		commmethods.checkboxSelect(invoiceObjects.getCheckboxfortaxfortenant(), TenantTaxCheck);
		commmethods.checkboxSelect(invoiceObjects.getOpeningBal(),OpeningBal );
		commmethods.sendkeys(invoiceObjects.getNarration1(),Narration);
		commmethods.sendkeys(invoiceObjects.getNarration2(),Narrationn );
		commmethods.click(invoiceObjects.getGenerate());
		commmethods.sleep();

		// invoiceObjects.FilingFixedInvoiceForm();
		invoiceObjects.clicking();
		invoiceObjects.clickingonGeneration();
		invoiceObjects.gettingnumberofinvoice();
		financeVouchersObjects.Clickonvoacher();

	}

}
