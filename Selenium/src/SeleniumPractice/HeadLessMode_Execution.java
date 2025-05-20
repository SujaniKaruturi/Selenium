package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessMode_Execution 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options= new ChromeOptions();		
		//options.addArguments("--headless");		//Run the code in the background is headless mode
		//options.addArguments("--window-size=1000,800");		//launch browser in particular dimension
		//options.addArguments("--start-maximized");
		ChromeDriver driver =new ChromeDriver(options);
		
		JavascriptExecutor j =driver;
		j.executeScript("window.resizeTo(500,500)");	//another way of launch browser to particular dimension using javascript
	
	driver.get("https://www.google.in/");
	//driver.manage().window().maximize(); 
	driver.findElement(By.name("q")).sendKeys("India"); //searching for India auto suggestion
	Thread.sleep(1000);
}
}
