package TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//check data driven testing from Selenium Package
public class S_57_DataDrivenTesting_AmazonLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException   
	{
				//location of excel file
				FileInputStream file= new FileInputStream("D:\\Sujani\\Data_Driven_Input.xlsx"); //Location of excelsheet
				Workbook wb= WorkbookFactory.create(file);		//open excelsheet
				Sheet sheet= wb.getSheet("Login");		//moving to required Sheet in the excel
				String username = sheet.getRow(2).getCell(2).getStringCellValue();    //Return type should be last method(getStringCellValue) only.whihc ever method it is also.
				String password = sheet.getRow(3).getCell(2).getStringCellValue();
				Object mobnum = NumberToTextConverter.toText(sheet.getRow(2).getCell(4).getNumericCellValue());
				//annother way of assigning
				String username2 = wb.getSheet("Login").getRow(2).getCell(2).getStringCellValue(); 
				System.out.println("username is " + username);
				System.out.println("password is " + password);
				System.out.println("MobNumber is " + mobnum);
				
				ChromeDriver driver =new ChromeDriver(); 
				driver.manage().window().maximize(); 
				driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26hvadid%3D590652406969%26hvdev%3Dc%26hvlocphy%3D9062119%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D9980941811069679286%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_2265395%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
				//driver.findElement(By.xpath("(//input)[7]")).sendKeys("Sujaninalla11@gmail.com"); //relative path
				driver.findElement(By.id("ap_email")).sendKeys(username);
				driver.findElement(By.id("continue")).click();
				driver.findElement(By.id("ap_password")).sendKeys(password);
				driver.findElement(By.id("signInSubmit")).click();
				
				
	}
}

