package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumWithBrowserStack {

	
	public static void main (String[] args) throws MalformedURLException
	{
		final String username = "sujani_9XGnEe";
		final String automtionKey = "qHWd4tZfyzNp3mVr5jWE";
		final String URL = "https://" + username+ "/" + automtionKey + "@hub-cloud.browserstack.com/wd/hub";
		
		DesiredCapabilities ds= new  DesiredCapabilities();
		ds.setCapability("os", "windows");
		ds.setCapability("os_version", "10");
		ds.setCapability("browser", "chrome");	
		ds.setCapability("browser_verison", "134");	
		ds.setCapability("name", "Automation Testcases");	
		WebDriver driver =new RemoteWebDriver(new URL(URL),ds	);
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.submit();
		
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}
}
