package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
//65. WAP to login amazon,search for product and logout and verify whether test is pass or fail
public class S_65_Assertion_Amazon_login_logout {
	@Test
	public void amazonSearch() throws InterruptedException
	{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement e1 =driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	Actions a1 = new Actions(driver);
	a1.moveToElement(e1).perform();
	WebElement btn_SignIn1 = driver.findElement(By.linkText("Sign in"));
	btn_SignIn1.click();
	// Enter UserName/Mobile Number
	WebElement txt_Mobile= driver.findElement(By.xpath("//input[@name=\"email\"]"));
	txt_Mobile.sendKeys("9494913532");
	WebElement btn_cntinue= driver.findElement(By.xpath("//input[@id=\"continue\"]"));
	btn_cntinue.click();
	// Enter password
	WebElement txt_Pwd= driver.findElement(By.xpath("//input[@id=\"ap_password\"]"));
	txt_Pwd.sendKeys("Tejasrii722");
	WebElement btn_SignIn= driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	btn_SignIn.click();
	// search shoe
	WebElement txtBox_search = driver.findElement(By.id("twotabsearchtextbox"));
	txtBox_search.sendKeys("Shoes"+Keys.ENTER);
	Thread.sleep(2000);
	// HoverOver accounts
	WebElement e2 =driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	Actions a2 = new Actions(driver);
	a2.moveToElement(e2).perform();
	//click on Signout option
	WebElement optn_SignOut = driver.findElement(By.xpath("(//a[.='Sign Out'])[1]"));
	optn_SignOut.click();
	WebElement txt_Mobile_logOut= driver.findElement(By.xpath("//input[@name=\"email\"]"));
	// assertion pass if MobileNumber text box displayed
	Assert.assertEquals((txt_Mobile_logOut.isDisplayed()), true, "Test-Failed : Not Logged out");
	
}
}

