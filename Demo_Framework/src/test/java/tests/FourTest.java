package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.BaseClass;

public class FourTest extends BaseClass {
	public WebDriver driver;
	@Test
	public void testFour() throws IOException, InterruptedException
	{
		System.out.println("Dummy Test Four");
		driver = initializeBrowser();
		
		driver.get("https://www.geeksforgeeks.org/java/");
		Thread.sleep(5000);
		
		Assert.assertTrue(false);	//test should get fail but it is not failing and also browser is not getting closed.
		driver.close();
	}
	
}
