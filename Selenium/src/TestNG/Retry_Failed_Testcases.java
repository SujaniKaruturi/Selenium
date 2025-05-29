package TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Failed_Testcases implements IRetryAnalyzer{
	int initial_count = 0;
	int retry_count=3;
	@Override
	public boolean retry(ITestResult result) {
		if(initial_count<retry_count)
		{
			initial_count++;
			result.setStatus(ITestResult.FAILURE);
			return true;   //retry
		}
		result.setStatus(ITestResult.SUCCESS);
		return false;
		//return true; 	//retries for infinite times
	}
	
}
