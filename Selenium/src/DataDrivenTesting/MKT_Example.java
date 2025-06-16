package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MKT_Example {
	WebDriver driver;

	@Test(dataProvider="data1")
	public void testdata(String fn, String sn, String mn_emai, String pass) throws EncryptedDocumentException, IOException
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.findElement(By.cssSelector("[name='firstname']")).sendKeys(fn);
		driver.findElement(By.cssSelector("[name='lastname']")).sendKeys(sn);
		driver.findElement(By.cssSelector("[name='reg_email__']")).sendKeys(mn_emai);
		driver.findElement(By.cssSelector("[name='reg_passwd__']")).sendKeys(pass);
		driver.quit(); // Close browser after each test
	}

	@DataProvider(name="data1")
	public Object[][] testdata1() throws IOException
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\malag\\eclipse-workspace\\Reports\\Excel Files\\TestData.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		Sheet s1 = w1.getSheet("data");

		int rowcount = s1.getPhysicalNumberOfRows();
		
		Object[][] data = new Object[3][4]; // explicitly reading 3 rows of data (excluding header)

		for(int i = 1; i < rowcount-1; i++) // Assuming first row is header, and we want 3 records
		{
			Row row = s1.getRow(i);
			data[i - 1][0] = row.getCell(0).getStringCellValue(); // fn
			data[i - 1][1] = row.getCell(1).getStringCellValue(); // sn
			data[i - 1][2] = NumberToTextConverter.toText(row.getCell(2).getNumericCellValue()); // email/mobile
			data[i - 1][3] = row.getCell(3).getStringCellValue(); // password
			
			System.out.println(row);
			//System.out.println(row.getCell(i));
		}

		w1.close();
		f1.close();
		return data;
	
}
}
