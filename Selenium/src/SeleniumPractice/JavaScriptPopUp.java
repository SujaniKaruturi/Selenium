package SeleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeDriver j =new ChromeDriver();
		j.get("file:///C:/Users/DELL/Downloads/MKT%20HTML%20Page.html");   //opens MKT HTML page and appears javascript pop-up

		//j.manage().window().maximize();  then next step is 
		//j.switchTo().alert().accept(); gives error org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : This is alert box!}
		//because without accepting pop-up ,we cannot maximise the screen.
		Thread.sleep(1000);
		j.switchTo().alert().accept();
		j.manage().window().maximize(); //works because above step is accepting pop-up. after pop-up acceptance only we can maximise screen.
		j.close();
		
	}

}
