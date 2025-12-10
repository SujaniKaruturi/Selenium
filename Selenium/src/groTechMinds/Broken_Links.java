package groTechMinds;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//29. Print all the links present in google home page.
//30. Print attribute value for particular name
public class Broken_Links {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		 driver.navigate().refresh();
		 

		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();

		int noofvalidlinks = 0;
		int noofinvalidlinks = 0;
		int noofnulloremptylinks = 0;

		for (int i = 0; i < size; i++) {
			try {
				/*
				 * //How to Handle Hidden Links in Selenium 
				 * if(link.isDisplayed()){ // only validate visible links 
				 * String url = link.getAttribute("href"); }
				 */
				String urls = links.get(i).getDomAttribute("href"); // Returns the value exactly as written in the HTML
																	// markup, even if the browser later changes it.
				String urls2 = links.get(i).getDomProperty("href"); // the live values the browser uses at runtime.Use
																	// when you want the real-time, live value seen by
																	// JavaScript.
				System.out.println("Link Value " + i + " with url is " + urls);
				// System.out.println("value of getDomProperty is " + urls2);
				
				if (urls == null || urls.isEmpty()) {

					System.out.println(urls + "the url is empty or null");
					noofnulloremptylinks++;
					continue;
				}

				// MalformedURLException FIX: Make relative URLs absolute
				if (!urls.startsWith("http")) {
					urls = "https://www.google.com" + urls;
				}

				URL u1 = new URL(urls);
				HttpURLConnection h1 = (HttpURLConnection) u1.openConnection();
				// h1.setRequestMethod("HEAD");
				h1.setConnectTimeout(5000);
				h1.connect();

				if (h1.getResponseCode() >= 400) {
					System.out.println(urls + " : " + h1.getResponseCode() + " :the link is not valid or broken");
					noofinvalidlinks++;
				} else {
					System.out.println(urls + " : " + h1.getResponseCode() + " :The Link is Valid");
					noofvalidlinks++;
				}
				h1.disconnect();

			}

			catch (MalformedURLException e) {
				System.out.println("Handled URL null value Exception ");
			}

		}
		System.out.println("Total links present: " + size);
		System.out.println("Total invalid links: " + noofinvalidlinks);
		System.out.println("Total valid links: " + noofvalidlinks);
		System.out.println("Total null or empty links: " + noofnulloremptylinks);

		/*
		 * Attribute value Try different image Attribute Name(URL) null Exception in
		 * thread "main" java.net.MalformedURLException: Cannot invoke "String.length()"
		 * because "spec" is null Caused by: java.lang.NullPointerException: Cannot
		 * invoke "String.length()" because "spec" is null MalformedURLException,
		 * NullPointerException occured as 'URL' class not able to handle URL which is
		 * null. so we need to resolve it using exception handling
		 */
		/*
		 * You're getting: java.net.MalformedURLException: no protocol:
		 * /advanced_search?hl=en&fg=1 because the URL you passed does not contain a
		 * protocol (http:// or https://). Java requires a complete, absolute URL in the
		 * URL constructor.
		 */
	}
}
