package groTechMinds;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {
	
 public static void NormalfileUpload()
 {
	 	ChromeDriver driver =new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/registration/");
		driver.manage().window().maximize(); 
		driver.findElement(By.id("file")).sendKeys("C:\\Users\\DELL\\Downloads\\MKT_Sample_PDF_for fileupload selenium.pdf");
		
 }
 public static void RobotFileUpload() throws AWTException
 {
	 ChromeDriver driver =new ChromeDriver();
	 driver.navigate().to("https://grotechminds.com/registeration-form/");
	 driver.manage().window().maximize();
	 WebElement fileupload=driver.findElement(By.name("profile-upload"));
	 
	// Use Actions class to move to the "Choose File" button and click on it
     Actions act = new Actions(driver);
     act.moveToElement(fileupload).click().perform();

     // Initialize the Robot class (used for simulating keyboard and mouse actions)
     Robot rb = new Robot();
     rb.delay(2000);  // Wait for 2 seconds to ensure the file dialog is open

     // Copy the file path to the clipboard
     StringSelection ss = new StringSelection("Downloads\\TestData_ORiginal.xlsx");//path which you want to upload the file 
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

     // Simulate pressing CTRL + V to paste the copied file path
     rb.keyPress(KeyEvent.VK_CONTROL);
     rb.keyPress(KeyEvent.VK_V);
     rb.keyRelease(KeyEvent.VK_CONTROL);
     rb.keyRelease(KeyEvent.VK_V);
     
  // Simulate pressing ENTER to confirm the file selections
     rb.keyPress(KeyEvent.VK_ENTER);
     rb.keyRelease(KeyEvent.VK_ENTER);

     // Print a message to the console indicating that the file has been uploaded
     System.out.println("File Uploaded");

     //driver.quit();
 
}
	 
 
	public static void main(String[] args) throws AWTException 
	{
		RobotFileUpload();
		//Check using Robot class ,how to upload file?
	}

}
