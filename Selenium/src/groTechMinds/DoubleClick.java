package groTechMinds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void doubleClick() throws InterruptedException
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/left-double-click/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement dc=driver.findElement(By.xpath("//div[@class='popup2']"));
		Actions a=new Actions(driver);
		Thread.sleep(5000);
		a.doubleClick(dc).perform();
		
		Thread.sleep(5000);
		driver.findElement(By.id("mypopup2")).click();
		Thread.sleep(5000);
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		doubleClick();
		
	}

}
