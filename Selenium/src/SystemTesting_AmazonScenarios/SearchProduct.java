package SystemTesting_AmazonScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchProduct extends Amazon_LaunchQuit
{

	@Test
	public void shoeSearch()
	{
		List<WebElement> w= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count =w.size();
		System.out.println(count);
		
		
		
	}
}
