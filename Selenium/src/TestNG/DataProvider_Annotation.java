package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Annotation {

	@DataProvider(name="data1")
	public Object testData1()
	{	/*
		Object[][] d = new Object[8][1];
		d[0][0]="shoe";
		d[1][0]="laptop";
		d[2][0]="tshirt";
		d[3][0]="pen";
		d[4][0]="glass";
		d[5][0]="charger";
		d[6][0]="keys";
		d[7][0]="frock";
		return d;
		*/
		return new Object[][] {{"Ram"}, {"Sujani"}, {"Krishna"}};
	}
	@DataProvider(name="data2")
	public Object  testData2()
	{
		return new Object[][] {{90}, {46} };
	}
	@DataProvider(name="data3")
	public Object testData3()
	{	
		Object[][] d = new Object[3][2];
		
		d[0][0]="sujani@gmail.com";
		d[0][1]="tshirt";
		d[1][0]="sujani11@gmail.com";
		d[1][1]="glass";
		d[2][0]="sujani12@gmail.com";
		d[2][1]="keys";
		
		return new Object[][] { {"sujani@gmail.com","tshirt"}, {"sujani11@gmail.com","glass"}};
		//return d;
	}
	@Test(dataProvider = "data1")
	public void multipleInputsToSearch(String data)
	{	/*
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys(data + Keys.ENTER);
		*/
		Reporter.log(data.concat("good human"));
		System.out.println(data.concat(" is a good human"));	
	}
	@Test(dataProvider= "data3")
	public void login(String username,String password)
	{
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);    //send input data to text box via sendkeys method
		driver.findElement(By.id("pass")).sendKeys(password); 
		driver.findElement(By.name("login")).click();
	}
	@Test(dataProvider = "data2")
	public void intDataProviderInputs(int a)
	{
		int sum =a+100;
		Reporter.log("Sum value " + sum);
		System.out.println("Suma value is " + sum);
	}
}
