package SeleniumPractice;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchaBrowser {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);   //sleep for 1 second
		//String s= c.getTitle(); //return type is String
		System.out.print(c.getTitle());
		System.out.print(c.getWindowHandle());
		System.out.print(c.getWindowHandles()); //output of getWindowHandle,getWindowHandles is sme where there is no child browser open.
		c.close();
		//c.quit();    //Close the entire browser.(closes all the tabs opened in entire browser) 
		
	}

}
