package groTechMinds;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver =new ChromeDriver();
		driver.get("https://grotechminds.com/is-selected/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); //wait till page is loaded completely
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

		
		WebElement checkbox13 = driver.findElement(By.xpath("//label[text()=' CheckBox13 ']"));
		checkbox13.click();
		System.out.println("text Checkbox 13 is selected " + checkbox13.isSelected());
		
		WebElement checkbox13_2 =driver.findElement(By.xpath("(//input[@id='vehicle2'])[13]"));
		checkbox13_2.click();
		System.out.println("Checkbox 13 is selected " + checkbox13_2.isSelected());
		
		driver.quit();
	}

}
