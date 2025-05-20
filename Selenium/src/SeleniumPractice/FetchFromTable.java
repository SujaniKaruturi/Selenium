package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchFromTable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/difference-between-byte-short-int-and-long-datatype-in-java/");
		driver.manage().window().maximize();
		WebElement table= driver.findElement(By.xpath("(//table)[2]"));
		//System.out.println(table.getText());    //fetching an entire table
		List<WebElement> columns = driver.findElements(By.xpath("(//thead)[2]//tr//th"));
		int colcount= columns.size();
		System.out.println("Columns count" + colcount );
		List<WebElement> rows = driver.findElements(By.xpath("(//figure[@class='table'])[2]//table//tbody//tr"));
		int rowcount= rows.size();
		System.out.println("Rows count" + rowcount );
		WebElement onecell = driver.findElement(By.xpath("(((//figure[@class='table'])[2]//table//tbody//tr)[4]//td)[5]"));
		System.out.println(onecell.getText());       //getting text from one cell of table
		
		
		
		

	}

}
