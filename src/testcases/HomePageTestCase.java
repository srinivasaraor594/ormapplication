package testcases;

import org.testng.annotations.Test;

import GenericLib.Baseconfig;
import GenericLib.Constants;
import objectrep.HomePageObjects;
import objectrep.loginobjects;

public class HomePageTestCase extends Baseconfig {
//protected WebDriver driver;
//	
//	
//	public HomePageTestCase(WebDriver driver) {
//		this.driver = driver;
//	}
//	
//	@BeforeClass
//	public WebDriver getDriver() {
//		return driver;
//	}
loginobjects loginobjects=new loginobjects();
	
	@Test
	public void Application() throws InterruptedException {
		//commmethods.navigatemethod(Constants.url);
		loginobjects.ValidLogin();
		homeobjects.clickOnApplication();
		homeobjects.ClickonSocietyinvoicing();

	}

}
