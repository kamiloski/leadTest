package leadTest;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AddleadTest {
	WebDriver driver;
  @Test
  public void addNewNowte() {
	  /*------------------Generating Lead Name----------------------------------*/
	  	 NameGenerator ng = new NameGenerator();
		
		 String  generatedName = ng.generateRandomName();
		
		/*-------------------Go to login page---------------------------------*/
		
		HomePage hp = new HomePage(driver);
		
		hp.gotoLoginPage();
		
		 
		 /*-----------------------Login to base-------------------------------*/
		
		LoginPage lp = new LoginPage(driver);
		
		lp.loginUserToBase("kontakt@pstrykfotobudka.pl","testbase");
		
		/*-------------------Go to Dashboard--------------------------------*/
		
		DashboardPage dbp = new DashboardPage(driver);
		
		dbp.gotoLeadsPage();
		
		/*------------------------Click to add new lead------------------------------------*/
		
		LeadsPage ldsP = new LeadsPage(driver);
		
		ldsP.addNewLead();
		
		/*------------------------Fill form------------------------------------*/
	
		NewLeadForm nlp = new NewLeadForm(driver);
		
		nlp.enterLeadName(generatedName);
		
		nlp.enterLeadLastName("Bananowyfdsf");
		
		nlp.enterLeadCompanyName("Gr8Comp");
		
		nlp.enterLeadTitle("Boss");
		
		nlp.enterLeadStatus("new");
		
		nlp.enterLeadEmail("tolekbanan@gmail.com");
		
		nlp.enterLeadMobile("123456789");
		
		nlp.enterLeadWorkPhone("9876541");
		
		nlp.enterLeadStreet("Kowalskiego");
		
		nlp.enterLeadCity("Krak�w");
		
		nlp.enterLeadCode("12-123");
		
		nlp.enterLeadRegion("Ma�opolska");
		
		nlp.enterLeadCoutry("Poland");
		
		nlp.enterLeadTag("testBase");
		
		nlp.clickSubmit();
		
		/*------------------------Check usr status-----------------------------------*/
		
		ldsP.checkUsrStat();
		
		/*------------------------Go to settings--------------------------------*/
		TopNavigation tp = new TopNavigation(driver);
		
		tp.gotoSettings();
		
		/*-----------------------Change status name-----------------------------*/

		SettingsPage sp = new SettingsPage(driver);
	
		sp.gotoLeadStat();
				
		sp.editStatsName(sp.containsStatsName("new"));
		
		sp.enterAndSaveName("ChangedNewStat");
		
		/*------------------------Go to leads page-------------------------------*/
		
		dbp.gotoLeadsPage();
		
		ldsP.findLeadByName(driver, generatedName);
		
		ldsP.checkUsrStatIsChanged();
		
		
	
	}
	  
  
  @BeforeTest
  public void beforeTest() {
	  	driver = new FirefoxDriver();
		driver.get("http://getbase.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
  @AfterTest
  public void afterTest() {
	  	driver.quit();
}
}
