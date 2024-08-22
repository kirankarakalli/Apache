package Day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener{
	
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext context)
	{
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myreport.html");
		sparkReporter.config().setDocumentTitle("Automation Testing");
		sparkReporter.config().setReportName("functional testing");
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("computer name","localhost");
		extent.setSystemInfo("Enviroment","QA");
		extent.setSystemInfo("Tester","kiran");
		extent.setSystemInfo("Os","windows11");
		extent.setSystemInfo("Browser","chrome");
		
	}
	
	
	public void onTestSuccess(ITestResult result)
	{
		test=extent.createTest(result.getName());
		test.log(Status.PASS, "test case passed is: "+result.getName());
	}
	
	
	public void onTestFailure(ITestResult result)
	{
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "test case Failed is: "+result.getName());
		test.log(Status.FAIL, "test case Failed is: "+result.getThrowable());
	}
	
	
	public void onTestSkipped(ITestResult result)
	{
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "test case skipped is: "+result.getName());
	}
	
	
	public void onFinish(ITestContext context)
	{
		extent.flush();
		
	}
	

}
