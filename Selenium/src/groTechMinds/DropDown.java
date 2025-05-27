package groTechMinds;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); //wait till page is loaded completely
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(6000);
		WebElement dp = driver.findElement(By.xpath("//select[@class='form-select Choice1 select2-hidden-accessible']"));
		//WebElement dp = driver.findElement(By.id("Choice1"));
		//dp.click();   //not required to click on select element.
		Select s=new Select(dp);
		System.out.println("No of options in dropdown" + s.getOptions().size());
		String selectedValue = s.options[s.selectedIndex].value;
		s.selectByVisibleText("Demo2");
		Thread.sleep(3000);
		s.selectByValue("Demo5");
		Thread.sleep(3000);
		s.selectByIndex(8);
		dp.sendKeys(Keys.ENTER);
		driver.quit();
		
		
		
	}

}
