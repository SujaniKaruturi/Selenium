package TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataProviderValues_From_Excel {

		@DataProvider(name="data1")
		public Object[][] card_details()
		{
			Object [][] file=new Object[1][4];
			return file;
	}	
			@Test(dataProvider="data1")
		public void login_in_amazon(String cn,String ed,String cvv,String amount) throws EncryptedDocumentException, IOException
			{	
				
				
				FileInputStream f1=new FileInputStream("D:\\Sujani\\input_DataProvider_From_Excel.xlsx");
				Workbook w1=WorkbookFactory.create(f1);
				Sheet s1 = w1.getSheet("card_details");
				for(int i=0,j=0;i<=2;i++)
				{
					String cn1=NumberToTextConverter.toText(w1.getSheet("card_details").getRow(i).getCell(j).getNumericCellValue());
					j++;
					String ed1=NumberToTextConverter.toText(w1.getSheet("card_details").getRow(i).getCell(j).getNumericCellValue());
					j++;
					String cvv1=NumberToTextConverter.toText(w1.getSheet("card_details").getRow(i).getCell(j).getNumericCellValue());
					j++;
					String amt1=NumberToTextConverter.toText(w1.getSheet("card_details").getRow(i).getCell(j).getNumericCellValue());
					j=0;
			
//				System.out.println(cn1);
//				System.out.println(ed1);
//				System.out.println(cvv1);
//				System.out.println(amt1);
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://grotechminds.com/payments/");
			String title1=driver.getTitle();
			System.out.println(title1);
			String url1=driver.getCurrentUrl();
			System.out.println(url1);
			WebElement card_number= driver.findElement(By.id("cardNumber"));
			card_number.sendKeys(cn1);
			WebElement exp_date= driver.findElement(By.id("expiryDate"));
			exp_date.sendKeys(ed1);
			WebElement cvv_no=driver.findElement(By.id("cvv"));
			cvv_no.sendKeys(cvv1);
			WebElement amount_rs=driver.findElement(By.id("amount"));
			amount_rs.sendKeys(amt1);
			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
			String title2=driver.getTitle(); //title after submitting card details
			System.out.println(title2);
			String url2=driver.getCurrentUrl();
			System.out.println(url2);
			/*
			 * Assert.assertNotEquals(title1, title2); //Assert.assertEquals(title1,
			 * title2); Assert.assertNotEquals(url1, url2); //Assert.assertEquals(url1,
			 * url2); //Assert.assertEquals(driver.getCurrentUrl().equals(url1), true);
			 * Assert.assertEquals(driver.getCurrentUrl().equals(url1), false);
			 */
			}
			}}

