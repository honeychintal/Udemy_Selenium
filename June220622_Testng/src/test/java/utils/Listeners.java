package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners implements ITestListener {
	//Execute with testng5.xml for Listeners
	ExtentTest test;
	ExtentReports extent = ExtentReportUitl.extentReportGen();
	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		System.out.println(result.getName()+ " Started!!");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Passed");
		System.out.println(result.getName()+ " Test Success!!");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable()); // logs the complete exception of the test
		test.log(Status.FAIL, " Test Failure!!" );
		System.out.println(result.getName()+ " Test Failure!!");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}

}
/*
 * >mvn -Pextent test #execute test with 'extent' profile
 * >mvn -Psanity test #execute test with 'sanity' profile
 * >mvn -Psmoke	test #execute test with 'smoke' profile
 * >mvn -Dtest=ListenerTestClass test #execute single test with of given class e.g.'ListenerTestClass' 
 * */

