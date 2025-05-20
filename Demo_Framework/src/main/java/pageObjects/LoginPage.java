package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(id="input-email")  private WebElement emailAddress;
	@FindBy(id= "input-password") private WebElement password;
	@FindBy(css="input[value='Login']") private WebElement loginButton;
	
	public WebElement inputEmailid()
	{
		return emailAddress;
	}
	public WebElement inputPassword()
	{
		return password;
	}
	public WebElement loginButton()
	{
		return loginButton;
	}
	
	public LoginPage(WebDriver driver)	//constructor recieves driver from outside as input
	{
		this.driver= driver;
		PageFactory.initElements(driver, this );
	}
}
