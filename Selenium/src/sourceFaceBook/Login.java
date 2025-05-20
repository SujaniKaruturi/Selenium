package sourceFaceBook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Login
{
	ChromeDriver driver;
	@Test
	public void login() throws InterruptedException
	{
		
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("email")).sendKeys("sujaninalla11@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Raviteja@3");
	driver.findElement(By.name("login")).click();
	
	Thread.sleep(5000);
	/*
	 * Actions ac=new Actions(driver); ac.sendKeys(Keys.ESCAPE).perform(); //Way to
	 * resolve mandatory notifications to be closed once we login app
	 * //ac.sendKeys(Keys.ESCAPE).build().perform(); //any one can be used
	 */	
	
	//By using chromeoptions
	ChromeOptions co=new ChromeOptions();
	co.addArguments("disable-notifications");   //code is not working need to ask eeshan

	}
}


