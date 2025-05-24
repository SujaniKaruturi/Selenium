package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_58_DDT_AmazonSearch {
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//location of excel file
		FileInputStream file= new FileInputStream("D:\\Sujani\\Data_Driven_Input.xlsx"); //Location of excelsheet
		Workbook wb= WorkbookFactory.create(file);		//open excelsheet
		Sheet sheet= wb.getSheet("Login");		//moving to required Sheet in the excel
		String search_Input = sheet.getRow(4).getCell(4).getStringCellValue();  
		
		WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(search_Input);
		WebElement btn_Search = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		btn_Search.click();

		
		
	}
}
