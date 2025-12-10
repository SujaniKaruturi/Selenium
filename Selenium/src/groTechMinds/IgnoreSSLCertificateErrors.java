package groTechMinds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IgnoreSSLCertificateErrors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);  // Accept SSL certificate errors

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");
        
        System.out.println("Page title: " + driver.getTitle());
        driver.quit();
	}

	/*
	 * When a website has: 
	 * Expired SSL certificate 
	 * Self-signed certificate
	 * Mismatched domain certificate 
	 * Browsers display “Your connection is not private” or SSL error page. 
	 * Selenium will not proceed normally unless we configure the browser to ignore SSL warnings. 
	 * setAcceptInsecureCerts(true) - Tells Chrome to ignore SSL certificate errors.
	 */
	
}
