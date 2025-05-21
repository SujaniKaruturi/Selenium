package groTechMinds;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
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
		j.executeScript("window.scrollBy(0,1000)");  //basic vertical scroll
		j.executeScript("window.scrollBy(0,2000)");
	}
	public static void horizontal() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/scrolling/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement hor= driver.findElement(By.className("scrollmenu"));
		Actions h=new Actions(driver);
		h.moveToElement(hor).perform();
		//how to scroll horizontally
		JavascriptExecutor j=driver;
		//j.executeScript("arguments[0].scrollIntoView();", hor); 
		
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
		a.moveToElement(amazon).perform();
		//second way
		a.moveByOffset(x,y).click().perform();
		//third way
		JavascriptExecutor var1 = driver;
		var1.executeScript("arguments[0].scrollIntoView();", amazon);
		//fourth way
		JavascriptExecutor var2 = driver;
		var1.executeScript("window.scrollBy(0,"+y+")");	//Scroll Down
		Thread.sleep(1000);
		var1.executeScript("window.scrollBy(0,-"+y+")"); //Scroll Up
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//vertical();
		//horizontal();
		ScrollwithCoOrdinates();
	}

}
