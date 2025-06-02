package TestNG;
import org.testng.annotations.Test;
public class Test_With_Priority 
//-1 has highest priority then 0,1,2,3 etc
{	@Test(priority=3)
	public void goat()
	{
		System.out.println(" Goat Annotation");
	}
	@Test
	public void act()
	{
		System.out.println(" Womb Annotation");
	}
	@Test(priority=0)
	public void women()
	{
		System.out.println(" Apple Annotation");
	}
	@Test(priority=-1)
	public void testcaseA()
	{
		System.out.println("testcaseA");
	}
	@Test(priority=2)
	public void tip()
	{
		System.out.println(" Tip Annotation");
	}
	@Test(priority=1)
	public void jug()
	{
		System.out.println(" Jug Annotation");
	}
	@Test(priority=-6)  //Lower the priority it gets executed first.  
	//3>2>1 in positive value but in negative value -10>-6>-4
	public void noddy()
	{
		System.out.println(" noddy Annotation");
	}
	@Test(priority=-10)  //Lower the priority it gets executed first.  
	public void pen()
	{
		System.out.println(" pen Annotation");
	}
	@Test(priority=-4)  //Lower the priority it gets executed first.  
	public void can()
	{
		System.out.println(" can Annotation");
	}
	
}
