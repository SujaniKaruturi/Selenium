package SystemTesting_AmazonScenarios;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import DataDrivenTesting.LoginCredentialsFromExcel;

public class Amazon_LaunchQuit extends ExcelFetching 
{	
	ChromeDriver driver; 
	@BeforeMethod
	public void Launch() throws InterruptedException
	{
		driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); 
		
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		WebElement hoverover1 = driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions hv =new Actions(driver);     
		hv.moveToElement(hoverover1).perform();		 //Hoverover on Hello, sign in option
		WebElement g = driver.findElement(By.xpath("//span[.='Sign in']")); //Click on sign in button
		System.out.println("Clicked on Sign in");
		/*
		Set<String> parentandchild = driver.getWindowHandles();   //gives ids of both parent and child browsers
		System.out.println("Parent and child browser ids " +parentandchild );
		
		Iterator<String> seperateids = parentandchild.iterator();   //separates parent and child ids.
				String p1= seperateids.next();  //first next method gives parent id
				String c1= seperateids.next();	 //second next method gives child id
				System.out.println("Parent browser ids " +p1 );
				System.out.println("Child browser ids " +c1 );
				
		driver.switchTo().window(c1);
		
		*/
		driver.findElement(By.name("email")).sendKeys(mobnum);
		//driver.findElement(By.xpath("//input[@id='ap_email_login']")).sendKeys(mobnum);
		driver.findElement(By.id("continue")).click();
		//driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(password);
		//driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(5000);
	}
	@AfterMethod
	public void quit_Amazon() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		/*
		TakesScreenshot ts= driver;    //upcasting
		File fsource =ts.getScreenshotAs(OutputType.FILE);    //takes the screenshot
		File fdest=new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Screenshot\\screenshot_code.png");
		FileUtils.copyFile(fsource, fdest);
		*/
		driver.quit();
	}
}
