package TestNG;

import org.testng.annotations.Test;

public class GroupingTopic
{
	@Test(groups= {"Smoke","Regression"})
	public void one()
	{
	System.out.println("One");
	}
	@Test(groups= {"Integration"})
	public void two()
	{
		System.out.println("Two");
	}
	@Test(groups= {"Smoke"})
	public void three()
	{
		System.out.println("Three");
	}
	@Test(groups= {"Regression"})
	public void four()
	{
		System.out.println("Four");
	}
	@Test(groups= {"Component"})
	public void five()
	{
		System.out.println("Five");
	}
}
