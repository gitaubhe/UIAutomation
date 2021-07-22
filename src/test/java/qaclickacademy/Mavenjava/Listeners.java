package qaclickacademy.Mavenjava;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resource.Base;
import resource.ExtentReportNG;

public class Listeners extends Base implements ITestListener{
    ExtentReports extent = ExtentReportNG.GetExtentReportsObject();
    ExtentTest test;
	ThreadLocal<ExtentTest> extentTest =new ThreadLocal<ExtentTest>();
	@Override
	public void onTestStart(ITestResult result) {
		test= extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest.get().log(Status.PASS, "Test passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		try
		{
			extentTest.get().log(Status.FAIL,result.getThrowable());
		driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		extentTest.get().addScreenCaptureFromPath(GetScreenshotPath(result.getMethod().getMethodName(), driver));
		
		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
		
	}

}
