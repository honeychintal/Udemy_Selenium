package functionalTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.YahooLoginPage;
import pageObjects.YahooSignupPageFactory;
import setup.DriverSetup;

public class YahooTest {

	static final String loginURL="https://login.yahoo.com/";
	@Test(description = "This test is implemented using page object model,"
			+ " all page elements reside in 'YahooLoginPage'")
	void logintest(){
		WebDriver driver = DriverSetup.setup(loginURL);
		YahooLoginPage pObj = new YahooLoginPage(driver);
		pObj.username().sendKeys("8787987456");
		pObj.nextbutton().click();
	}
	
	static final String signupURL="https://login.yahoo.com/account/create";
	@Test(description = "This test is implemented using page factory,"
			+ " all page elements reside in 'YahooSignupPageFactory'")
	void signuptest(){
		WebDriver driver = DriverSetup.setup(signupURL);
		YahooSignupPageFactory pObj = new YahooSignupPageFactory(driver);
		pObj.userName().sendKeys("Shaman");
		pObj.lastName().sendKeys("Das");
		pObj.newEmail().sendKeys("ShamanDas55");
		pObj.newPasswd().sendKeys("XYZabc@123");
		pObj.birthYear().sendKeys("1999");
		pObj.continueButton().click();
	}
}
