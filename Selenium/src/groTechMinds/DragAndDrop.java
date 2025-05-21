package groTechMinds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement sorce=driver.findElement(By.xpath("//div[@id='container-3']//img"));
		WebElement dest=driver.findElement(By.id("div2"));
		Actions a=new Actions(driver);
		a.dragAndDrop(sorce, dest).perform();
	}

}
