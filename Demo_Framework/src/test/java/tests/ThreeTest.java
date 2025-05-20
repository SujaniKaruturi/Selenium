
package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.BaseClass;

public class ThreeTest extends BaseClass {
	public WebDriver driver;
	@Test
	public void testThree() throws IOException, InterruptedException
	{
		System.out.println("Dummy Test Three");
		driver = initializeBrowser();
		driver.get("https://www.guru99.com/selenium-tutorial.html");
		Thread.sleep(5000);
		
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
