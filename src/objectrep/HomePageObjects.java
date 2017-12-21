package objectrep;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import GenericLib.Baseconfig;

public class HomePageObjects extends Baseconfig {
	// private WebDriver driver;
	//
	// public HomePageObjects(WebDriver driver){
	// this.driver=driver;
	// }

	// public HomePageObjects(WebDriver driver) {
	//
	// this.driver = driver;
	// PageFactory.initElements(driver, this);
	// }

	// @FindBys(value="nav navbar-nav navbar-right", value = { @FindBy })
	// private List<WebElement> TopModules;

	@FindBy(className = "category-box border-1 wow fadeInUpQuick animated")
	private WebElement MySocietyList;

	private String application = "//a[@class='btn btn-warning main-menu']";
	private String SocietyInvoice = "//img[@src='/content/img/504.png']";

	@FindBy(className = "category-box border-1 wow fadeInUpQuick animated")
	private WebElement applicationbttn;
	
	

	// @FindBy(xpath = "//a[@class='btn btn-warning main-menu']")
	// private WebElement application;

	// @FindBy(xpath = "//a[@class='btn btn-warning main-menu']")
	// private WebElement SocietyInvoice;

	public void clickOnApplication() throws InterruptedException {
		commmethods.sleep();
		commmethods.clickbyxpat(application);
	}

	public void ClickonSocietyinvoicing() {
		commmethods.clickbyxpat(SocietyInvoice);
	}
	
}
