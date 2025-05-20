package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//login to amazon account, search for mobiles, click on search button and click on check 3rd mobile
//same question for shoe,select 35th shoe,click on add to cart
//use amazon.in ,exception occurs for shoe code only in amazon.in but in other website like amazon.com no error occurs
public class AmazonAssignement {

	public static void main(String[] args) throws InterruptedException
	{
		/*
		ChromeDriver j =new ChromeDriver();
		j.get("https://www.amazon.in/");
		j.manage().window().maximize(); 
		j.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles"); //searching for mobiles
		j.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();   //click on searcg button
		//j.findElement(By.xpath("(//span[@class = 'a-size-base a-color-base'])[8]")).click();  //checkbox on realme -error
		j.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[3]")).click();  //selecting 3rd mobile
		j.quit();
		*/
		
		
//video class 29
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); 
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoes"); //searching for shoes
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();   //click on search button
		WebElement o = driver.findElement(By.xpath("(//a[@class = 'a-link-normal s-no-outline'])[35]"));
		o.click();
//navigate from parent browser to child browser and then add the product to cart.
		Set<String> parentandchild = driver.getWindowHandles();   //gives ids of both parent and child browsers
		System.out.println("Parent and child browser ids " +parentandchild );
		
		Iterator<String> seperateids = parentandchild.iterator();   //separates parent and child ids.
				String p1= seperateids.next();  //first next method gives parent id
				String c1= seperateids.next();	 //second next method gives child id
				System.out.println("Parent browser ids " +p1 );
				System.out.println("Child browser ids " +c1 );
				
		driver.switchTo().window(c1);
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-button")).click(); 
		Thread.sleep(3000);
		driver.close();   //Here child window gets closed as the browser window moved from parent to child at driver.switchTo().window(c1); line
		
//NosuchElementException -because control is in parent amazon class,
//we need to move control from parent(Amazon) to child(35th Shoe page) class/page then it is possible to add the product to cart.
//move the bowser from parent ot child browser is explained class 40 ,so after 40 the video i completed this program to add the product to cart.
		
		
		
		
	}

}
