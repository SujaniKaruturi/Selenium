package groTechMinds;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessMode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();		
		options.addArguments("--headless");		//Run the code in the background is headless mode
		//options.addArguments("--window-size=1000,800");		//launch browser in particular dimension
		//options.addArguments("--start-maximized");	//maximise to full screen
		ChromeDriver driver =new ChromeDriver(options);
		System.out.println("Running browser in headless mode");
		JavascriptExecutor j =driver;
		j.executeScript("window.resizeTo(500,500)");	//another way of launch browser to particular dimension using javascript
	
	driver.get("https://www.google.in/");
	//driver.manage().window().maximize(); 
	driver.findElement(By.name("q")).sendKeys("India"); //searching for India auto suggestion
	Thread.sleep(1000);
	}

}
