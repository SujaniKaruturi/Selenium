package groTechMinds;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindownHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Store the current window handle
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String mainWindow = driver.getWindowHandle();

		Thread.sleep(5000);
		// Perform some action that opens a new window/tab
		//driver.findElement(By.xpath("(//span[text()='Sign in'])[2]")).click();
		WebElement signin = driver.findElement(By.xpath("(//span[text()='Sign in'])[2]"));
		JavascriptExecutor j=driver;
		j.executeScript("arguments[0].click(); ", signin );
		
		// Get all window handles
		Set<String> allWindows = driver.getWindowHandles();

		for (String handle : allWindows) {
		    if (!handle.equals(mainWindow)) {
		        driver.switchTo().window(handle);
		        System.out.println("Switched to child window: " + driver.getTitle());

		        // Perform actions in new window
		        driver.close(); // Optional: Close the child window

		        // Switch back to main window
		        driver.switchTo().window(mainWindow);
		    }
		}
	}

}
