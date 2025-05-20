package TestNG;

import org.testng.annotations.Test;

public class ParametersPractice
{
	@Test(priority=1)
	public void tip()
	{
		System.out.println(" Tip Annotation");
	}
	@Test(priority=2)
	public void girl()
	{
		System.out.println(" Girl Annotation");
	}
	@Test(invocationCount=3)  //this methods get executed first due to alphabetical order execution and for 3 times.
	public void boy()
	{
		System.out.println(" Boy Annotation");
	}
	@Test
	public void male()
	{
		System.out.println(" Male Annotation");
	}
	@Test
	public void female()
	{
		System.out.println(" Female Annotation");
	}
	@Test(enabled=false)   //This method gets ignored/not executed by client(java)
	public void child()
	{
		System.out.println(" Female Annotation");
	}
	
	
}
