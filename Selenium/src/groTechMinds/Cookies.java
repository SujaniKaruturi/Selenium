package groTechMinds;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cookies {

	//static WebDriver driver;
	public static void cookies_Manju()
	{
		// Set up ChromeOptions to use your Chrome profile
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:/Users/YourUsername/AppData/Local/Google/Chrome/User Data");
        options.addArguments("profile-directory=Default"); // or "Profile 1", etc.

       WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");

        // Add a custom cookie (Note: Google may ignore it unless it's valid for the domain)
        Cookie testCookie = new Cookie("test_cookie", "cookie_value");
        driver.manage().addCookie(testCookie);

        // Retrieve and print all cookies
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("All cookies:");
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + " = " + cookie.getValue());
        }

        // Delete a specific cookie
        driver.manage().deleteCookieNamed("test_cookie");

        // Delete all cookies
        driver.manage().deleteAllCookies();

        driver.quit();

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cookies_Manju();
		
		/*
		 * ChromeDriver driver= new ChromeDriver();
		 * driver.get("https://www.amazon.in/"); driver.navigate().refresh();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 * System.out.println("Get Cookies" + driver.manage().getCookies()); //add
		 * cookie Cookie c1= new Cookie("q", "shoe"); driver.manage().addCookie(c1);
		 * System.out.println("Get cookies after add " + driver.manage().getCookies());
		 * //add Particular named cookie Cookie c2= new Cookie("age","91");
		 * driver.manage().addCookie(c2);
		 * System.out.println(driver.manage().getCookies());
		 * 
		 * System.out.println("Cookies after adding particular cookie " +
		 * driver.manage().getCookies());
		 * System.out.println(driver.manage().getCookieNamed("age")); //delete all
		 * cookies driver.manage().deleteCookieNamed("age");
		 * driver.manage().deleteAllCookies();
		 */
	}
	}


