package objectrep;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import GenericLib.Baseconfig;

public class InvoiceObjects extends Baseconfig {
//@FindBy(css = "#Fixed")
//	private static WebElement FixedInvoiceGeneration;//if we create methods inside the any 
//	object repository class then you want to call outside of this class for that we should 
//	mention webelement as STATIC like this webelement.
	// private String FixedInvoiceGeneration="#Fixed";

	@FindBy(css = "#Fixed")
	private  WebElement FixedInvoiceGeneration;
	
	@FindBy(id = "auto_BlockID")
	private  WebElement SelectionOfBlock;
	// private String SelectionOfBlock ="#auto_BlockID";

	@FindBy(xpath = "//*[@id='ui-id-38']")
	private  WebElement BlockIs;

	@FindBy(css = "#auto_ApartmentID")
	private  WebElement SelectionOfAppartment;
	// private String SelectionOfAppartment ="#auto_ApartmentID";

	@FindBy(css = "#BA2")
	private WebElement BasicAmountForOwnerPerSqureFeet;
	// String BasicAmountForOwnerPerSqureFeet= "#BA2";

	@FindBy(css = "#BA1")
	private  WebElement BasicAmountForOwnerPerMonth;
	// private String BasicAmountForOwnerPerMonth= "#BA1";

	@FindBy(css = "#BAT1")
	private WebElement BasicAmountForTenant;
	// private String BasicAmountForTenant= "#BAT1";

	@FindBy(css = "#BAT2")
	private  WebElement BasicAmountForTenantperSqureFeet;
	// private String BasicAmountForTenantperSqureFeet= "#BAT2";

	@FindBy(css = "#CH1")
	private  WebElement checkboxfortaxowner;
	// private String checkboxfortaxowner="#CH1";

	@FindBy(css = "#CH2")
	private  WebElement checkboxfortaxfortenant;
	// private String checkboxfortaxfortenant="#CH2";

	@FindBy(css = "#OPB1")
	private WebElement OpeningBal;
	// private String OpeningBal="#OPB1";

	@FindBy(css = "#x1")
	private  WebElement Narration1;
	// private String Narration1 ="#x1";

	@FindBy(css = "#x2")
	private  WebElement Narration2;
	// private String Narration2= "#x2";

	@FindBy(css = "#Gen")
	private  WebElement Generate;
	// private String Generate="Gen";

	@FindBy(id = "Generate")
	private  WebElement window;

	@FindBy(id = "GenInv")
	private  WebElement FinalGeneration;
	
	

//	public void FilingFixedInvoiceForm() throws InterruptedException {
//		commmethods.click(FixedInvoiceGeneration);
//		commmethods.sleep();
//		commmethods.SetData(SelectionOfBlock, "Block 3");
//		commmethods.sleep();
//		commmethods.SetData(SelectionOfAppartment, "1");
//		commmethods.SetData(BasicAmountForOwnerPerMonth, "12");
//		commmethods.SetData(BasicAmountForOwnerPerSqureFeet, "0.00");
//		commmethods.SetData(BasicAmountForTenant, "");
//		commmethods.SetData(BasicAmountForTenantperSqureFeet, "0.00");
//		commmethods.checkboxSelect(checkboxfortaxowner, "Yes");
//		commmethods.checkboxSelect(checkboxfortaxfortenant, "Yes");
//		commmethods.checkboxSelect(OpeningBal, "Yes");
//		commmethods.sendkeys(Narration1, ".");
//		commmethods.sendkeys(Narration2, ".");
//		commmethods.click(Generate);
//		commmethods.sleep();
//		// commmethods.AlertHandling();
//	}

	
	public WebElement getFixedInvoiceGeneration() {
		return FixedInvoiceGeneration;
	}

	public WebElement getSelectionOfBlock() {
		return SelectionOfBlock;
	}

	public WebElement getBlockIs() {
		return BlockIs;
	}

	public WebElement getSelectionOfAppartment() {
		return SelectionOfAppartment;
	}

	public WebElement getBasicAmountForOwnerPerSqureFeet() {
		return BasicAmountForOwnerPerSqureFeet;
	}

	public WebElement getBasicAmountForOwnerPerMonth() {
		return BasicAmountForOwnerPerMonth;
	}

	public WebElement getBasicAmountForTenant() {
		return BasicAmountForTenant;
	}

	public WebElement getBasicAmountForTenantperSqureFeet() {
		return BasicAmountForTenantperSqureFeet;
	}

	public WebElement getCheckboxfortaxowner() {
		return checkboxfortaxowner;
	}

	public WebElement getCheckboxfortaxfortenant() {
		return checkboxfortaxfortenant;
	}

	public WebElement getOpeningBal() {
		return OpeningBal;
	}

	public WebElement getNarration1() {
		return Narration1;
	}

	public WebElement getNarration2() {
		return Narration2;
	}

	public WebElement getGenerate() {
		return Generate;
	}

	public WebElement getWindow() {
		return window;
	}

	public WebElement getFinalGeneration() {
		return FinalGeneration;
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
