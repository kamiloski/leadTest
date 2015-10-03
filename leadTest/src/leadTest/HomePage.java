package leadTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	@FindBy(linkText = "Log In")
	WebElement gotoLogin;
	
	public void gotoLoginPage(){
	 	gotoLogin.click();
	}
	
	public  HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
}
