package groTechMinds;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static void vertical() throws InterruptedException
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/scrolling/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		JavascriptExecutor j=driver;
		j.executeScript("window.scrollBy(0,2000)");  //basic vertical scroll - x-axis is always 0 as we are scrolling down.
		j.executeScript("window.scrollBy(0,2000)");
	}
	public static void horizontal() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/scrolling/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement hor= driver.findElement(By.linkText("Age"));
		//Actions h=new Actions(driver);
		//h.moveToElement(hor).click().perform();
		//second way
		JavascriptExecutor j=driver;
		j.executeScript("arguments[0].scrollIntoView();", hor);  //horizontal scroll
		j.executeScript("arguments[0].click();" , hor);
		//hor.click(); //org.openqa.selenium.ElementClickInterceptedException: element click intercepted
		
	}
	public static void ScrollwithCoOrdinates() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement amazon=driver.findElement(By.linkText("About Amazon"));
		Point xandy =amazon.getLocation();
		int x=xandy.getX();
		int y=xandy.getY();
		System.out.println("x co-ordinates are " +x);
		System.out.println("y co-ordinates are " +y);
		
		
		Actions a=new Actions(driver);
		//first way
		not clicking on about amazon option
		a.moveToElement(amazon).click().build().perform();
		//second way
		//a.moveByOffset(x,y).click().perform();  
		//org.openqa.selenium.interactions.MoveTargetOutOfBoundsException: move target out of bounds
		//third way
		JavascriptExecutor var1 = driver;
		var1.executeScript("arguments[0].scrollIntoView();", amazon);
		var1.executeScript("arguments[0].click();" , amazon);
		//amazon.click();  //org.openqa.selenium.ElementClickInterceptedException: element click intercepted
		//fourth way
		//JavascriptExecutor var2 = driver;
		//var1.executeScript("window.scrollBy(0,"+y+")");	//Scroll Down - x-axis is always 0 as we are scrolling down.
		Thread.sleep(1000);
		//var1.executeScript("window.scrollBy(0,-"+y+")"); //Scroll Up
		
	}
	
	public static void Scroll_Up_down() throws InterruptedException, AWTException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.browserstack.com/guide/selenium-scroll-tutorial");
		driver.manage().window().maximize();
		JavascriptExecutor j = driver;
		j.executeScript("window.scrollBy(0,document.body.scrollHeight)"); // scroll down to bottom of webpage
		Thread.sleep(5000);
		j.executeScript("window.scrollBy(0,-document.body.scrollHeight)");// scroll up to top of webpage
		Thread.sleep(10000);
		
		WebElement element= driver.findElement(By.linkText("Run Selenium Tests on Real Devices"));
				//Scroll to the bottom of the page
		
				//Way 2: By pressing ctrl+end
				element.sendKeys(Keys.CONTROL, Keys.END);
				
				//Way 3: By using Java Robot class
				Actions a1=new Actions(driver);
				a1.contextClick(element).perform();
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
				robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
				//robot.keyPress(KeyEvent.VK_END);
				//robot.keyRelease(KeyEvent.VK_END);
				robot.keyPress(KeyEvent.VK_ENTER);
				
				Thread.sleep(7000);
				//driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		//vertical();
		horizontal();
		//ScrollwithCoOrdinates();
		//Scroll_Up_down();
	}

}
