package groTechMinds;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amezon.in");
		
		TakesScreenshot ts=driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("D:\\Sujani\\Screenshots practice\\Screenshot_" + Math.random() + ".png" );
		FileHandler.copy(source, dest);
		// FileUtils.copyFile(source, dest); //this method also works 

		 
		
		// image name - using className. i.e. method - "new ClassName().getClass()"
		File dest2 = new File("D:\\Sujani\\Screenshots practice\\Screenshot_"+new Screenshot().getClass() +".png");
		FileHandler.copy(source, dest2);
	
		LocalDate currentDate = LocalDate.now(); 
        System.out.println("Current date: " + currentDate); 
  
        // Current time 
        LocalTime currentTime = LocalTime.now(); 
        System.out.println("Current time: " + currentTime); 
  
        // Current date and time 
        LocalDateTime currentDateTime = LocalDateTime.now(); 
        System.out.println("Current date and time: "+ currentDateTime); 
		
        System.out.println("time is "+ new SimpleDateFormat("dd-MM-yy ss:mm:HH").format(new Date()));
        //Screenshot with time is failed need to check again
		File dest4 = new File("D:\\Sujani\\Screenshots practice\\Screenshot_"+new SimpleDateFormat("dd-MM-yy ss:mm:HH").format(new Date())+".png");
		FileHandler.copy(source, dest4);
		
		try
		{
			File dest3 =new File("D:\\Sujani\\Screenshots practice\\Screenshot_" + Math.random() + ".png" );
			FileHandler.copy(source, dest3);
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex+" <- Exception occured");
			//java.io.FileNotFoundException: D:\S_Selenium\Projects\Screenshot_Practice\img\Scrennshot_0.5391742009030213.png (The system cannot find the path specified) <- Exception occured
		}
	}

}
