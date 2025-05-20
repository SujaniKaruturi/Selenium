package SeleniumPractice;
//not able to inspect autosuggestion element in flipkart website,it is disappearing.
//so search with shoe rack in inspection itself and find the 8 elements of search.
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutoSuggestion {

	public static void main(String[] args) throws InterruptedException 
	{

		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize(); 
		
		driver.findElement(By.name("q")).sendKeys("shoe"); //searching for India auto suggestion
		Thread.sleep(4000);
		
		List<WebElement> fk = driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search']/ul/li"));
		int count = fk.size();
		//count is 0 , as we need to wait for milliseconds to load shoe autosuggestion.so Thread.sleep is required after search of shoe.
		System.out.println("Count of autosuggestion is  " + count);
	
		//fk.get(count-1).click(); 
		driver.quit();
		need to check this code again
		
	}

}
