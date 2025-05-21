package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Soft_Hard_Assertion
{
	@Test
	public void launch()
	{
		ChromeDriver driver =new ChromeDriver();   
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Assertion a1=new Assertion();
		//Assert.assertEquals(actualresult,expectedresult);
		a1.assertEquals(driver.getTitle(),"Sujani"); // java.lang.AssertionError: expected [Sujani] but found [Google]
		a1.assertEquals(driver.getTitle(),"Google");   //assertEquals(String actual,String expected)
		
		Assert.assertEquals(driver.getPageSource().contains("404") ||driver.getTitle().contains("404") , true  );
		
		
	}
	
	
	
}
