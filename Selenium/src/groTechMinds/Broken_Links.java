package groTechMinds;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//29. Print all the links present in google home page.
//30. Print attribute value for particular name
public class Broken_Links {
	static void all_Links() throws InterruptedException, IOException
	{
	ChromeDriver driver = new ChromeDriver();
	//driver.get("https://www.google.com/");
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	List<WebElement> allLinks= driver.findElements(By.tagName("a"));
	int count =allLinks.size();
	System.out.println( "Count of all links is " + count);
	for(int i=0; i<count; i++)
	  { 
		  System.out.println(i + " Link with attribute value is  " + allLinks.get(i).getAttribute("href")); 
	  }
	for(int j=0;j<count;j++) 
	{
		WebElement a=  allLinks.get(j);
		String url=a.getAttribute("href");
		String attributevalue =a.getText();   //text of html page at particular index 
		System.out.println( "Attribute value " + attributevalue +" Attribute Name(URL) " + url );
		verifyBrokenLinks(url);
	}
	}
	static void verifyBrokenLinks(String url) throws IOException
	{
		try
		{
		URL u1=new URL(url);	//built in class
		HttpURLConnection u2= (HttpURLConnection) u1.openConnection();  
		//upcast openConnection method with interface
		if(u2.getResponseCode()==200)
		{
			System.out.println("Link is valid " + url + " "+  u2.getResponseMessage());
		}
		else
		{
			System.out.println("Link is not valid " + url +" "+  u2.getResponseMessage());
		}
		}
		catch(MalformedURLException e)
		{
			System.out.println("Handled URL null value Exception ");
		}
		
	}
	/*
	Attribute value Try different image Attribute Name(URL) null
	Exception in thread "main" java.net.MalformedURLException: Cannot invoke "String.length()" because "spec" is null
	Caused by: java.lang.NullPointerException: Cannot invoke "String.length()" because "spec" is null
	MalformedURLException, NullPointerException occured as 'URL' class not able to handle URL which is null.
	so we need to resolve it using exception handling
	*/
	static void attribute_Value() throws InterruptedException
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	List<WebElement> allLinks= driver.findElements(By.tagName("a"));
	int count =allLinks.size();
	System.out.println( "Count of all links is " + count);
	for(int i=0; i<count; i++)
	  { 
		  System.out.println(i + " Class with attribute value is  " + allLinks.get(i).getAttribute("class")); 
	  }
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		all_Links();
		attribute_Value();
	}

}
