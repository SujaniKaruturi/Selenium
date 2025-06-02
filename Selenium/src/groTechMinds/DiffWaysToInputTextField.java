package groTechMinds;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DiffWaysToInputTextField {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search1 = driver.findElement(By.name("q"));
		//search1.sendKeys("india");
		
		JavascriptExecutor j=driver;
		j.executeScript("arguments[0].value = 'india'; ", search1 );
		
		Actions a=new Actions(driver);
		a.sendKeys("india");
		
		Robot r=new Robot();
		
	}

}
