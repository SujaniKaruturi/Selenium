package TestNG;

import org.testng.annotations.Test;

//61. WAP to pass 2 parameters in @Test
//62. Write a program to disable any testcase in TESTNG
public class S_61_62_Annotation_2Parametersin_Test {

	@Test(priority=0, invocationCount=3)
	public void testcaseC()
	{
		System.out.println("testcaseC");
	}
	@Test(priority=0)	//as priority is same then it checks testcase name alphabetical order
	public void testcaseD()
	{
		System.out.println("testcaseD");
	}
	@Test(priority=1)	//as priority is same then it checks testcase name alphabetical order
	public void testcaseE()
	{
		System.out.println("testcaseE");
	}
	@Test(priority=-1)
	public void testcaseA()
	{
		System.out.println("testcaseA");
	}
	@Test(priority=1,enabled =false)	//this method will not execute as testcase is disabled
	public void testcaseB()
	{
		System.out.println("testcaseB priority =1");
	}
}
