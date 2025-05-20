package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow_DOM_Elements {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.airindia.com/");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();   	//Accept cookies
		//driver.findElement(By.id("radio0")).click();		//click on One Way Trip option
		String a1= "return document.querySelector('#ai-booking-widget > ai-tab-group > ai-tab:nth-child(1) > ai-search-flight > slot-fb > div.ai-search-flight-wrapper > div.ai-search-trip > div > div.ai-search-trip-type > ai-radio-group').shadowRoot.querySelector('#radio0')";
		WebElement e2=(WebElement)driver.executeScript(a1);
		e2.click();


	}

}
