package TestNG;

import org.testng.annotations.Test;

public class AssertKeyword {
@Test
public void keyword()
{
	int age =15; //try with age=20 and check output
	assert age>18: "Age cannot be less than 18";    //this will not proceed to next line of code execution if this condition gets failed.
	if(age>18) {
		System.out.println("Adult");
	}
	else
	{
		System.out.println("Child");
	}
}
}
