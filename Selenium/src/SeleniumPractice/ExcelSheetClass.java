package SeleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheetClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{

		
		
		
		FileInputStream file= new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Excelsheet\\TestDataInput.xlsx"); //Location of excelsheet
		Workbook wb= WorkbookFactory.create(file);		//open excelsheet
		Sheet sheet= wb.getSheet("Login");		//moving to required Sheet in the excel
		/*
		Row row= sheet.getRow(0);				//Which Row
		Cell cell= row.getCell(0);				//Which Column
		String value = cell.getStringCellValue();//Fetching value from cell
		System.out.println(value);
		*/
		
		//writing 3 lines of code in 1 line
		String username = sheet.getRow(2).getCell(2).getStringCellValue();    //Return type should be last method(getStringCellValue) only.whihc ever method it is also.
		String password = sheet.getRow(3).getCell(2).getStringCellValue();
		//System.out.println("username is " + username);
		//System.out.println("password is " + password);
		
		//If username of amazon is mobile number then it gives exception as of now.Handled by NumberToTextConverter class.
		//String mobnum = sheet.getRow(2).getCell(4).getStringCellValue();
		String mobnum= NumberToTextConverter.toText(sheet.getRow(2).getCell(4).getNumericCellValue());
		//System.out.println("MobNumber is " + mobnum);
		 
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); 
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26hvadid%3D590652406969%26hvdev%3Dc%26hvlocphy%3D9062119%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D9980941811069679286%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_2265395%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		//driver.findElement(By.xpath("(//input)[7]")).sendKeys(username); //relative path
		driver.findElement(By.name("email")).sendKeys("sujaninalla11@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Sujani11");
		driver.findElement(By.id("signInSubmit")).click();
		driver.quit();
		
	}

}
