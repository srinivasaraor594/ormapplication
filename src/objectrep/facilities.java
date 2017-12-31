package objectrep;

import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import GenericLib.Baseconfig;

public class facilities extends Baseconfig {

	@FindBys({ @FindBy(xpath = "//td[@aria-describedby='Grid_FacilityName']") })
	private static List<WebElement> FacilityName;

	public static List<WebElement> getFacilityName() {
		return FacilityName;
	}

	@FindBy(id = "")
	private static WebElement Next;

	public static WebElement getNext() {
		return Next;
	}

	public void FacilityNameList(String data) {

		List<WebElement> facilityslist = facilities.getFacilityName();

		for (WebElement element : facilityslist) {
			try {

				if (element.getText().trim().equalsIgnoreCase(data.trim())) {
					System.out.println(element.getText());
					break;
				}
			} catch (NoSuchElementException e) {
				commmethods.click(facilities.getNext());
			}
		}
	}
	
	
}
