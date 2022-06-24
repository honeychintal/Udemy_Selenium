package functionalTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.DriverSetup;
import pageObjects.LandingPageObject;
import pageObjects.LoginPageObject;

public class HomeTest extends DriverSetup{
	public WebDriver driver;
	@Test(dataProvider = "getdata")
	public void loginTest(String email, String pass) throws IOException {
		driver = initDriver();
		driver.get("https://rahulshettyacademy.com/");
		LandingPageObject lp = new LandingPageObject(driver);
		LoginPageObject lg =new LoginPageObject(driver);
		lp.signinButton().click();
		lg.inputEmail().sendKeys(email);
		lg.inputPassword().sendKeys(pass);
		lg.loginButton().click();
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[3][2];
		data[0][0]="Jotaro@joestar.com";
		data[0][1]="JOJO@3333";
		
		data[1][0]="Jonathan@joestar.com";
		data[1][1]="JOJO@1111";
		
		data[2][0]="Joseph@joestar.com";
		data[2][1]="JOJO@2222";
		return data;
	}
}
