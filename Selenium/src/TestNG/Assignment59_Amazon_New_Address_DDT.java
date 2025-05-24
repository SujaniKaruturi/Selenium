package TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment59_Amazon_New_Address_DDT 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		Login();

	}
	
	public static void Login() throws EncryptedDocumentException, IOException, InterruptedException
	{
				//location of Excel file
				FileInputStream f1 = new FileInputStream("C:\\Users\\nandr\\eclipse-workspace\\ExcelDataSheet\\AmazonNewAddressData.xlsx");
				//Open File
				Workbook wb1 = WorkbookFactory.create(f1);
				//Get required sheet, Get Row, Get Column, Get Value
				String mobileNum = NumberToTextConverter.toText((wb1.getSheet("LoginDetails").getRow(1).getCell(0).getNumericCellValue()));
				String password = wb1.getSheet("LoginDetails").getRow(1).getCell(1).getStringCellValue();
			
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.amazon.in/");
				WebElement e1 =driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
				Actions a1 = new Actions(driver);
				a1.moveToElement(e1).perform();
				WebElement btn_SignIn1 = driver.findElement(By.linkText("Sign in"));
				btn_SignIn1.click();
				
				WebElement txt_Mobile= driver.findElement(By.xpath("//input[@name=\"email\"]"));
				txt_Mobile.sendKeys(mobileNum);
				WebElement btn_cntinue= driver.findElement(By.xpath("//input[@id=\"continue\"]"));
				btn_cntinue.click();
				WebElement txt_Pwd= driver.findElement(By.xpath("//input[@id=\"ap_password\"]"));
				txt_Pwd.sendKeys(password);
				WebElement btn_SignIn= driver.findElement(By.xpath("//input[@id='signInSubmit']"));
				btn_SignIn.click();
				
				Thread.sleep(1000);
				a1.click().perform();
				WebElement yourAddress = driver.findElement(By.xpath("(//div[@class='a-box-inner'])[4]"));
				yourAddress.click();
				WebElement addAddress = driver.findElement(By.xpath("//div[@class='a-box first-desktop-address-tile']"));
				addAddress.click();
				
				//GetData from excel
				//Get required sheet, Get Row, Get Column, Get Value
				String fullName = wb1.getSheet("AddressDetails").getRow(1).getCell(0).getStringCellValue();
				String mobileNumber = NumberToTextConverter.toText(wb1.getSheet("AddressDetails").getRow(1).getCell(1).getNumericCellValue());
				String PinCode = NumberToTextConverter.toText(wb1.getSheet("AddressDetails").getRow(1).getCell(2).getNumericCellValue());
				String flatDetails = wb1.getSheet("AddressDetails").getRow(1).getCell(3).getStringCellValue();
				String areaDetails = wb1.getSheet("AddressDetails").getRow(1).getCell(4).getStringCellValue();
				String landMark = wb1.getSheet("AddressDetails").getRow(1).getCell(5).getStringCellValue();
				String town = wb1.getSheet("AddressDetails").getRow(1).getCell(6).getStringCellValue();
				
				WebElement fName = driver.findElement(By.id("address-ui-widgets-enterAddressFullName"));
				fName.sendKeys(fullName);
				WebElement mobNum = driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber"));
				mobNum.sendKeys(mobileNumber);
				WebElement pCode = driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode"));
				pCode.sendKeys(PinCode);
				WebElement fltDetails = driver.findElement(By.id("address-ui-widgets-enterAddressLine1"));
				fltDetails.sendKeys(flatDetails);
				WebElement aDetails = driver.findElement(By.id("address-ui-widgets-enterAddressLine2"));
				aDetails.sendKeys(areaDetails);
				WebElement lMark = driver.findElement(By.id("address-ui-widgets-landmark"));
				lMark.sendKeys(landMark);
				WebElement twn = driver.findElement(By.id("address-ui-widgets-enterAddressCity"));
				twn.sendKeys(town);
				Thread.sleep(5000);
				WebElement btn_addAdress = driver.findElement(By.id("address-ui-widgets-form-submit-button-announce"));
				btn_addAdress.click();
	
	
	}

}
