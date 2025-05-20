package listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.BaseClass;
import utilities.ExtendReports;

public class ListenersClass  extends BaseClass implements ITestListener{

	public WebDriver driver;
	ExtentReports extentReport = ExtendReports.getExtentReport();
	ExtentTest extendtest ;
	ThreadLocal<ExtentTest> extentTestThread = new ThreadLocal<ExtentTest>(); 
	@Override
	public void onTestStart(ITestResult result) {
		 extendtest = extentReport.createTest(result.getName() );
		 extentTestThread.set(extendtest); 
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		//extendtest.log(Status.PASS, result.getName() + " Testcase is pass ");
		extentTestThread.get().log(Status.PASS,result.getName() + " Test Passed"); 
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		//extendtest.fail(result.getThrowable());
		extentTestThread.get().fail(result.getThrowable()); 
		
		
		String testMethodName = result.getName();	//get testname is method name
		
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
			//to get current driver instance of test which is failing.
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			String screenshotFilePath =takeScreenshot(testMethodName,driver); 
			extentTestThread.get().addScreenCaptureFromPath(screenshotFilePath, testMethodName); 
			//takeScreenshot(testname, driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) { 	//when the test is about to end then onFinish will be executed.
		extentReport.flush();//without this flush report doesn't get generated.
	}

	
}
