package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YahooLoginPage {
	WebDriver driver;
	public YahooLoginPage(WebDriver driver) {
		this.driver =driver;
	}
	By userName = By.xpath("//input[@id='login-username']");
	By nextButton = By.xpath("//p[@class='sign-up-link']");
	
	public WebElement username()
	{
		return driver.findElement(userName);
	}
	public WebElement nextbutton()
	{
		return driver.findElement(nextButton);
	}
} 
