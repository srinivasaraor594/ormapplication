package objectrep;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import GenericLib.Baseconfig;

public class InvoiceObjects extends Baseconfig {
	@FindBy(css = "#Fixed")
	private static WebElement FixedInvoiceGeneration;
	// private String FixedInvoiceGeneration="#Fixed";

	@FindBy(id = "auto_BlockID")
	private static WebElement SelectionOfBlock;
	// private String SelectionOfBlock ="#auto_BlockID";

	@FindBy(xpath = "//*[@id='ui-id-38']")
	private static WebElement BlockIs;

	@FindBy(css = "#auto_ApartmentID")
	private static WebElement SelectionOfAppartment;
	// private String SelectionOfAppartment ="#auto_ApartmentID";

	@FindBy(css = "#BA2")
	private static WebElement BasicAmountForOwnerPerSqureFeet;
	// String BasicAmountForOwnerPerSqureFeet= "#BA2";

	@FindBy(css = "#BA1")
	private static WebElement BasicAmountForOwnerPerMonth;
	// private String BasicAmountForOwnerPerMonth= "#BA1";

	@FindBy(css = "#BAT1")
	private static WebElement BasicAmountForTenant;
	// private String BasicAmountForTenant= "#BAT1";

	@FindBy(css = "#BAT2")
	private static WebElement BasicAmountForTenantperSqureFeet;
	// private String BasicAmountForTenantperSqureFeet= "#BAT2";

	@FindBy(css = "#CH1")
	private static WebElement checkboxfortaxowner;
	// private String checkboxfortaxowner="#CH1";

	@FindBy(css = "#CH2")
	private static WebElement checkboxfortaxfortenant;
	// private String checkboxfortaxfortenant="#CH2";

	@FindBy(css = "#OPB1")
	private static WebElement OpeningBal;
	// private String OpeningBal="#OPB1";

	@FindBy(css = "#x1")
	private static WebElement Narration1;
	// private String Narration1 ="#x1";

	@FindBy(css = "#x2")
	private static WebElement Narration2;
	// private String Narration2= "#x2";

	@FindBy(css = "#Gen")
	private static WebElement Generate;
	// private String Generate="Gen";

	@FindBy(id = "Generate")
	private static WebElement window;

	@FindBy(id = "GenInv")
	private static WebElement FinalGeneration;
	
	

	public void FilingFixedInvoiceForm() throws InterruptedException {
		commmethods.click(FixedInvoiceGeneration);
		commmethods.sleep();
		commmethods.SetData(SelectionOfBlock, "Block 3");
		commmethods.sleep();
		commmethods.SetData(SelectionOfAppartment, "1");
		commmethods.SetData(BasicAmountForOwnerPerMonth, "12");
		commmethods.SetData(BasicAmountForOwnerPerSqureFeet, "0.00");
		commmethods.SetData(BasicAmountForTenant, "");
		commmethods.SetData(BasicAmountForTenantperSqureFeet, "0.00");
		commmethods.checkboxSelect(checkboxfortaxowner, "Yes");
		commmethods.checkboxSelect(checkboxfortaxfortenant, "Yes");
		commmethods.checkboxSelect(OpeningBal, "Yes");
		commmethods.sendkeys(Narration1, ".");
		commmethods.sendkeys(Narration2, ".");
		commmethods.click(Generate);
		commmethods.sleep();
		// commmethods.AlertHandling();
	}

	public void clicking() {
		commmethods.click(window);
	}

	public void clickingonGeneration() throws InterruptedException {
		commmethods.click(FinalGeneration);
		commmethods.sleep();
	}

	public String gettingnumberofinvoice() throws InterruptedException {
		commmethods.sleep();
		String msg = commmethods.AlertHandling();
		String message=msg.split(" ")[1];
		System.out.println(message);
		return message;
	}
	


}
