package groTechMinds;

import java.util.ArrayList;
import java.util.Iterator;
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
		 System.out.println("Main window id with return type as string" + mainWindow);

		Thread.sleep(5000);
		// Perform some action that opens a new window/tab
		//driver.findElement(By.xpath("(//span[text()='Sign in'])[2]")).click();
		WebElement signin = driver.findElement(By.xpath("(//span[text()='Sign in'])[2]"));
		JavascriptExecutor j=driver;
		j.executeScript("arguments[0].click(); ", signin );
		
		// Get all window handles
		Set<String> allWindows = driver.getWindowHandles();
		 System.out.println("set of all windows" + allWindows);


		for (String eachwindow : allWindows) {
		    if (!eachwindow.equals(mainWindow)) { 
		    	driver.switchTo().window(eachwindow);
		        System.out.println("Switched to child window: " + driver.getTitle());
		        if(driver.getTitle().contains("Google") || driver.getCurrentUrl().contains("google.com"))
		        {
		        	  System.out.println("Switched to window:  Google");
		        //do any action u want to perform
		        	driver.close();
		        	break;
		        }
		        driver.switchTo().window(mainWindow);// Switch back to main window
		        // Perform actions in new window
		        driver.quit(); // Optional: Close all windows
		    }
		    
		    
		    //another way of switching to particular window by converting set into arraylist
	        // Convert Set to List to access by index
	        ArrayList<String> windowList = new ArrayList<>(allWindows);

	        // Switch to the 4th window (index 3)
	        driver.switchTo().window(windowList.get(3)); // 4th window
	        System.out.println("Switched to 4th window: " + driver.getTitle());

	        // Perform actions in 4th window here if needed
	        Thread.sleep(2000);

	        // Switch back to main window
	        driver.switchTo().window(mainWindow);
	        System.out.println("Switched back to main window: " + driver.getTitle());

	        driver.quit();
		    
		    //another way of using getWindowHandles
		    Set<String> wh=driver.getWindowHandles();
			Iterator<String> i =wh.iterator();
			String parent = i.next();
			String child =i.next();
			System.out.println("Parent Window ID: " + parent);
	        System.out.println("Child Window ID: " + child);
	        
	     // Switch to Child Window
	        driver.switchTo().window(child);
	        System.out.println("Child Window Title: " + driver.getTitle());

	     // Switch back to Parent
	        driver.switchTo().window(parent);
	        System.out.println("Back to Parent Window Title: " + driver.getTitle());
		}
	}

}
