package util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUitl {
	public static ExtentReports extent;
	public static ExtentReports extentReportGen() {
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Trial Extent Report Test");
		reporter.config().setDocumentTitle("Trial Extent Report Test 1.0");
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Automaion Engineer", "Prajjaval..");
		return extent;
	}
}
