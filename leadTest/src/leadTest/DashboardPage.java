package leadTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	WebDriver driver;
	@FindBy(id = "nav-leads")
	WebElement leadsPage;
	
	public void gotoLeadsPage(){
		leadsPage.click();
	}
	
		
	public DashboardPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
}
