package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Soft_Hard_Assertion
{
	@Test
	public void launch()
	{
		ChromeDriver driver =new ChromeDriver();   
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//Hard Assertion 
		//without importing any class just directly using Assert keyword 
		//Assert.assertEquals(driver.getTitle(),"Sujani" , "title name is not correct");
		//output: FAILED,  java.lang.AssertionError: title name is not correct expected [Sujani] but found [Google]
		
		//Soft Assertion
		
		SoftAssert softAssert = new SoftAssert();
		//softAssert.assertEquals(driver.getTitle(),"Sujani"); // java.lang.AssertionError:expected [Sujani] but found [Google]
		softAssert.assertEquals(driver.getTitle(),"Google"); //assertEquals(Stringactual,String expected)
		
		 String expected = "Hello, World!";
	     String actual = "Hello, World!";
	     softAssert.assertEquals(actual, expected, "The strings are not equal");
	     softAssert.assertNull(driver.getWindowHandle(),"Not null");
		//without above line ,even testcase is failed it shows the console output as pass only.
	     softAssert.assertEquals(driver.getPageSource().contains("404")
		 ||driver.getTitle().contains("404") , true );
		 softAssert.assertAll(); // This line checks all soft assertions at the end
		 
		
	}
	
	
	
}
