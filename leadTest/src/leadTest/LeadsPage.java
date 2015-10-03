package leadTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	//WebDriver driver;
	WebDriver driver;
	String expStatus = "new";

	@FindBy(id="leads-new")
	WebElement addLead;
	
	@FindBy(className = "lead-status")
	WebElement UserStatus;
		
	
	public void addNewLead(){
		addLead.click();
	}
	
	public void checkUsrStat(){
		String stat = UserStatus.getText().toLowerCase();
		Assert.assertEquals(stat, expStatus.toLowerCase());
	
	}
	
	public void checkUsrStatIsChanged(){
		String stat = UserStatus.getText().toLowerCase();
		Assert.assertNotEquals(stat, expStatus.toLowerCase());
	
	}
	
	public void findLeadByName(WebDriver driver, String leadName){
		 driver.findElement(By.partialLinkText(leadName)).click();   
		
	}
	
	public LeadsPage(WebDriver driver){
		PageFactory.initElements(driver, this);

}
}