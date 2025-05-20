package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube_infinite {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com/channel/UCJk_YsKlbt48UTCb1rKfsGw");
		driver.manage().window().maximize(); 
		JavascriptExecutor j=driver;
		for(int i=5;i>=0;i++)
		{
			j.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(2000);
			System.out.println(i);
		}

	}

}
