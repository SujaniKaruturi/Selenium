package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_LoginCredentials {

	@DataProvider(name="data1")
	public Object testData()
	{	
		Object[][] d = new Object[3][2];
		d[0][0]="sujani@gmail.com";
		d[0][1]="tshirt";
		d[1][0]="sujani11@gmail.com";
		d[1][1]="glass";
		d[2][0]="sujani12@gmail.com";
		d[2][1]="keys";
		return d;
	}
	@Test(dataProvider= "data1")
	public void login(String username,String password)
	{
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);    //send input data to text box via sendkeys method
		driver.findElement(By.id("pass")).sendKeys(password); 
		driver.findElement(By.name("login")).click();
	}
}
