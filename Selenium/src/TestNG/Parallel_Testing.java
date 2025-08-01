package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_Testing {
	WebDriver driver;
	@BeforeTest
	@Parameters(value= "Browser")		//Parallel Testing
	//or
	//@Parameters("Browser")	
	public void initiate(String NameOfBrowser)
	{
		if(NameOfBrowser.equals("Chrome"))
		{
		driver=new ChromeDriver();
		}
		if(NameOfBrowser.equals("Firefox"))
		{
		driver=new FirefoxDriver();
		}
		if(NameOfBrowser.equals("Edge"))
		{
		driver=new EdgeDriver();
		}
		driver.navigate().to("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
	}
	@Test 
	public void fb_Login() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("Sujani");
		driver.findElement(By.id("pass")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.id("loginbutton")).click();
	}
	@AfterTest
	public void quit_Facebook() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
