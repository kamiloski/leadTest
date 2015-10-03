package leadTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class SettingsPage {
	WebElement driver;
	
	@FindBy(xpath = "//*[@id='sidebar']/ul/li[11]/a")
	WebElement leadsSet;
	
	@FindBy(xpath = "//*[@id='leads-settings-tabs']/li[3]/a")
	WebElement leadStat;
	
	@FindBy(xpath = "//*[@id='lead-status']/div[1]//div/div/label/h4")
	List<WebElement> getStatusList;
	
	@FindBy(xpath = "//*[@id='lead-status']/div//div/div//div/button")
	List<WebElement> getButtonList;
					
	@FindBy(xpath = "//input[@value='New']")
	WebElement inputNewName;
		
	public void gotoLeadStat(){
		leadsSet.click();
		leadStat.click();
	}
	
	public int containsStatsName(String leadName){
		int leadPosition =0;
		int statsNumber = getStatusList.size();
		 for(int i=0;i<statsNumber;i++){
			 if(getStatusList.get(i).getText().toLowerCase().contains(leadName)){
				 leadPosition = i;
			 }

			 }
		 return leadPosition;	 
	}
	
	public void editStatsName(int leadPosition){
		int leadNewPos = leadPosition;
		int buttonNumber = getButtonList.size();
		int couterNew = 0;
		for(int i=0;i<buttonNumber;i++){
			if(couterNew == leadNewPos){
				getButtonList.get(i).click();			
				break;
			}else{
				couterNew++;
			}
		}	
	}
	
	public void enterAndSaveName(String updateStatus){
		inputNewName.clear();
		inputNewName.sendKeys(updateStatus, Keys.ENTER);
	}
	
	public SettingsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	

}
