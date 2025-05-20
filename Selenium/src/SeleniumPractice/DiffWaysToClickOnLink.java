package SeleniumPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DiffWaysToClickOnLink {

	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeDriver driver=new ChromeDriver();
		/*
		 * driver.get("https://www.amazon.in"); driver.manage().window().maximize();
		 * WebElement mobile=driver.findElement(By.linkText("Mobiles")); Actions a=new
		 * Actions(driver); a.doubleClick(mobile).perform(); //How to double click on
		 * any element?
		 */
		
		/*
		 * driver.navigate().to("https://grotechminds.com/registration/");
		 * driver.manage().window().maximize(); WebElement dd=
		 * driver.findElement(By.id("Skills")); //drop down locator
		 * dd.sendKeys(Keys.ENTER); //view drop down options from keyboard by clciking
		 * enter button dd.sendKeys(Keys.ARROW_DOWN); dd.sendKeys(Keys.ARROW_DOWN);
		 * dd.sendKeys(Keys.ENTER);
		 */
		
		/*
		 * driver.get("https://www.amazon.in/"); driver.manage().window().maximize();
		 * WebElement dd=
		 * driver.findElement(By.xpath("//select[@id='searchDropdownBox']")); Select k =
		 * new Select(dd); k.selectByIndex(5); //Amazon pharmacy
		 */
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement electronics=driver.findElement(By.xpath("(//div[@class='_2GaeWJ']//img)[4]"));	
		Actions a1=new Actions(driver);
		a1.contextClick(electronics).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
	}

}
