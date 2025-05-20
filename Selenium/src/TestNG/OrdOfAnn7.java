package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrdOfAnn7 
{
	@BeforeSuite
	public void suite1()
	{
		System.out.println("Before Suite Annotation");
	}
	@BeforeMethod
	public void suite2()
	{
		System.out.println("Before Method Annotation");
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
