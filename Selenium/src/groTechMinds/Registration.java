package groTechMinds;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.findElement(By.id("fname")).sendKeys("Ravi");
		driver.findElement(By.id("lname")).sendKeys("Teja");
		driver.findElement(By.id("email")).sendKeys("Ravi@gamil.com");
		driver.findElement(By.id("password")).sendKeys("1234dfgh" + Keys.ENTER);
		//Thread.sleep(5000);
		
		//driver.findElement(By.id("male")).click();  //issue with application 
		
		WebElement skill = driver.findElement(By.id("Skills"));
		Select s= new Select(skill);
		s.selectByVisibleText("Technical Skills");
		
		driver.findElement(By.id("Present-Address")).sendKeys("Hyderabad");
		driver.findElement(By.id("Permanent-Address")).sendKeys("Hyderabad");
		driver.findElement(By.id("Pincode")).sendKeys("534678");
		//driver.findElement(By.id("relocate")).click();  //issue with application 
		driver.findElement(By.id("file")).sendKeys("D:\\PF MONEY WITHDRALL.pdf");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@name='Submit']")).click();  //issue with application 
		
		
	}

}
