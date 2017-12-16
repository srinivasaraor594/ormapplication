package GenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriverwaitstatemts extends Globalmethods{

	public void waitforpagetoload() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	public void waitforelementtoload(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(Globalmethods.driver, 10);
		wait.until(ExpectedConditions.visibilityOf((wb)));
	}
}
