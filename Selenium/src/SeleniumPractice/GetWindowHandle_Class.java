package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle_Class {

	public static void main(String[] args) throws InterruptedException
	{

		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMI7NLImt3LhwMVA4y5BR2BdiJDEAAYASAAEgLtiPD_BwE&gclsrc=aw.ds");
		
		String parentid= driver.getWindowHandle();           //Return type is string, it accepts alphanumeric value
		System.out.println("getWindowHandle "+parentid);
		
		driver.findElement(By.xpath("//span[.='Google']")).click();
		
		Set<String> parentandchild = driver.getWindowHandles();   // Set<String> ,set is interface. It will accept all string values inside particular Set
		System.out.println("getWindowHandles " +parentandchild);
		
		driver.close();    //Here the sign in browser will not get closed as control is in parent browser. so we need to move control from parent to child browser.
		//close(): which browser is having control that browser gets closed.Here it is parent.
		
		Iterator<String> i=parentandchild.iterator(); //Iterator() is method to get parent and child id separately. Return type is String.(Iterator is Interface in collections )
				String parentid1 = i.next();		//first next method of iterator of string will always gives parent id.
				String Childid1 =  i.next();		//second next method of iterator of string will always gives child id.
				System.out.println(parentid1);
				System.out.println(Childid1);
				
		driver.switchTo().window(Childid1);	//want to move control from parent to child to login by entering details.
		
		driver.findElement(By.id("identifierId")).sendKeys("sujaninalla11@gmail.com"); 
		//we cannot automate google sign in page as server will reject it.
		//google have blocked the sign in page automation,Google Authentication API cannot be automated.
		driver.findElement(By.xpath("//span[.='Next']")).click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
