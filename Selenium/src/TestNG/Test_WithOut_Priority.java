package TestNG;
//Possible to write a code without @BeforeMethod and @AfterMethod,then only @test gets executed. 
//@Test execution based on alphabetical order,only when priority is not mentioned.
import org.testng.annotations.Test;

public class Test_WithOut_Priority 
{  //alphabetical order with Capital and small letter - it will run Capital letter first
	@Test
	public void Subtraction()
	{
		System.out.println(" Subtraction Annotation");
	}
	@Test
	public void addition()
	{
		System.out.println(" addition Annotation");
	}
	@Test
	public void act()
	{
		System.out.println(" act Annotation");
	}
	@Test
	public void Home()
	{
		System.out.println(" Home Annotation");
	}
	@Test
	public void Rome()
	{
		System.out.println(" Rome Annotation");
	}
	@Test
	public void gome()
	{
		System.out.println(" Gome Annotation");
	}
	
}
