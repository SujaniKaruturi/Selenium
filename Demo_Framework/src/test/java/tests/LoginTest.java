package tests;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import resources.BaseClass;

public class LoginTest extends BaseClass {
	public  WebDriver driver ;
	Logger log;
	
	@DataProvider	//same test need to be executed with multiple sets of data but not from properties file
	public Object[][] inputTestData()	//passing the  more data 
	{
		Object[][] data= { {"sujaninalla11@gmail.com","Hello@123", "Success"} , {"Dummy@gmail.com", "Dummy@123","Failure"} };
		return data;
	}
	
	@BeforeMethod
	public void openApplication() throws IOException
	{
		 log = LogManager.getLogger(LoginTest.class.getName());		//to print the logs
	
		driver = initializeBrowser();
		log.debug("Browser is opened");	//logs are not getting printed -need to check where is mistake
		//else WebDriver driver = initializeBrowser();
		driver.get(prop.getProperty("URL"));	//generic
		log.debug("URL is loaded successfully");
		//driver.get("https://tutorialsninja.com/demo/");	//hardcoded
		//driver.navigate().to("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider="inputTestData")
	public void login(String email,String password,String expectedresult) throws IOException, InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.myAccountDD().click();
		log.debug("Clikced on My account dropdown");
		hp.loginOption().click();
		log.debug("Clicked on login option");
		Thread.sleep(3000);
		
		LoginPage lp=new LoginPage(driver);
		//lp.inputEmailid().sendKeys("sujaninalla11@gmail.com");	//hardcoded
		//lp.inputEmailid().sendKeys(prop.getProperty("Email"));		//data from properties file
		//lp.inputPassword().sendKeys(prop.getProperty("LoginPassword")); 	//data from properties file
		lp.inputEmailid().sendKeys(email);		
		lp.inputPassword().sendKeys(password);
		log.debug("email and password is entered");
		lp.loginButton().click();
		log.debug("login is successfull");
		
		AccountPage ap =new AccountPage(driver);
		String actualResult = null ;
		try
		{
			System.out.println("Inside try block");
			
			if(ap.accountinfo().isDisplayed())
			{
				actualResult = "Success";
				log.debug("user logged in");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Inside catch block");
			log.error("user didn't logged in");
			actualResult = "Failure";	//Even with invalid credentials also we are making the test as pass
			//Because credentials are wrong but not the flow of test.
		}
		Assert.assertEquals(actualResult, expectedresult);
		log.info("login is passed");
		//System.out.println(ap.accountinfo().isDisplayed());	//org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element
		//Assert.assertTrue(ap.accountinfo().isDisplayed());	//validation
			
	}
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
