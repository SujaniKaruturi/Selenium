package groTechMinds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_PageFactory_Diff { //Page class in object repository
	WebDriver driver;
	
	//POM Design Pattern
	By Username = By.name("id");
	By Password= By.className("bareno");
	public POM_PageFactory_Diff_POM_Constructor(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setUsername_POM(String usrname)
	{
		//finding webelement and then performing operation on webelement
		driver.findElement(Username).sendKeys("Hello");
	}
	
	
	//Pagefactory Design Pattern
	
	//WebElements are identified by @FindBy Annotation
		@FindBy(xpath= "") WebElement Username_1;
	
	public POM_PageFactory_Diff_PageFactory_Constructor(WebDriver drvier)
	{
		this.driver=driver;
		//this initElements method will create all Webelements
		//static initElements method of pagefactory class for intializing webelement
		PageFactory.initElements(driver,this);	
	}
	public void setUsername_PageFactory(String usrname)
	{
		//finding webelement and then performing operation on webelement
		Username_1.sendKeys("Hello");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	

}
