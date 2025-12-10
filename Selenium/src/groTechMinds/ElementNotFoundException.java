package groTechMinds;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//How can you bypass the issue of Element Not Found without using and with using Try catch or throws or custom exceptions? answer with clear explanation
public class ElementNotFoundException {

	static WebDriver driver;
	//using throws keyword
	public static void clickElement() throws NoSuchElementException {
			    driver.findElement(By.id("login")).click();
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//without using try catch,throws,custom only through explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		
		//use findElements() as it returns empty list instead of NoSuchElementException
		List<WebElement> elements = driver.findElements(By.xpath("//input[@id='username']"));

		if(!elements.isEmpty()) {
		    elements.get(0).click();
		} else {
		    System.out.println("Element not present");
		}
		
		//Using try-catch
		try {
		    WebElement ele2 = driver.findElement(By.id("username"));
		    ele.click();
		} 
		catch (NoSuchElementException e) {
		    System.out.println("Element not present, skipping the step");
		}

 
		//Using throws, Then handle it at call level:
		try {
		    clickElement();
		} 
		catch (NoSuchElementException e) {
		    System.out.println("Element missing → continued execution");
		}

		


	}

}
