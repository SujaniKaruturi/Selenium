package SeleniumPractice;
//Question: If the age of user is less than 18 then throw arithmetic exception.,
//If age of person is greater than 18 then allow him to access google.com 
import org.openqa.selenium.chrome.ChromeDriver;

public class Throw_Keyword {

	public static void main(String[] args) throws InterruptedException
	{
		int age =15;
		if (age>18)
		{
			ChromeDriver driver= new ChromeDriver();
			driver.get("https://google.com");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.close();
		}
		else
		{
			throw new ArithmeticException("you must be atleast 18");
		}


	}

}
