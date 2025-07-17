package groTechMinds;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		WebElement all= driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
		Select s =new Select(all);
		s.selectByIndex(10);
		s.selectByValue("search-alias=alexa-skills");
		s.selectByVisibleText("Amazon Pharmacy");
		all.sendKeys(Keys.ENTER);
		
		//Selecting dynamic Dropdown value using getOptions() method
		List<WebElement> options = s.getOptions();
		int count= options.size();
		s.selectByIndex(count-1);
		
		for(WebElement k:options)
		{
			String text = k.getText();
			System.out.println("All options are " + text);
			if(text.equalsIgnoreCase("Gift Cards"))
			{
				k.click();
				break;
			}
		}
		
		//Selecting dynamic Dropdown value using Auto-suggestion xpath
		List<WebElement> autosuggestion= driver.findElements(By.xpath("//select[@aria-describedby='searchDropdownDescription']//option"));
		for(int i=0;i<autosuggestion.size();i++)
		{
			WebElement eachoption = autosuggestion.get(i);
			String textvalue = eachoption.getText();
			System.out.println("No of options in dropdown using auto suggestion " +textvalue );
			if(textvalue.equalsIgnoreCase("Video Games"))
			{
				eachoption.click();
				break;
			}
		}
	}

}
