package testNG2;
import java.time.Duration;

//class video 37
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchAndQuit 
{
	ChromeDriver driver;
	@BeforeMethod    //Pre-condition activity
	public void Lauch()
	{
		 driver =new ChromeDriver();   
		//driver is local variable ,where driver from action method gives error.
		//so declared driver as global variable.
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); 
		//driver.manage().timeouts().implicitlyWait(time, unit);  // umcomment and check ,this method is depreciated
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	
	@AfterMethod   
	public void quit1() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}
}
