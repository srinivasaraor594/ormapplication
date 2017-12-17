package GenericLib;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import objectrep.HomePageObjects;
import objectrep.InvoiceObjects;
import objectrep.loginobjects;
import testcases.Happyflow;

public class Baseconfig {
//	private WebDriver driver;
	//protected static loginobjects logobjects=PageFactory.initElements(Globalmethods.driver,loginobjects.class);
	//protected static loginobjects logobjects = new loginobjects();
	protected static Globalmethods commmethods = new Globalmethods();
	protected static Webdriverwaitstatemts webdriverwait = new Webdriverwaitstatemts();
	protected static SampleLisner scrreenshoot=new SampleLisner();
	protected static Excellconfig Excell=new Excellconfig();
	protected static loginobjects loginobjects=new loginobjects();
	protected static InvoiceObjects invoiceObjects=new InvoiceObjects();
	protected static HomePageObjects homeobjects=new HomePageObjects();
	
//	
//	public WebDriver getDriver() {
//		return driver;
//	}

	
	@BeforeClass
	public void initialize() throws InterruptedException {
		commmethods.Init();
		PageFactory.initElements(Globalmethods.driver,loginobjects.class);
		PageFactory.initElements(Globalmethods.driver,HomePageObjects.class);
		PageFactory.initElements(Globalmethods.driver,InvoiceObjects.class);
		PageFactory.initElements(Globalmethods.driver,Happyflow.class);
		
		Thread.sleep(2000);

		// commmethods.navigatemethod(Constants.url);
		// driver.manage().window().maximize();
		// driver.findElement(By.id("UserName")).sendKeys("DEMO_12");
		// commmethods.sendkeysByid("UserName"," DEMO_12");
		// driver.findElement(By.id("Password")).sendKeys("Password");
		// driver.findElement(By.id("TnC")).click();
		// commmethods.sendkeysByid("Password", "Password");
		// driver.findElement(By.id("logsave")).click();
		// commmethods.clickbyid("logsave");

		// commmethods.clickbyid("logsave");
	}

	// @AfterMethod
	// public void aftermethod(){
	// commmethods.listofelementsBytagname(".//i[@class='fa fa-power-off']",
	// "//ul[@class='nav navbar-nav navbar-right']");
	// }
	//
	//
//	 @AfterClass
//	 public void teardown() throws InterruptedException{
//	 commmethods.quite();
//	 }

}
