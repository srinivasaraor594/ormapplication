package GenericLib;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

public class Globalmethods {

	public static WebDriver driver;
	static ITestResult Result;

	public void Init() {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("media.navigator.permission.disabled", true);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(Constants.url);

	}

	public void quite() throws InterruptedException {
		driver.quit();
		Thread.sleep(2000);
	}

	public void IgnoreUnwantedPopups() {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
	}

	public void AcceptAlert() {
		Alert alert = driver.switchTo().alert();
		String PopupText = alert.getText();
		System.out.println("Popup came as : " + PopupText);
		alert.accept();
	}

	public void setdata(WebElement wb, String data) {

		wb.clear();

		wb.sendKeys(data);
	}

	public boolean IsDiplayed(WebElement element) {
		try {
			element.isDisplayed();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return false;
	}

	public void click(WebElement element) {
		if (IsDiplayed(element)) {
			element.click();
		}
	}

	/*
	 * public void sendkeysByid(WebElement webElement, String data) {
	 * setdata(webElement,data); }
	 */

	public void SendKeysById(String id, String value) {
		driver.findElement(By.id(id)).sendKeys(value);
	}

	public void clickbyid(String Element) {
		driver.findElement(By.id(Element)).click();
	}

	public void sendkeys(WebElement wb,String data ){
		wb.sendKeys(data);
	}
	
	
	public void clickbyxpath(WebElement wb) {
		wb.click();
	}
//	public void Thread(WebElement wb){
//		wb.wait(TimeUnit.NANOSECONDS, 10);
//	}

	public void sendkeysByXpath(String Element, String data) {
		driver.findElement(By.xpath(Element)).sendKeys(data);
	}

	

	public void navigatemethod(String Url) throws InterruptedException {
		// driver.navigate().to();
		driver.navigate().to(Url);
		Thread.sleep(3000);
	}

	// public void listofelementsByxpath(WebElement elements, WebElement
	// xpathofallelements) {
	// try {
	// if (IsDiplayed(xpathofallelements)) {
	//
	// List<WebElement> lstelement =
	// driver.findElements(By.xpath(xpathofallelements));
	// for (WebElement element : lstelement) {
	// if (element.equals(xpathofperticularelement)) {
	// element.click();
	// }
	// }
	// }
	//
	// } catch (NoSuchElementException e) {
	// e.printStackTrace();
	//
	// }
	// }

	//
	// boolean isDisplayebyid(String ID) {
	// return driver.findElement(By.id(ID)).isDisplayed();
	// }
	//
	// public boolean isDisplayebyxpath(String Xpath) {
	// return driver.findElement(By.id(Xpath)).isDisplayed();
	// }

	public void gettextbyid(String id) {
		driver.findElement(By.id(id));
	}

	public void gettextbyxpath(String xpath) {
		driver.findElement(By.xpath(xpath)).getText();
	}

	public void ListOfElements(List<WebElement> lst, String PerticularElement) {
		// List<WebElement> ListElements=driver.findElements(By.xpath(wb));
		for (WebElement element : lst) {
			if (element.equals(PerticularElement)) {
				element.click();
			}
		}

	}

	// public void listofelemnts(List<WebElement>elements, String data){
	// for(WebElement element: elements){
	// if(element.getAttribute("title").equalsIgnoreCase(data));
	// element.click();
	// break;
	// }
}
