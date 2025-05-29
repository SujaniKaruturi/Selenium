package groTechMinds;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedDisplayedEnabled{

	
	public static void isSelected() throws InterruptedException
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Downloads/MKT%20HTML%20Page.html"); 
		driver.manage().window().maximize();  
		WebElement select = driver.findElement(By.id("321")); //Check if given check box is not selected?  
		boolean b= select.isSelected(); 
		System.out.println("Element is not selected " + b); 
		if( select.isSelected()==false)   //comparison operator 
		{ 
		System.out.println("Element is not selected"); 
		select.click(); 
		Thread.sleep(2000); 
		} 
		else 
		{ 
		System.out.println("Element is already selected"); 
		} 
	}
	public static void isDisplayed() throws InterruptedException
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Downloads/MKT%20HTML%20Page.html"); 
		driver.manage().window().maximize();  
		WebElement display = driver.findElement(By.id("1")); 
		boolean b= display.isDisplayed(); 
		System.out.println("Element is found/not-found " + b); 
		if(display.isDisplayed()==true)   //comparison operator 
		{ 
		System.out.println("Element is found"); 
		display.sendKeys("Sujani"); 
		}
		else 
		{ 
		System.out.println("Element is not found"); 
		} 
	}
	public static void isEnabled() throws InterruptedException
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Downloads/MKT%20HTML%20Page.html"); 
		driver.manage().window().maximize();  
		//Check given element is enabled or not? 
		WebElement enable = driver.findElement(By.id("121")); 
		System.out.println("Element is Enabled or not " + enable.isEnabled()); 
		if(enable.isEnabled()==true)   //comparison operator 
		{ 
		System.out.println("Element is Enabled"); 
		} 
		else 
		{ 
		System.out.println("Element is Disabled"); 
		} 
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		isSelected();
		isDisplayed();
		isEnabled();
		
		
		
	}

}
