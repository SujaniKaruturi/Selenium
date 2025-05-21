package groTechMinds;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver =new ChromeDriver();
		driver.get("https://grotechminds.com/alert/");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); //wait till page is loaded completely
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//button[text()='Alert1'])[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("(//button[text()='Button1'])[2]")).click();
		Thread.sleep(11000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//button[text()='Received1'])[3]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		//how can we verify we selected no
		Thread.sleep(5000);
		
		//generally first we need to accept alert then only we can maximize chrome
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
