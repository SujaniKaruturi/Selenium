package TestNG;


import java.io.IOException;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class DynamicTestdata {
	WebDriver driver;
	String fn;
	String sn;
	String mn_emai;
	String pass;
	@Test(invocationCount=2)
	public void testdata() throws EncryptedDocumentException, IOException, InterruptedException
	{
		fn=RandomStringUtils.randomAlphabetic(10);
		sn=RandomStringUtils.randomAlphabetic(10);
		mn_emai=RandomStringUtils.randomAlphabetic(10)+"@gmail.com";
		pass=RandomStringUtils.randomAlphabetic(5)+"@"+RandomStringUtils.randomNumeric(5);
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("[name='firstname']")).sendKeys(fn);
		driver.findElement(By.cssSelector("[name='lastname']")).sendKeys(sn);
		
		Thread.sleep(2000);
		WebElement day=driver.findElement(By.cssSelector("#day"));
		Select s1=new Select(day);
		s1.selectByValue("12");
		WebElement month=driver.findElement(By.cssSelector("#month"));
		Select s2=new Select(month);
		s2.selectByVisibleText("Mar");
		WebElement year=driver.findElement(By.cssSelector("#year"));
		Select s3=new Select(year);
		s3.selectByValue("1995");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		
		driver.findElement(By.cssSelector("[name='reg_email__']")).sendKeys(mn_emai);
		driver.findElement(By.cssSelector("[name='reg_passwd__']")).sendKeys(pass);
		driver.findElement(By.cssSelector("[name='websubmit']")).click();
		Thread.sleep(2000);
		//driver.close();
		}		

}
