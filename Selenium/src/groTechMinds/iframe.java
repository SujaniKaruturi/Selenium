package groTechMinds;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
		did not find iframe 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/add-to-cart/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("firstName")).sendKeys("Sujani");
		driver.findElement(By.id("lastName")).sendKeys("Karuturi");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
	}

}
