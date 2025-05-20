package testNG2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Scenario2 extends LaunchAndQuit
{
	@Test
	public void action() throws InterruptedException
	{
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles"); //searching for mobiles
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();   //click on search button
	driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[3]")).click();  //selecting 3rd mobile
	
	}
}
