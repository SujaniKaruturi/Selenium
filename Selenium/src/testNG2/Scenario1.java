package testNG2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario1 extends LaunchAndQuit
{

	@Test
	public void action() throws InterruptedException
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
		Thread.sleep(4000);  //comment this and run the code ,we get count is 0.
		
		List<WebElement> as1 = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count1 = as1.size();
		//count is 0 , as we need to wait for milliseconds to load shoe autosuggestion.so Thread.sleep is required after search of shoe.
		System.out.println("Count of autosuggestion is  " + count1);
		as1.get(count1-2).click();
	}
}
