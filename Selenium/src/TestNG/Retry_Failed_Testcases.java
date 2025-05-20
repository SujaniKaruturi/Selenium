package TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Failed_Testcases implements IRetryAnalyzer{

	int initial_count = 0;
	int retry_count=2;
	
	@Override
	public boolean retry(ITestResult result) {
		if(initial_count<retry_count)
		{
			initial_count++;
			return true;   //retry
			
		}
		
		
		return false;
		//return true; 	//retries for infinite times
	}

}
