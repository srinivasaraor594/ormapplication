package objectrep;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

import com.microsoft.schemas.office.excel.CTClientData.Factory;

import jxl.read.biff.BiffException;



public class loginobjects {

	
	/*public loginobjects(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}*/

	@FindBy(id = "UserName")
	private static WebElement username_Edit;

	public static WebElement getUsername_Edit() {
		return username_Edit;
	}

	public static void username(String user) {
		username_Edit.sendKeys(user);
	}

	// Globalmethods.driver.findElement(By.id(userid)).sendKeys(UserName);

	public void clickonSign() {
		System.out.println("2");
	}
	
	@FindBy(xpath="//span[@class='zF']")
	private WebElement MailSearch;

	 public WebElement getMailSearch() {
		return MailSearch;
	}
	 
	 
//	 @DataProvider(name = "OTHFacilitySimulationWithAdminLogin")
//		public static Object[][] FacilityWithMoreThanAllowedTime() throws IOException, BiffException {
//			File fs = new File("");
//			
//			Workbook ws = WorkbookFactory.create(fs);
//			Sheet s = ws.getSheet("BookingOTHFacility");
//			int rows = s.getLastRowNum();
//		int columns = s.getColumns() - 32;
//			String inputdata[][] = new String[rows - 2][columns];
//			for (int i = 2; i < rows; i++) {
//				for (int j = 0; j < columns; j++) {
//					Cell cl = s.getCell(j, i);
//					inputdata[i - 2][j] = cl.getContents();
//
//				}
//			}
//			return inputdata;
//
//		}

	/*public String gettinIDfromgmail() throws InterruptedException {
	 Thread.sleep(3000);
	 List<WebElement> unredmail =loginobjects.
	 Globalmethods.driver.findElements(By.xpath("//span[@class='zF']"));
	 String data = "ItsMyAccount - Admin";
	 for (int i = 0; i < unredmail.size(); i++) {
	 if(unredmail.get(i).isDisplayed() == true) {
	 if (unredmail.get(i).getText().equals(data)) {
	 String Actualsubjectinmail =
	 unredmail.get(i).findElement(By.xpath("//span[@class='y2']")).getText();
	 if (Actualsubjectinmail.equalsIgnoreCase(data)) {
	 String userid = Actualsubjectinmail.split(" ")[7];
	 unredmail.get(i).findElement(By.id("//span[@class='y2']")).click();
	 } else {
	 System.out.println("no mail in inbox");
	 }
	 break;
	 } else {
	 System.out.println("no mail");
	 }
	 
	
	 }}
	 return data;
	 }*/
//	
//public void grtingmailfromgmail(){
//	
//}
//	 * public String IdentifyUserIdInMailInbox() throws InterruptedException {
//	 * Thread.sleep(4000); List<WebElement> unreademeil =
//	 * Globalmethods.driver.findElements(By.xpath("//*[@class='y6']/span/b"));
//	 * String MyMailer = "ItsMyAccount - Admin"; for (int i = 0; i <
//	 * unreademeil.size(); i++) { if (unreademeil.get(i).isDisplayed() == true)
//	 * { if (unreademeil.get(i).getText().equals(MyMailer)) {
//	 * System.out.println("Yes we have got mail form " + MyMailer); String
//	 * SubjectInMail =
//	 * unreademeil.get(i).findElement(By.xpath("//*[@class='y6']/span[2]"))
//	 * .getText(); String Subject =
//	 * "Your credentials to access ItsMyAccount.com"; if
//	 * (SubjectInMail.equals(Subject)) { System.out.println(
//	 * "Yes we have got mail form " + MyMailer + "  With Subject Of " +
//	 * SubjectInMail); String MessageInMail =
//	 * unreademeil.get(i).findElement(By.xpath("//*[@class='y6']/span[2]"))
//	 * .getText(); userid = MessageInMail.split(" ")[7]; Reporter.log(
//	 * "User Id : " + userid, true);
//	 * unreademeil.get(i).findElement(By.xpath("//*[@class='y6']/span[2]")).
//	 * click(); } else { System.out.println("No mail form " + MyMailer +
//	 * "With Subject Of " + SubjectInMail); } break; } else {
//	 * System.out.println("No mail form " + MyMailer); } } } return userid; }
//	 */

	
//	public String IdentifyUserpasswordInMailInbox() throws InterruptedException {
//		Thread.sleep(4000);
//
//		List<WebElement> unreademeil = Globalmethods.driver.findElements(By.xpath(("//span[@class='zF']")));
//		String MyMailer = "ItsMyAccount - Admin";
//		for (int i = 0; i < unreademeil.size(); i++) {
//			if (unreademeil.get(i).isDisplayed() == true) {
//				if (unreademeil.get(i).getText().equals(MyMailer)) {
//					Reporter.log("Yes we have got mail form " + MyMailer, true);
//					String SubjectInMail = unreademeil.get(i).findElement(By.xpath("//*[@class='y6']/span/b"))
//							.getText();
//					String Subject = "Your credentials to access ItsMyAccount.com";
//					if (SubjectInMail.equals(Subject)) {
//						Reporter.log("Yes we have got mail form " + MyMailer + "  With Subject Of " + SubjectInMail,
//								true);
//						String MessageInMail = unreademeil.get(i).findElement(By.xpath("//*[@class='y6']/span[2]"))
//								.getText();
//						MessageInMail = MessageInMail.split(":")[2];
//						Reporter.log("User Password : " + MessageInMail, true);
//						unreademeil.get(i).findElement(By.xpath("//*[@class='y6']/span[2]")).click();
//					} else {
//						Reporter.log("No mail form " + MyMailer + "With Subject Of " + SubjectInMail, true);
//					}
//					break;
//				} else {
//					Reporter.log("No mail form " + MyMailer, true);
//				}
//			}
//		}
//		return MyMailer;
//	}

}
