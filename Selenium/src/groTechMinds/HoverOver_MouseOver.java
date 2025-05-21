package groTechMinds;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_MouseOver {

	public static void amazon_language() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement lang=driver.findElement(By.xpath("//div[text()='EN']"));
		Actions a=new Actions(driver);		//hoverover
		a.moveToElement(lang).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='nav-template nav-flyout-content nav-tpl-itemList'])[1]//a[@lang='te-IN']")).click();
	}
	public static void grotechminds() throws InterruptedException
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); //wait till page is loaded completely
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(6000);
		
		WebElement hv=driver.findElement(By.xpath("//div[@class='toolrip4']"));
		Actions a=new Actions(driver);
		a.moveToElement(hv).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='toolrip4']//span//div)[4]")).click();
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		grotechminds();
		amazon_language();
	}

}
