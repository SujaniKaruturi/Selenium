package groTechMinds;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/multiple-select/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		WebElement multiple_select = driver.findElement(By.id("automobiles"));
		Select s=new Select(multiple_select);
		s.selectByVisibleText("Motorcycle");
		s.selectByValue("sedan");
		s.selectByIndex(3);
		driver.findElement(By.xpath("(//input[@value='Submit'])[1]")).click();
		
	}

}
