package groTechMinds;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeDriver driver = new ChromeDriver();

		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//mouse actions using robot class
		Robot robot = new Robot();

        // Delay for visibility (wait 2 seconds before starting)
        robot.delay(2000);

        // Move mouse to a specific screen location (e.g., x=500, y=300)
        robot.mouseMove(500, 300);

        // Simulate mouse left button click
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Press left button
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Release left button
        
        
		 driver.navigate().to("https://grotechminds.com/registration/");
		 driver.manage().window().maximize(); WebElement dd=
		 driver.findElement(By.id("Skills")); //drop down locator
		 dd.sendKeys(Keys.ENTER); //view drop down options from keyboard by clciking enter button
		 dd.sendKeys(Keys.ARROW_DOWN); 
		 dd.sendKeys(Keys.ARROW_DOWN);
		 dd.sendKeys(Keys.ENTER);
		 
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement electronics = driver.findElement(By.xpath("(//div[@class='_2GaeWJ']//img)[4]"));
		Actions a1 = new Actions(driver);
		a1.contextClick(electronics).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
