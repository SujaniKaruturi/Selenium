package testFaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import sourceFaceBook.Login;

public class FBScenario1 
{
	@Test
	public void testCase1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		Login l=new Login(driver);
		l.userName();
		l.passWord();
		l.loginButton();
		
	}

}
