package objectrep;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePageObjects {
//	private WebDriver driver;
//	
//	public HomePageObjects(WebDriver driver){
//	this.driver=driver;	
//	}
	
	
//	public HomePageObjects(WebDriver driver) {
//		
//		this.driver = driver; 
//		   PageFactory.initElements(driver, this);
//	}
	
//@FindBys(value="nav navbar-nav navbar-right", value = { @FindBy })
//private List<WebElement>  TopModules;
	
	
	@FindBy(className="category-box border-1 wow fadeInUpQuick animated")
	private WebElement MySocietyList;

	public static List<WebElement> getTopModules() {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<WebElement> getMySocietyList() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
