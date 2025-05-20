package SeleniumPractice;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysFunctionality {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver =new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/registration/");
		driver.manage().window().maximize(); 
		//Thread.sleep(3000);
		//driver.findElement(By.id("fname")).sendKeys("Sujani");
		WebElement w= driver.findElement(By.id("fname"));
		w.sendKeys("Sujani");
		w.sendKeys(Keys.CONTROL+"a");  //selects everything
		w.sendKeys(Keys.CONTROL+"c");  //copy
		
		driver.findElement(By.id("lname")).sendKeys(Keys.CONTROL+"v");   //paste in lname field
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"v");	 //paste in email field
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"v");	 //paste in password field
		WebElement dd= driver.findElement(By.id("Skills"));   //drop down locator
		dd.sendKeys(Keys.ENTER);   //view drop down options from keyboard by clciking enter button
		dd.sendKeys(Keys.ARROW_DOWN);
		dd.sendKeys(Keys.ARROW_DOWN);
		//dd.sendKeys(Keys.ENTER+ "+" +Keys.ARROW_DOWN+ "+" +Keys.ARROW_DOWN); another way of selecting drop down in one line code
		//using for loop also ,this can be done.
		String[] options = ["Technical Skills", "Non-Technical Skills"]
		for option in options:
		{
			
		}
		
		dd.click();
		
		
		
		
				
		
		

	}

}
