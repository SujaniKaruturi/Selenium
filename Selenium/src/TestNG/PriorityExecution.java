package TestNG;


import org.testng.annotations.Test;

public class PriorityExecution 
{

	@Test(priority=2)
	public void goat()
	{
		System.out.println(" Goat Annotation");
	}
	@Test(priority=3)
	public void apple()
	{
		System.out.println(" Apple Annotation");
	}
	@Test(priority=1)
	public void tip()
	{
		System.out.println(" Tip Annotation");
	}
	
}

/*
Order of Execution without priority is alphabetical order:
Apple Annotation
Goat Annotation
Tip Annotation
PASSED: apple
PASSED: goat
PASSED: tip

Order of Execution with priority is :
 Tip Annotation
 Goat Annotation
 Apple Annotation
PASSED: tip
PASSED: goat
PASSED: apple

*/