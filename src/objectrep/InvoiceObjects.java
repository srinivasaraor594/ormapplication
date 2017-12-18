package objectrep;

import GenericLib.Baseconfig;

public class InvoiceObjects extends  Baseconfig{

	private String FixedInvoiceGeneration="#Fixed";
	private String SelectionOfBlock ="#auto_BlockID";
	private String SelectionOfAppartment ="#auto_ApartmentID";

	private String BasicAmountForOwnerPerSqureFeet= "#BA2";
	
	private String BasicAmountForOwnerPerMonth= "#BA1";
	
	private String BasicAmountForTenant= "#BAT1";
	
	private String BasicAmountForTenantperSqureFeet= "#BAT2";
	
	
	
	//private string BasicAmountForOwner= "#BA1";
	//private string BasicAmountForOwner= "#BA1";
	//private string BasicAmountForOwner= "#BA1";

	
   
	
	
	
	
	public void FilingFixedInvoiceForm() throws InterruptedException{
		commmethods.clickbyCSS(FixedInvoiceGeneration);
		commmethods.sleep();
		commmethods.sendkeysByCss(SelectionOfBlock,"Ratna");
		commmethods.sendkeysByCss(SelectionOfAppartment,"Rx3" );
		commmethods.setdataByCss(BasicAmountForOwnerPerMonth, "12");
		commmethods.setdataByCss(BasicAmountForOwnerPerSqureFeet, "0.00");
		commmethods.setdataByCss(BasicAmountForTenant, "");
		commmethods.setdataByCss(BasicAmountForTenantperSqureFeet, "");
		
	}
	


	



	
	
}
