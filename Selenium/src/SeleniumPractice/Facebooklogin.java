package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) throws InterruptedException 
	{
		/*
		ChromeDriver h =new ChromeDriver();
		h.get("https://www.facebook.com/");
		h.findElement(By.id("email")).sendKeys("sujaninalla11@gmail.com");    //send input data to text box via sendkeys method
		h.findElement(By.id("pass")).sendKeys("12345678"); 
		h.findElement(By.name("login")).click();
		h.quit();
		*/
		
		/*
		ChromeDriver b =new ChromeDriver();
		b.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26hvadid%3D590652406969%26hvdev%3Dc%26hvlocphy%3D9062119%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D9980941811069679286%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_2265395%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		b.findElement(By.xpath("(//input)[7]")).sendKeys("sujaninalla11@gmail.com");   //relative xpath
		//b.findElement(By.id("ap_email")).sendKeys("sujaninalla11@gmail.com");
		b.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		b.findElement(By.id("ap_password")).sendKeys("12345678");
		b.findElement(By.id("signInSubmit")).click();
		Thread.sleep(3000);
		b.close();
		*/
		
		
		ChromeDriver j =new ChromeDriver();
		j.get("https://www.amazon.in/");
		j.manage().window().maximize();   //maximize the chrome screen
		//j.findElement(By.linkText("Mobiles")).click();   //linktext for Gmail on google chrome is "Gmail"
		j.findElement(By.xpath("(//a[@class='nav-a  '])[6]")).click();   //xpath
		Thread.sleep(3000);
		//j.findElement(By.linkText("Customer Service")).click();  
		j.findElement(By.partialLinkText("Customer")).click();  
		
		
		
	
		
		
		
	}

}
