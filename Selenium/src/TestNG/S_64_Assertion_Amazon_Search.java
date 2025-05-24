package TestNG;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class S_64_Assertion_Amazon_Search {

	@Test
	public void amazonSearch()
	{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.amezon.in");
	WebElement txtBox_search = driver.findElement(By.id("twotabsearchtextbox"));
	txtBox_search.sendKeys("Shoes"+Keys.ENTER);
	
	List<WebElement> l1 = driver.findElements(By.xpath("//span[@class='rush-component']/a/div"));
	System.out.println(l1.size());
	
	Assert.assertEquals((l1.size()>1), true , "Product search test case failed");
	//Assert.assertEquals(Boolean Actual, boolean expected , String message);
	

}
}
