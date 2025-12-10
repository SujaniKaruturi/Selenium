package groTechMinds;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_Usage{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		//Maximizes the browser window on startup,Used to avoid issues with elements not visible or responsive design issues.
		options.addArguments("--start-maximized");	
		//Runs Chrome without GUI (background mode),Used for CI/CD pipelines or server environments without a display.
		options.addArguments("--headless");	
		//Disables browser notifications,Used to prevent pop-ups from interrupting automated tests.
		options.addArguments("--disable-notifications");	
		//Launch Chrome without extensions,Avoids unexpected behavior due to browser extensions.
		options.addArguments("--disable-extensions");	
		//Ignore invalid SSL certificate warnings,Useful for testing HTTPS sites with self-signed or expired certificates.
		options.setAcceptInsecureCerts(true);	
		//Opens Chrome in incognito/private mode,Useful for testing without cache, cookies, or session data.
		options.addArguments("--incognito");	
		
		//Set Chrome to download files to a specific location,Used for file download automation.
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("download.default_directory", "C:\\Downloads");
		options.setExperimentalOption("prefs", prefs);
		

	}

}
