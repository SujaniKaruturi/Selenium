package SeleniumPractice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_loginClass {

	public static void main(String[] args) throws InterruptedException 
	{
	 ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement hover= driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(hover).perform();
		driver.findElement(By.xpath("(//span[.='Sign in'])[1]")).click();
		
		JavascriptExecutor j = driver;
		//j.executeScript("document.getElementById('email').value="sujani"");	//need to check again videos
		
		driver.findElement(By.name("email")).sendKeys("9550336858");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Tanuku@3");
		driver.findElement(By.id("signInSubmit")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		List<WebElement> bags= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count =bags.size();
		System.out.println("Auto suggestion for bags count is " + count);
		bags.get(count-1).click();
		System.out.println("page is opened");
		
		driver.findElement(By.xpath("(//span[@class='rush-component s-latency-cf-section']/div/div)[8]")).click();
		System.out.println("8th bag page is opened");
		
		//navigate from parent browser to child browser and then add the product to cart.
				Set<String> parentandchild = driver.getWindowHandles();   //gives ids of both parent and child browsers
				System.out.println("Parent and child browser ids " +parentandchild );
				
				Iterator<String> seperateids = parentandchild.iterator();   //separates parent and child ids.
						String p1= seperateids.next();  //first next method gives parent id
						String c1= seperateids.next();	 //second next method gives child id
						System.out.println("Parent browser ids " +p1 );
						System.out.println("Child browser ids " +c1 );
						
		driver.switchTo().window(c1);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.name("proceedToRetailCheckout")).click();
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]")).click();
		
		driver.findElement(By.xpath("(//span[.='Net Banking'])[2]"));
		
		
		
		//driver.quit();
		
		

	}

}
