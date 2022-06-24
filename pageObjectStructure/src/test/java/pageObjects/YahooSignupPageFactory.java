package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YahooSignupPageFactory {
	WebDriver driver;
	public YahooSignupPageFactory(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this); //this initializes all the elements, otherwise returns NullPointerException
	}
	
	@FindBy(id ="usernamereg-firstName")
	WebElement username;
	
	@FindBy(id ="usernamereg-lastName")
	WebElement lastname;
	
	@FindBy(xpath ="//input[@name='userId']")
	WebElement newemail;
	
	@FindBy(id ="usernamereg-password")
	WebElement newpasswd;
	
	@FindBy(id ="usernamereg-birthYear")
	WebElement birthyear;
	
	@FindBy(id ="reg-submit-button")
	WebElement continuebutton;
	
	public WebElement userName()
	{
		return username;
	}
	public WebElement lastName()
	{
		return lastname;
	}
	public WebElement newEmail()
	{
		return newemail;
	}
	public WebElement newPasswd()
	{
		return newpasswd;
	}
	public WebElement birthYear()
	{
		return birthyear;
	}
	public WebElement continueButton()
	{
		return continuebutton;
	}
}
