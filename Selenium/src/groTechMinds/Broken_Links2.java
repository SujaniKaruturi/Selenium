package groTechMinds;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		List<WebElement> blinks= driver.findElements(By.tagName("a"));
		int count = blinks.size();
		System.out.println("Total no of links " + count);
		
		for(int i =0; i<=count ; i++) 
		{
			WebElement eachlink= blinks.get(i);
			String url = eachlink.getAttribute("href");
			verify_links(url);
			System.out.println(url);
		}
		public static void verify_links(String url) throws IOException
		{
			URL ul = new URL(url); //Creating an Object of URL class
			HttpURLConnection c =(HttpURLConnection) ul.openConnection(); //upcasting to HttpURLConnection Interface
			c.connect();
			if(c.getResponseCode() == 200)
			{
				System.out.println(c.getResponseCode()+" -> "+c.getResponseMessage()+" -> "+"Link is valid");
			}
			else
			{
				System.out.println(c.getResponseCode()+" -> "+c.getResponseMessage()+" -> "+"Link is Invalid");
			}
			
		}
	}

}
