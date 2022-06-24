package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement emailid;
	
	@FindBy(id = "password")
	private WebElement password;

	@FindBy(css = "input[type='submit']")
	private WebElement loginbutton;
	
	public WebElement inputEmail()
	{
		return emailid;
	}
	public WebElement inputPassword()
	{
		return password;
	}
	public WebElement loginButton()
	{
		return loginbutton;
	}
}
