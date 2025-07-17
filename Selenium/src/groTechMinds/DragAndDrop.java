package groTechMinds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement source=driver.findElement(By.xpath("//div[@id='container-3']//img"));
		WebElement dest=driver.findElement(By.id("div2"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(source, dest).perform();
		
		// Step 5: Create Actions class object and perform drag-and-drop using clickAndHold
        Actions action = new Actions(driver);
        action
            .clickAndHold(source) // Step 1: Hold the source
            .moveToElement(dest) // Step 2: Move to the target
            .release()             // Step 3: Release the mouse
            .build()               // Combine all actions
            .perform();            // Execute the action
	}

}
