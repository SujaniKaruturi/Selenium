package SeleniumPractice;
//calculate the no:of links that are present in given web page.
//after calculating count of links,print all the links
//interview question
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countOfLinksInAWebPage {

	public static void main(String[] args) 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.navigate().to("https://google.com");
		driver.manage().window().maximize(); 
		List<WebElement> tg = driver.findElements(By.tagName("a"));
		int count= tg.size();
		System.out.println("Count of links in a webpage is " + count);
		for(int j=0;j<count;j++) 
		{
			WebElement a=  tg.get(j);
			String attributename=a.getAttribute("href");
			String attributevalue =a.getText();   //text of html page at particular index 
			System.out.println( "Attribute value " + attributevalue +" Attribute Name " + attributename );
			
		}
		driver.quit();
	}
}
