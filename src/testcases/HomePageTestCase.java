package testcases;

import org.testng.annotations.Test;

import GenericLib.Baseconfig;
import GenericLib.Constants;
import objectrep.HomePageObjects;

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
//	
	
	@Test()
	public void Application() throws InterruptedException {
		//commmethods.navigatemethod(Constants.url);
		commmethods.ListOfElements(HomePageObjects.getTopModules(), "Application");
		commmethods.ListOfElements(HomePageObjects.getMySocietyList(), "My Facilities");
		
		

	}

}
