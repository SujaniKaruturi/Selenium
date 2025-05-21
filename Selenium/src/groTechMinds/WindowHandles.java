package groTechMinds;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/window-handle-and-handles/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String parentid= driver.getWindowHandle();           //Return type is string, it accepts alphanumeric value
		System.out.println("getWindowHandle "+parentid);
		
		WebElement dc=driver.findElement(By.xpath("(//button[text()='Launch Broweser 1'])[1]"));
		dc.click();
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
	}

}
