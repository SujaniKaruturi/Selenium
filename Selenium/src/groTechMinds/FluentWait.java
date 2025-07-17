package groTechMinds;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.name("q"));
		FluentWait wait = new FluentWait();
		//Wait<WebDriver> wait = new FluentWait<>(driver)
			    wait.withTimeout(Duration.ofSeconds(30))           // Total wait time
			    wait.pollingEvery(Duration.ofSeconds(5))           // Polling frequency
			    wait.ignoring(NoSuchElementException.class);       // Ignore this exception during polling

			WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			    public WebElement apply(WebDriver driver) {
			        return driver.findElement(By.id("someId"));
			    }
			});
		
			FluentWait<WebDriver> wait=new FluentWait<>(driver);
			wait.withTimeout(Duration.ofSeconds(10));  //10sec
			wait.pollingEvery(Duration.ofSeconds(2));	//	2sec
			wait.ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.visibilityOf(search));
			
			search.sendKeys("India");
			search.sendKeys(Keys.ENTER);
			

		
	}

	private void ignoring(Class<NoSuchElementException> class1) {
		// TODO Auto-generated method stub
		
	}

	private void pollingEvery(Duration ofSeconds) {
		// TODO Auto-generated method stub
		
	}

	private Object withTimeout(Duration ofSeconds) {
		// TODO Auto-generated method stub
		return null;
	}

}
