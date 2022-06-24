package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	public static WebDriver driver;
	ChromeOptions crOption; 
 	static Properties prop = new Properties();
	public static Logger log = LogManager.getLogger(DriverSetup.class);

	public WebDriver initDriver() throws IOException {
		log.info("initializing the driver");
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\data.properties");
		prop.load(fis);
		String browser = System.getProperty("browser"); // this helps pass browser as argument from cmd
		//(maven command ): mvn -Dbrowser=chrome test
		
//		String browser = prop.getProperty("browser");
		
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			crOption= new ChromeOptions();
//			crOption.addArguments("headless");
			driver = new ChromeDriver(crOption);
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("No Driver Found!!");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		return driver;
	}

	@AfterTest
	public void teardown() {
		log.info("Close the driver");
		driver.close();
	}
}
