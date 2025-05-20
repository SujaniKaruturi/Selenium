package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_class55 
{
	public static void main(String[] args)  
	{
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize(); 
	WebElement drag= driver.findElement(By.id("drag9"));
	WebElement drop= driver.findElement(By.xpath("(//div[@class='c2maindiv'][1]/div)[4]/div[@id='div2'][1]"));
	Actions a=new Actions(driver);
	a.dragAndDrop(drag,drop).perform();  //this code will not work out as there is iframe and need to write code to switch to iframe.
	//iframe concept is showing error in grotectminds as there is bug in thier page itself. 
	//so MAnish explained iframe in Amazon payment application
}
}
