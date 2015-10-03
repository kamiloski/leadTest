package leadTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNavigation {
	WebElement driver;
	
	@FindBy(className = "base-icon-arrow-down")
	WebElement userDD;
		
	@FindBy(xpath = "//*[@id='user-dd']/ul/li[3]/a/strong")
	WebElement settings;
	
	public void gotoSettings(){
		userDD.click();	
		settings.click();
	}
	
	public TopNavigation(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
}
