package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args)
	{
	
		ChromeDriver j =new ChromeDriver();
		j.get("https://www.facebook.com/");
		j.manage().window().maximize();   //maximize the chrome screen
		//j.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input")).sendKeys("sujaninalla11@gmail.com");  //absolute xpath
		//j.findElement(By.xpath("(//input)[3]")).sendKeys("sujaninalla11@gmail.com");   //relative xpath
		j.findElement(By.xpath("//input[@id='email']")).sendKeys("sujaninalla11@gmail.com"); 
		
		
		
	}

}
