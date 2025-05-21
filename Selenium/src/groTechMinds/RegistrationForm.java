package groTechMinds;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("firstName")).sendKeys("Sujani");
		driver.findElement(By.id("lastName")).sendKeys("KAruturi");
		driver.findElement(By.id("email")).sendKeys("sujan@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9550336858");

		WebElement gender = driver.findElement(By.id("gender"));
		Select s =new Select(gender);
		s.selectByVisibleText("Female");
		
		WebElement state = driver.findElement(By.id("state"));
		Select s2 =new Select(state);
		s2.selectByIndex(4);
		state.sendKeys(Keys.ENTER);
		
		checkbox not getting clicked
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.name("Submit"));
		
		driver.quit();
		
		
		
		
		
		
		
	}

}
