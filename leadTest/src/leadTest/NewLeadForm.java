package leadTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewLeadForm {
	WebDriver driver;

	@FindBy(id= "lead-first-name")
	WebElement leadFormName;
	
	@FindBy(id = "lead-last-name")
	WebElement leadFormLastName;
	
	@FindBy(id= "lead-company-name")
	WebElement leadFormCompanyName;
	
	@FindBy(id= "lead-title")
	WebElement leadFormTitle;
	
	@FindBy(xpath = "//*[@id='container']/div/div[2]/div/div/form/div/fieldset/div[2]/div/div[4]/div/div/div/div/a/div/b")
	WebElement leadFormStatus;
	
	@FindBy(xpath = "//*[@id='container']/div/div[2]/div/div/form/div/fieldset/div[2]/div/div[4]/div/div/div/div/div/div/input")
	WebElement leadFormStatusInput;
	
	@FindBy(id= "lead-email")
	WebElement leadFormEmail;
	
	@FindBy(id= "lead-mobile")
	WebElement leadFormMobile;
	
	@FindBy(id= "lead-phone")
	WebElement leadFormWorkPhone;
	
	@FindBy(id= "lead-street")
	WebElement leadFormStreet;
	
	@FindBy(id= "lead-city")
	WebElement leadFormCity;
	
	@FindBy(id= "lead-zip")
	WebElement leadFormCode;
	
	@FindBy(xpath ="//*[@id='container']/div/div[2]/div/div/form/div/fieldset/div[2]/div/div[10]/div/div/a")
	WebElement leadFormCountry;
	
	@FindBy(id= "lead-region")
	WebElement leadFormRegion;
	
	@FindBy(className= "default")
	WebElement leadFormTag;
	
	@FindBy(className= "save")
	WebElement leadSubmit;
	
	public void enterLeadName(String strLeadName){
		leadFormName.sendKeys(strLeadName);
	}
	
	public void  enterLeadLastName(String strLastName){
		leadFormLastName.sendKeys(strLastName);
	}
	
	public void  enterLeadCompanyName(String strCompanyName){
		leadFormCompanyName.sendKeys(strCompanyName);
	}
	
	public void  enterLeadTitle(String strTitle){
		leadFormTitle.sendKeys(strTitle);
	}
	
	public void enterLeadStatus(String strStatus){
		leadFormStatus.click();
		leadFormStatusInput.sendKeys(strStatus, Keys.ENTER);
	}
	
	public void  enterLeadEmail(String strEmail){
		leadFormEmail.sendKeys(strEmail);
	}
	
	public void  enterLeadMobile(String strMobile){
		leadFormMobile.sendKeys(strMobile);
	}
	
	public void  enterLeadWorkPhone(String strWorkPhone){
		leadFormWorkPhone.sendKeys(strWorkPhone);
	}
	
	public void  enterLeadStreet(String strStreet){
		leadFormStreet.sendKeys(strStreet);
	}
	
	public void  enterLeadCity(String strCity){
		leadFormCity.sendKeys(strCity);
	}
	
	public void enterLeadCode(String strCode){
		leadFormCode.sendKeys(strCode);
	}
	
	public void enterLeadCoutry(String strCoutry){
		leadFormCountry.click();
		leadFormCountry.sendKeys(strCoutry, Keys.ENTER);
	}
	
	public void enterLeadRegion(String strRegion){
		leadFormRegion.sendKeys(strRegion);
	}
	
	public void enterLeadTag(String strTag){
		leadFormTag.clear();
		leadFormTag.sendKeys(strTag, Keys.ENTER);
	}
	
	public void clickSubmit(){
		leadSubmit.click();
	}
	
	public  NewLeadForm(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}


}
