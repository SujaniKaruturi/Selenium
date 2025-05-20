package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Assertion_DemoClass
{
	@Test
	public void launch()
	{
		ChromeDriver driver =new ChromeDriver();   
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Assertion a1=new Assertion();
		String name="Sujani";
		//a1.assertEquals(false,name.equals("Sujani")); 
		//a1.assertEquals(driver.getTitle(),"Sujani"); // java.lang.AssertionError: expected [Sujani] but found [Google]
		a1.assertEquals(driver.getTitle(),"Google");   //assertEquals(String actual,String expected)
		/*
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
		*/
		
		//Assert.assertEquals(actualresult,expectedresult);
		Assert.assertEquals(driver.getPageSource().contains("404") ||driver.getTitle().contains("404") , true  );
		//assertequals -compares 2 values and verify if they are equal or not.
		
	}
	
	
	
}
