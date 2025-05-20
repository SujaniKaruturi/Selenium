package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class BaseClass {

	public WebDriver driver;
	public Properties prop;	//making it as global and public so we can access from anywhere

	public String takeScreenshot(String testName,WebDriver driver) throws IOException {
		
		File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destinationFilePath = System.getProperty("user.dir")+"\\screenshots\\"+testName+".png";
		FileUtils.copyFile(SourceFile,new File(destinationFilePath));
		return destinationFilePath;
	
	}
	public WebDriver initializeBrowser() throws IOException {

		prop = new Properties();
		String propertiesPath = System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties";
		// user.dir indicates the path in c or D drive where project is created-D:\S_Selenium\Projects\Demo_Framework
		// As we should not use hard code browser value while doing automation
		FileInputStream fis = new FileInputStream(propertiesPath);
		prop.load(fis); // loads the properties file

		// String browserName1 = "chrome"; //hardcoded ,so properties file is created which retrieves browser name

		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup(); //use a WebDriverManager to automatically handle the driver setup
			//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // hardcoded Path to chromedriver
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");	//Generic path of chromedriver.
			driver = new ChromeDriver();
			System.out.println("Driver value when declared" + driver);

		} else if (browserName.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("ie")) {

			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		return driver;
	}

}
