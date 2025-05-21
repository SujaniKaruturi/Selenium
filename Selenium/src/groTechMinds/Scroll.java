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
		
		ChromeDriver driver = new ChromeDriver();
		/*
		  driver.get("https://www.amazon.in/"); 
		  driver.manage().window().maximize();
		  //driver.findElement(By.xpath("//a[.='About Us']")).click(); //How to find out x,y co-ordinates 
		  WebElement au=driver.findElement(By.linkText("About Amazon")); 
		  Point xy= au.getLocation();	//Return type is point class 
		  int x=xy.getX(); //but x-axis is always 0 as we are scrolling down. 
		  int y=xy.getY();
		  System.out.println("X axis c--ordinates "+x);
		  System.out.println("Y axis c--ordinates "+y); //How to scroll down till About  US option from amazon.in page JavascriptExecutor j= driver;
		  //j.executeScript("window.scrollBy(0, 500)"); //directly giving co-ordinatesto scroll down 
		  //j.executeScript("window.scrollBy(0, "+y+")"); //passing variable y-axis. 
		  Thread.sleep(3000);
		  */
		 /*
		driver.navigate().to("https://www.browserstack.com/guide/selenium-scroll-tutorial");
		driver.manage().window().maximize();
		JavascriptExecutor j = driver;
		j.executeScript("window.scrollBy(0,document.body.scrollHeight)"); // scroll down to bottom of webpage
		Thread.sleep(5000);
		j.executeScript("window.scrollBy(0,-document.body.scrollHeight)");// scroll up to top of webpage
		Thread.sleep(10000);
		*/
		
		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial"); 
		driver.manage().window().maximize();
        WebElement Element = driver.findElement(By.linkText("Selenium scroll tutorial"));
        JavascriptExecutor j = driver;
       // j.executeScript("arguments[0].scrollIntoView();", Element); //Scroll down the page till the element is found
        //j.executeScript("arguments[0].scrollIntoView();", Element);//scroll the page Horizontally till the element is found
        Actions a=new Actions(driver);
        a.moveToElement(Element).perform();	//Another way using Actins class-Scroll down the page till the element is found
        Thread.sleep(5000);
        
		
		/*
	 	driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial"); 
		driver.manage().window().maximize();
		WebElement element= driver.findElement(By.linkText("Run Selenium Tests on Real Devices"));
		//Scroll to the bottom of the page
		//Way 1: By using JavaScriptExecutor
		JavascriptExecutor j = driver;
		//j.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		//Way 2: By pressing ctrl+end
		//element.sendKeys(Keys.CONTROL, Keys.END);
		
		//Way 3: By using Java Robot class
		Actions a1=new Actions(driver);
		a1.contextClick(element).perform();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		//robot.keyPress(KeyEvent.VK_END);
		//robot.keyRelease(KeyEvent.VK_END);
		

		 */
		Thread.sleep(7000);
		//driver.quit();
	}

}
