package leadTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id ="user_email")
	WebElement userID;
	
	@FindBy(id = "user_password")
	WebElement userPASS;
	
	@FindBy(className = "btn")
	WebElement loginBtn;
	
	

	public void setUserName(String strUserID){
		userID.sendKeys(strUserID);
	}
	
	public void setUserPASS(String strUserPASS){
		userPASS.sendKeys(strUserPASS);
	}
	
	public void clickLoginUser(){
		loginBtn.click();
	}
	
	public void loginUserToBase(String strUserID,String strUserPASS){
 
        this.setUserName(strUserID);
 
        this.setUserPASS(strUserPASS);
 
        this.clickLoginUser();
    }

	public  LoginPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}
}
