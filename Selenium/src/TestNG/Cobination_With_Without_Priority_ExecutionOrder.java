package TestNG;

import org.testng.annotations.Test;

public class Cobination_With_Without_Priority_ExecutionOrder {

	//order of execution when test methods with priority and without priority is:
	//first negative priority then alphabetical order and then +value priority order
		// TODO Auto-generated method stub
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
		@Test(priority=0)
		public void apple()
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
	}


