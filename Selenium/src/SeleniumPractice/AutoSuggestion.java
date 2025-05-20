package SeleniumPractice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.in/");
		driver.manage().window().maximize(); 
		driver.findElement(By.name("q")).sendKeys("India"); //searching for India auto suggestion
		Thread.sleep(1000);
	
		List<WebElement> as= driver.findElements(By.xpath("(//ul[@class='G43f7e']/li/div)"));
		int count= as.size();
		System.out.println("Count of autosuggestioons is " + count);
		Thread.sleep(2000);
		//as.get(0).click();   //clicking on frist autosuggestion ,index starts from 0
		//as.get(6).click();   //clicking on 5th autosuggestion
		as.get(count-5).click();   //generic code for clicking 
		driver.quit();
	}

}
