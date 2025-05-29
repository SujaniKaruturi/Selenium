package groTechMinds;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Payments {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/payments/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		Thread.sleep(5000);
		//driver.findElement(By.id("cardNumber")).sendKeys("345698764536");
		
		//input value to text box using javascript executor
		WebElement card= driver.findElement(By.id("cardNumber"));
		JavascriptExecutor j=driver;
		j.executeScript("arguments[0].value='345698764536';", card);
		
		driver.findElement(By.id("expiryDate")).sendKeys("3/24");
		driver.findElement(By.id("cvv")).sendKeys("544");
		
		WebElement cardtype = driver.findElement(By.id("cardType"));
		Select s =new Select(cardtype);
		s.selectByVisibleText("Mastercard");
		
		driver.findElement(By.id("amount")).sendKeys("7000");
		driver.findElement(By.id("saveCard")).click();
		
		driver.findElement(By.xpath("//input[@value='Make Payment']")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}
