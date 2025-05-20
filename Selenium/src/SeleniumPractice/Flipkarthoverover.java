package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//open flipkart ,login pop up appaers, click on cross button to close and then hoverover fashion and click on women ethnic
public class Flipkarthoverover {

	public static void main(String[] args) throws InterruptedException
	{
		
		
		ChromeDriver j =new ChromeDriver();
		j.get("https://www.flipkart.com/");
		j.manage().window().maximize(); 
		Thread.sleep(5000);
		
		
		//j.findElement(By.xpath("//span[.='✕']")).click(); //not able to close login pop-up
		//WebElement hoverover1 = j.findElement(By.xpath("//span[.='Hello, sign in']"));
		Thread.sleep(1000);
		not able to hoverover on Fashion options, need to check this assignment
		
	}

}
