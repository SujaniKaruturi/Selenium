package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	@FindBy(xpath="//a[@title='My Account']") private WebElement myAccount;
	@FindBy(linkText= "Login") private WebElement login;
	
	public WebElement myAccountDD()
	{
		return myAccount;
	}
	public WebElement loginOption()
	{
		return login;
	}
	
	public HomePage(WebDriver driver)	//constructor recieves driver from outside as input
	{
		this.driver= driver;
		PageFactory.initElements(driver, this );
	}
}
