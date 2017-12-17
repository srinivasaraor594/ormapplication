package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLib.Baseconfig;
import GenericLib.Globalmethods;
import objectrep.HomePageObjects;
import objectrep.loginobjects;

@Listeners(GenericLib.SampleLisner.class)
public class LoginpageTest extends Baseconfig {
	//loginobjects hp=PageFactory.initElements(Globalmethods.driver,loginobjects.class);
	
	//loginobjects loginobj=new loginobjects();
	 @Test()
	 public void gettingcredentials() throws Exception 
	 { 

		 loginobjects.ValidLogin();
		
		
		
		 //commmethods.ListOfElements(HomePageObjects.getMySocietyList(), "application");
	 }

//	@Test(priority = 1)
//	public void gettingforgatidandpassword() throws InterruptedException {
//		Reporter.log("TestScript Name: Forgot UserId And Forgot Password-------> GettingForgotIdAndPassWord", true);
//		Reporter.log("  ",true);
//		Thread.sleep(3000);
//		commmethods.clickbyxpath("//a[@href='/Login/ForgotUID']");
//		Thread.sleep(2000);
//		commmethods.sendkeysByXpath("//*[@id='email']", "srinivasaraor594@gmail.com");
//		commmethods.clickbyxpath("//button[text()='Get UserID']");
//		Thread.sleep(2000);
//		commmethods.IgnoreUnwantedPopups();
//		Thread.sleep(2000);
//		commmethods.AcceptAlert();
//		Thread.sleep(2000);
//		// driver.navigate().to(Constants.gmailurl);
//		commmethods.navigatemethod(Constants.gmailurl);
//		Thread.sleep(5000);
//		commmethods.sendkeysByXpath(".//*[@type='email']", " srinivasaraor594@gmail.com");
//		commmethods.clickbyxpath("//span[@class='RveJvd snByac']");
//		Thread.sleep(3000);
//		commmethods.sendkeysByXpath(".//*[@type='password']", "8500991792");
//		commmethods.clickbyxpath(".//span[@class='RveJvd snByac']");
//		Thread.sleep(5000);
//
//		try {
//			// commmethods.isDisplayebyxpath(".//*[@href='https://mail.google.com']");
//			commmethods.clickbyxpath(".//*[@href='https://mail.google.com']");
//			Thread.sleep(1000);
//		} catch (NoSuchElementException e) {
//			Thread.sleep(2000);
//			Globalmethods.driver.navigate().refresh();
//			Thread.sleep(4000);
//		}
//		Globalmethods.driver.navigate().refresh();
//		Thread.sleep(4000);
//		String UserId = commmethods.IdentifyUserIdInMailInbox();
//		System.out.println(UserId);
//		Globalmethods.driver.get(Constants.url);
//		Thread.sleep(3000);
//
//		commmethods.clickbyxpath("//a[@href='/Login/ForgotPass']");
//		Thread.sleep(1000);
//		commmethods.sendkeysByid("UID", UserId);
//		commmethods.sendkeysByid("email", "srinivasaraor594@gmail.com");
//		Thread.sleep(1000);
//		commmethods.clickbyxpath("//button[text()='Get Password']");
//		Thread.sleep(1000);
//		commmethods.IgnoreUnwantedPopups();
//		Thread.sleep(2000);
//		commmethods.AcceptAlert();
//		Thread.sleep(2000);
//		// driver.navigate().to(Constants.gmailurl);
//		commmethods.navigatemethod(Constants.gmailurl);
//		commmethods.waitforpagetoload();
//		String Password = commmethods.IdentifyUserpasswordInMailInbox();
//		commmethods.navigatemethod(Constants.url);
//		// try {
//		// Thread.sleep(5000);
//		// } catch (UnhandledAlertException e) {
//		// DesiredCapabilities dc = new DesiredCapabilities();
//		// dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
//		// UnexpectedAlertBehaviour.IGNORE);
//		// Globalmethods.driver.navigate().refresh();
//		commmethods.navigatemethod(Constants.url);
//		commmethods.sendkeysByid("UserName", UserId);
//		commmethods.sendkeysByid("Password", Password);
//
//	}

}
