package TestNG;
//Only 1 @Test annotation
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderOfAnnotation 
{
	@BeforeSuite
	public void suite1()
	{
		System.out.println("Before Suite Annotation");
	}
	@BeforeTest
	public void test1()
	{
		System.out.println("Before Test Annotation");
	}
	@AfterTest
	public void test3()
	{
		System.out.println("After Test Annotation");
	}
	@AfterSuite
	public void suite2()
	{
		System.out.println("After Suite Annotation");
	}
	
	@Test
	public void test2()
	{
		System.out.println(" Test2 Annotation");
	}

	@AfterMethod
	public void method2()
	{
		System.out.println("After Method Annotation");
	}
	@AfterClass
	public void class2()
	{
		System.out.println("After Class Annotation");
	}
	
	@BeforeClass
	public void class1()
	{
		System.out.println("Before Class Annotation");
	}
	@BeforeMethod
	public void method1()
	{
		System.out.println("Before Method Annotation");
	}
	
}

