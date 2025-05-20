package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

//Before,After Suite and with 2 Test, as we don't have before and after method are not available they will not get executed.
public class OrderOfAnn6
{
	@BeforeSuite
	public void suite1()
	{
		System.out.println("Before Suite Annotation");
	}
	@AfterSuite
	public void suite2()
	{
		System.out.println("After Suite Annotation");
	}
	@Test
	public void test4()
	{
		System.out.println(" Test4 Annotation");
	}
	@Test
	public void test5()
	{
		System.out.println(" Test5 Annotation");
	}
}
