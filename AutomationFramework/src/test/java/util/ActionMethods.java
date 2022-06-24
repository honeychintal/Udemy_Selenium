package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionMethods {
	Actions builder;
	public void getActions(WebDriver driver)
	{
		builder = new Actions(driver);
	}
	public void movetoElement(WebElement webElement) 
	{
		Action mouseHover =builder.moveToElement(webElement).build();
		mouseHover.perform();
	}
}
