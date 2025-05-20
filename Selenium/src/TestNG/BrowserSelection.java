package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class BrowserSelection 
{
	WebDriver driver;
	@Test 
	@Parameters("browser")
	public void launch(String nameofbrowser)
	{
		if(nameofbrowser.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		if(nameofbrowser.equals("Microsoft Edge"))
		{
			driver=new  EdgeDriver();//FirefoxDriver();
		}
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}
}
