package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPageObject {

	WebDriver driver;

	public LandingPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[contains(@class,'register-btn')]")
	private WebElement signinbutton;
	
	By nav=By.xpath("//div[contains(@class,'navbar-collapse')]//li//a");
	By navtoggle=By.xpath("//a[@class='dropdown-toggle']");
	By navmoreList =By.xpath("//ul[@class='dropdown-menu']//a");

	public WebElement signinButton() {
		return signinbutton;
	}
	
	public List<WebElement> navBar() {
		List<WebElement> navlist =driver.findElements(nav);
		return navlist;
	}
	
	public WebElement navtoggle() {
		return driver.findElement(navtoggle);
	}
	
	public List<WebElement> navMoreList() throws InterruptedException {
		Thread.sleep(500);
		List<WebElement> navlist =driver.findElements(navmoreList);
		return navlist;
	}
	
}
