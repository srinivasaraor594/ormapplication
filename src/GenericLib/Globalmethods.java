package GenericLib;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
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
	
	public String AlertHandling(){
		Alert alert=driver.switchTo().alert();
		String message=alert.getText();
		System.out.println("Pop up is"+ message);
		alert.accept();
		return message;
	}
	
//
//	public void AcceptAlert() {
//		Alert alert = driver.switchTo().alert();
//		String PopupText = alert.getText();
//		System.out.println("Popup came as : " + PopupText);
//		alert.accept();
//	}
	public void DropeDownHandling(WebElement element,int index){
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public void refresh(){
		driver.navigate().refresh();
	}
	
	
	public void ActionsClass(WebElement Element1, WebElement Element2) throws InterruptedException{
		Actions actions=new  Actions(driver);
		
		actions.doubleClick(Element1).perform();
		sleep();
		click(Element2);
//		actions.moveToElement(Element2).perform();
//		actions.click().perform();
	}
	
//	public void SetDataforblock(WebElement selectionOfBlock, String string) {
//		selectionOfBlock.click();
//		
//		selectionOfBlock.sendKeys(string);
//		
//	}

	public void SetData(WebElement wb, String data) {
		wb.click();
		wb.clear();
		wb.sendKeys(data);
		
	}
public void clear(WebElement wb){
	wb.clear();
}
	public boolean IsDiplayed(WebElement wb) {
		try {
			wb.isDisplayed();

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return false;
	}

	public void findby(WebElement wb) {
		wb.click();

	}

	// public void Checkboxclick(String element) {
	// if (IsSlected(element)) {
	// driver.findElement(By.id(element)).click();
	// }
	// }
	public void checkboxSelect(WebElement openingBal, String choose) throws InterruptedException {
		// WebElement checkbox = driver.findElement(By.cssSelector(openingBal));
		String selectcheckbox = "yes";
		if (selectcheckbox.equals(choose)) {
			if (openingBal.isSelected() == true) {
				System.out.println("Tax is Selected");

			} else {

				openingBal.click();
				Thread.sleep(1000);

			}
		} else {
			if (openingBal.isSelected() == true) {

				openingBal.click();
				Thread.sleep(1000);
			} else {
				System.out.println("Tax not selected");
			}
		}
	}

	public boolean IsSlected(WebElement wb) {
		try {

			wb.isSelected();

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return false;
	}

	public void click(WebElement element) {

		element.click();
	}

	/*
	 * public void sendkeysByid(WebElement webElement, String data) {
	 * setdata(webElement,data); }
	 */
	//
	// public void SendKeysById(String id, String value) {
	// driver.findElement(By.id(id)).sendKeys(value);
	// }

	// public void click(WebElement chech_Bttn) {
	// chech_Bttn.click();
	// }

	public void sendkeys(WebElement wb, String data) {
		wb.sendKeys(data);
	}

	// public void sendkeysByCss(String wb, String data) {
	// driver.findElement(By.cssSelector(wb)).sendKeys(data);
	// }

	// public void clickbyxpath(WebElement application) {
	//
	// driver.findElement(By.xpath(application)).click();
	// }

	public void clickbyxpat(String application) {

		driver.findElement(By.xpath(application)).click();
	}

	public void clickbyCSS(String data) {

		driver.findElement(By.cssSelector(data)).click();
	}

	// public void Thread(WebElement wb){
	// wb.wait(TimeUnit.NANOSECONDS, 10);
	// }

	// public void sendkeysByXpath(String Element, String data) {
	// driver.findElement(By.xpath(Element)).sendKeys(data);
	// }
	//
	//

	public void sleep() throws InterruptedException {
		// driver.navigate().to();
		// driver.navigate().to(Url);
		Thread.sleep(1000);
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

	public void gettext(WebElement wb) {
		wb.getText();
	}

	public void gettextbyxpath(String xpath) {
		driver.findElement(By.xpath(xpath)).getText();
	}

	public void ListOfElements(String wb, String PerticularElement) {
		List<WebElement> ListElements = driver.findElements(By.xpath(wb));
		for (WebElement element : ListElements) {
			String Element = driver.findElement(By.xpath(PerticularElement)).getText();
			if (element.equals(Element)) {
				element.click();
			}
		}

	}

	public void ScrrenshotMethod() throws IOException{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("//"+".png"));
		
	}

	

	
	
	
	// public void listofelemnts(List<WebElement>elements, String data){
	// for(WebElement element: elements){
	// if(element.getAttribute("title").equalsIgnoreCase(data));
	// element.click();
	// break;
	// }
}
