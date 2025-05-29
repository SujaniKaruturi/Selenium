package groTechMinds;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow_DOM_Elements {

	public static void SelectorsHub() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//driver.findElement(By.linkText("Learning Hub")).click(); 
		// Locate the actual shadow host element
        WebElement shadowHost = driver.findElement(By.cssSelector("div#userName"));

        // Get the shadow root from the correct element
        SearchContext shadowRoot = shadowHost.getShadowRoot();

        // Locate the link inside the shadow root
        WebElement learningHubLink = shadowRoot.findElement(By.cssSelector("a.learningHub"));
        //learningHubLink.click();

        // Use JavaScriptExecutor to click on it
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", learningHubLink);

        // Wait to observe the result
        Thread.sleep(3000);
       // driver.quit();
	    
		
		
	}
	public static void AirIndia() throws InterruptedException
	{
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
	public static void main(String[] args) throws InterruptedException {
		
		//AirIndia();
		SelectorsHub();
	}

}
