package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {
    
    public static void saveScreenshot(WebDriver driver) throws IOException {
        //'TakesScreenshot' is an interface and driver is casted as type 'TakesScreenshot'
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String destpath= System.getProperty("user.dir")+"\\screenshots\\SC"+date_time()+".jpg"; 
        FileUtils.copyFile(src,new File(destpath));
    }
	public static String date_time() {
        long millis = System.currentTimeMillis();
        // creating a new object of the class Date
        java.util.Date date = new java.util.Date(millis);
        return date.toString().replace(":","_").replace(" ","").trim();
    }
    
}
