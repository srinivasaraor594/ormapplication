package objectrep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePageObjects {

	private WebDriver driver;

	public HomePageObjects(WebDriver driver) {
		
		this.driver = driver; 
		   PageFactory.initElements(driver, this);
	}
	
//	@FindBys(className="nav navbar-nav navbar-right")
//	private List<WebElement>  TopModules;
	
	
	@FindBy(className="category-box border-1 wow fadeInUpQuick animated")
	private WebElement MySocietyList;


	
}
