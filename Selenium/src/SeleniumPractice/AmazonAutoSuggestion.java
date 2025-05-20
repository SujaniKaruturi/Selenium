package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAutoSuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
		Thread.sleep(4000);  //comment this and run the code ,we get count is 0.
		
		List<WebElement> as1 = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count1 = as1.size();
		//count is 0 , as we need to wait for milliseconds to load shoe autosuggestion.so Thread.sleep is required after search of shoe.
		System.out.println("Count of autosuggestion is  " + count1);
		as1.get(count1-4).click();
		System.out.println("Clicked");
		driver.quit();
		
	}

}
