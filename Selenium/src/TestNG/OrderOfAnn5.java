package TestNG;
//Possible to write a code without @BeforeMethod and @AfterMethod,then only @test gets executed. 
//@Test execution based on alphabetical order,only when priority is not mentioned.
import org.testng.annotations.Test;

public class OrderOfAnn5 
{
	@Test
	public void subtraction()
	{
		System.out.println(" subtraction Annotation");
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
	public void home()
	{
		System.out.println(" home Annotation");
	}
}
