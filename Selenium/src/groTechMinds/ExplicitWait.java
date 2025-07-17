package groTechMinds;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search1 = driver.findElement(By.name("q"));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));//old syntax, it will wait for 10 secs,to make sure the google page is fully loaded.
		wait.until(ExpectedConditions.titleIs("Sujani"));	//When title of page is same as given then it will run forward,if not gives NoSuchElement exception.
		wait.until(ExpectedConditions.titleIs("Google")); 
		wait.until(ExpectedConditions.elementToBeClickable(search1)); 
		wait.until(ExpectedConditions.titleContains("Goog")); 
		wait.until(ExpectedConditions.visibilityOf(search1));
		wait.until(ExpectedConditions.attributeContains(search1,"name" ,"q"));
		WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q"))); 	
		loginButton.click();
		//wait till element is visible.
		wait.until(ExpectedConditions.alertIsPresent()); //Check any alert(javascript pop up) is present
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("India" + Keys.ENTER);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(search));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("q")));
		
	}

}
