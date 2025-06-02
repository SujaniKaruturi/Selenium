package groTechMinds;

import java.time.Duration;
import java.util.List;

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
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); //wait till page is loaded completely
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(6000);
		WebElement dp = driver.findElement(By.xpath("//select[@class='form-select Choice1 select2-hidden-accessible']"));
		
		Select s=new Select(dp);
		
		List<WebElement> options = s.getOptions();
		for(int i=0;i<options.size();i++)
		{
			System.out.println("No of options in dropdown" + dp.getText());
			
		}
		//By using auto suggestion of options list
		List<WebElement> ddoptions = driver.findElements(By.xpath("//select[@class='form-select Choice1 select2-hidden-accessible']//option"));
		for(int i=0;i<ddoptions.size();i++)
		{
			WebElement ij = ddoptions.get(i);
			String textvalue = ij.getText();
			System.out.println("No of options in dropdown using auto suggestion " +textvalue );
			
		}
		//String selectedValue = s.options[s.selectedIndex].value;
		s.selectByVisibleText("Demo2");
		Thread.sleep(3000);
		s.selectByValue("Demo5");
		Thread.sleep(3000);
		s.selectByIndex(8);
		dp.sendKeys(Keys.ENTER);
		driver.quit();
		
		
		
	}

}
