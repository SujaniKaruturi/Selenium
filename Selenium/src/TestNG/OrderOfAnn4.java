package TestNG;
// 2 @Test Methods with 1 @BeforeMethod and @AfterMethod,but @BeforeMethod and @AfterMethod. are applicable to both the test4,test5
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrderOfAnn4 
{
	@BeforeMethod
	public void method1()
	{
		System.out.println("Before Method Annotation");
	}

	@AfterMethod
	public void method2()
	{
		System.out.println("After Method Annotation");
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

/*
Output: 
Before Method Annotation
 Test4 Annotation
After Method Annotation
Before Method Annotation
 Test5 Annotation
After Method Annotation
*/ 
