package objectrep;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLib.Baseconfig;

public class FinanceVouchersObjects extends Baseconfig {
	
	@FindBy(xpath="//a[@href='/Voucher']")
	private static WebElement FinaceVoachers;
	
	@FindBy(id="searchgrid")
	private static WebElement Search_Btun;
	
	@FindBy(id="jqg1")
	private static WebElement Search_Edit;
	
	@FindBy(id="fbox_Grid_search")
	private static WebElement Find_Butn;
	
	
	public void Clickonvoacher(){
		commmethods.click(FinaceVoachers);
		}
	
	public void ClickonSearch()
	{
		commmethods.click(Search_Btun);
	}	
	public void DataPassingToSearch() throws InterruptedException{
		commmethods.sendkeys(Search_Edit, invoiceObjects.gettingnumberofinvoice());
	}
	public void Find(){
		commmethods.click(Find_Butn);
	}
}
