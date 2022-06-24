package functionalTest;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.DriverSetup;
import pageObjects.LandingPageObject;
import util.ActionMethods;

public class HomePageTest extends DriverSetup{
	public static Logger log = LogManager.getLogger(HomePageTest.class);
	public WebDriver driver;
	@Test
	public void homeAssertionTest() throws IOException, InterruptedException {
		driver = initDriver();
		ActionMethods act = new ActionMethods();
		driver.get("https://rahulshettyacademy.com/");
		LandingPageObject lp = new LandingPageObject(driver);
		List<String> str=lp.navBar().stream().map(s->s.getText()).collect(Collectors.toList());
	
		act.getActions(driver);
		act.movetoElement(lp.navtoggle());
		
		List<String> str2= lp.navMoreList().stream().map(s->s.getText()).collect(Collectors.toList());
		str.addAll(str2);
		
		str.stream().filter(s->!s.isBlank()).forEach(s-> System.out.println(s));
		log.info("doing assertion on Contact");
		Assert.assertTrue(str.contains("Contact"));
	}
}
