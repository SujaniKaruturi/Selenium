package SystemTesting_AmazonScenarios;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class ExcelFetching 
{
	String username;
	String password;
	String mobnum;
	@BeforeMethod
	public void credentials() throws EncryptedDocumentException, IOException
	{
	FileInputStream file= new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Excelsheet\\TestDataInput.xlsx"); //Location of excelsheet
	Workbook wb= WorkbookFactory.create(file);		//open excelsheet
	Sheet sheet= wb.getSheet("Login");				//moving to required Sheet in the excel
	username = sheet.getRow(2).getCell(2).getStringCellValue();    //Return type should be last method(getStringCellValue) only.whihc ever method it is also.
	password = sheet.getRow(3).getCell(2).getStringCellValue();
	mobnum= NumberToTextConverter.toText(sheet.getRow(2).getCell(4).getNumericCellValue());
	System.out.println("username is " + username);
	System.out.println("password is " + password);
	System.out.println("MobNumber of sujani is " + mobnum);
	 
	}
	
	
}
