package groTechMinds;

import java.time.Duration;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("Get Cookies" + driver.manage().getCookies());
		//add cookie
		Cookie c1= new Cookie("q", "shoe");
		driver.manage().addCookie(c1);
		System.out.println("Get cookies after add " + driver.manage().getCookies());
		//add Particular named cookie
		Cookie c2= new Cookie("age","91");
		driver.manage().addCookie(c2);
		System.out.println(driver.manage().getCookies());
		
		System.out.println("Cookies after adding particular cookie " + driver.manage().getCookies());
		System.out.println(driver.manage().getCookieNamed("age"));
		//delete all cookies
		driver.manage().deleteCookieNamed("age");
		driver.manage().deleteAllCookies();
	}
	}


