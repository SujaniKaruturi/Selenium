package TestNG;
//class 37
import java.util.List;
//video Class:37
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchAmazon
{
	ChromeDriver driver;
	@BeforeMethod    //Pre-condition activity
	public void Lauch()
	{
		ChromeDriver driver =new ChromeDriver();   
		//driver is local variable ,where driver from action method gives error.
		//so declared driver as global variable.
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); 
	}
	@Test(retryAnalyzer = TestNG.Retry_Failed_Testcases.class) //Packagename.Classname  where retry logic is written
	//.class need to be written explicitly indicating Retry_Failed_Testcases is a class.
	//if its inetrface we need to mention .interface as well.
	public void action() throws InterruptedException
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
		Thread.sleep(4000);  //comment this and run the code ,we get count is 0.
		
		List<WebElement> as1 = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count1 = as1.size();
		//count is 0 , as we need to wait for milliseconds to load shoe autosuggestion.so Thread.sleep is required after search of shoe.
		System.out.println("Count of autosuggestion is  " + count1);
		//as1.get(count1-4).click();
		//System.out.println("Clicked");
	}
	@AfterMethod   
	public void quit1() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
