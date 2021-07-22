package resource;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportNG {
	static ExtentReports extent;
	public static ExtentReports GetExtentReportsObject()
	{
		String path =  System.getProperty("user.dir")+"\\Reports\\report.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Gita");
		return extent;
	}

}
