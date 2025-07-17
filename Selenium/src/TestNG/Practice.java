package TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practice implements IRetryAnalyzer,ITestListener{

	@DataProvider(name="data")
	public Object[][] testdata()
	{
		return new Object[][] { {"ram"} , {"sujani"}};
		//return new Object[][] { {"sujani@gmail.com","tshirt"}, {"sujani11@gmail.com","glass"}};
	}
	
	@Test(dataProvider = "data")
	public void method(String name)
	{
		System.out.println(name);
	}

	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Testcase is passed"); 
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
	}

	@Test(retryAnalyser =TestNG.Practice.class )
	public void method1()
	{
		
	}
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		int intialcount=0;
		int retrycount= 4;
		if(intialcount<retrycount)
		{
			intialcount++;
			result.setStatus(ITestResult.FAILURE);
			return true;
		}
		else 
		{
			result.setStatus(ITestResult.SUCCESS);
			return false;
		}
		
		
	}

}
