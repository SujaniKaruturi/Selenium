package SeleniumPractice;

//interview question: 
//Check whether the element is displayed or not?  
//Check given element is enabled or not?
//check if the given checkbox is selected or not
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckGivenElementisDisplayedOrNot
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver =new ChromeDriver();
		//driver.navigate().to("https://grotechminds.com/registration/"); //uncomment, then Element is not found because id=1 is part of GROTECHINDS website.
		driver.get("file:///C:/Users/DELL/Downloads/MKT%20HTML%20Page.html");
		driver.manage().window().maximize(); 
		/*
		//Check whether the element is displayed or not?
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
		*/
		
		/*
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
		*/
		
		/*
		//Check if given check box is not selected? 
		WebElement select = driver.findElement(By.id("321"));
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
		*/
		
		/*
		//Try to click on link without click method? 
		WebElement select = driver.findElement(By.tagName("a"));
		select.sendKeys(Keys.ENTER);     //instead of click method we are using Enter key from keyboard
		Thread.sleep(2000);
		*/
		
		driver.quit();
	}
}
