package GenericLib;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import objectrep.HomePageObjects;
import objectrep.loginobjects;

public class Baseconfig {
	
	//protected static loginobjects logobjects=PageFactory.initElements(Globalmethods.driver,loginobjects.class);
	//protected static loginobjects logobjects = new loginobjects();
	protected Globalmethods commmethods = new Globalmethods();
	protected static Webdriverwaitstatemts webdriverwait = new Webdriverwaitstatemts();
	protected static SampleLisner scrreenshoot=new SampleLisner();
	//protected loginobjects objects=new loginobjects();
	//protected static HomePageObjects homeobjects=new HomePageObjects();
	@BeforeClass
	public void initialize() throws InterruptedException {
		commmethods.Init();
		PageFactory.initElements(Globalmethods.driver,loginobjects.class);
		
		
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
