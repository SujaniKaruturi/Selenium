package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException 
	{

		ChromeDriver j =new ChromeDriver();
		j.get("file:///C:/Users/DELL/Downloads/MKT%20HTML%20Page.html");
		j.manage().window().maximize(); 
		WebElement Username = j.findElement(By.xpath("(/html/body/input)[1]"));   //USername
		Username.sendKeys("Sujani");
		j.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("Hint");		//Hint
		j.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("Password");	//Password
		
		j.findElement(By.xpath("(/html/body/form/input)[1]")).sendKeys("First name");	//first name
		//j.findElement(By.xpath("(/html/body/form/input)[2]")).sendKeys("second name");   // org.openqa.selenium.ElementNotInteractableException: element not interactable
		//j.findElement(By.xpath("(/html/body/form/input)[3]")).click();		//click on submit 
		WebElement Boy = j.findElement(By.xpath("(((/html/body/form)[2])/input)[1]"));		//boy
		Boy.click();
		j.findElement(By.xpath("(((/html/body/form)[2])/input)[2]")).click();		//Girl
		j.findElement(By.xpath("(((/html/body/form)[2])/input)[3]")).click();		//Baby
		Thread.sleep(3000);
		j.findElement(By.xpath("(/html/body/input)[4]")).click();		//Male
		j.findElement(By.xpath("(/html/body/input)[5]")).click();		//Female
		j.findElement(By.xpath("(/html/body/input)[6]")).click();		//Bangalore
		j.quit();
	
		
		
		
		
		
		
		
		
		j.findElement(By.tagName("a")).click(); //tagname -as we have only 1 link in GroTechMinds so we can use in this way.
		//if there are 2 tagname  ,we cannot use in this way.
		

	}

}
