package SeleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException
	{

		ChromeDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize(); 
		Thread.sleep(3000);
		driver.navigate().back();   //moves to empty browser page
		Thread.sleep(3000);
		driver.navigate().forward();  //moves to google browser
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.quit();
	}

}
