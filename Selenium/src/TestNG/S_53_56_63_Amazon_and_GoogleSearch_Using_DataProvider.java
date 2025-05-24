package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//53. WAP to search multiple data on google using data provider annotation 
//56. Search something on Amazon with 10 inputs with dataprovider
//63.Write a script on timeout parameter in TESTNG
public class S_53_56_63_Amazon_and_GoogleSearch_Using_DataProvider {
	
	 @DataProvider(name="Set1") 
	 public Object[][] inputData() 
	 { 
		 return new Object[][] {{"India"},{"Shrilanka"},{"USA"},{"Africa"} }; 
	 }
	 
	  @Test(dataProvider="Set1") 
	  public void googleSearch(String input) 
	  {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com"); 
	  driver.manage().window().maximize();
	  driver.findElement(By.name("q")).sendKeys(input);
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER); 
	  }
	  
	  @Test(timeOut = 200) //learn more about it 
	  public void googleLaunch() 
	  {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com"); 
	  }
	 
	@DataProvider(name="input1")
	public Object[][] inputData2()
	{
		Object[][] amazon_Search = new Object[3][1];
		amazon_Search[0][0]="today's weather";
		amazon_Search[1][0]="today's quote";
		amazon_Search[2][0]="today's ipl score";
		return amazon_Search;
		
	}
	
	@Test(dataProvider="input1")
	public void amazon_Search(String input1)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		WebElement txtBox_search = driver.findElement(By.xpath("//input[@name='field-keywords']"));
		txtBox_search.sendKeys(input1);
	}
	
}
