package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector 
{
	public static void main(String[] args) 
	{
	ChromeDriver driver= new ChromeDriver();
	driver.navigate().to("https://na.account.amazon.com/ap/signin?_encoding=UTF8&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.pape.max_auth_age=0&ie=UTF8&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=lwa&openid.assoc_handle=amzn_lwa_na&marketPlaceId=ATVPDKIKX0DER&arb=56dd81a9-0427-4e5b-b3b4-0fca1121a658&language=en_US&openid.return_to=https%3A%2F%2Fna.account.amazon.com%2Fap%2Foa%3FmarketPlaceId%3DATVPDKIKX0DER%26arb%3D56dd81a9-0427-4e5b-b3b4-0fca1121a658%26language%3Den_US&enableGlobalAccountCreation=1&metricIdentifier=amzn1.application.695f9c20d1dc4ec0aeffb5aad45bd4ce&signedMetricIdentifier=9z2wACeaxG04CNeZ0vITQX2s7Vl4BGYbEpzQhqYKTcM%3D");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("input#email")).sendKeys("sujaninalla11@gmail.com");
	driver.findElement(By.cssSelector("input.a-button-input")).click();
}
}
