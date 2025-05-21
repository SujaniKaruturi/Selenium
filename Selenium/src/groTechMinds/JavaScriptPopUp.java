package groTechMinds;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUp {
	//diff between alert and prompt box or javascript popup
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); //wait till page is loaded completely
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Click ']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		//generally first we need to accept alert then only we can maximize chrome
		driver.manage().window().maximize();
		driver.quit();
	}

}
