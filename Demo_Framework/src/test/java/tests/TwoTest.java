package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.BaseClass;

public class TwoTest extends BaseClass{
	public WebDriver driver;
	@Test
	public void testTwo() throws IOException, InterruptedException
	{
		System.out.println("Dummy Test Two");
		driver = initializeBrowser();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		Thread.sleep(5000);
		
		
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
}

