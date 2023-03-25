package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class AppUtils {
	
	public static WebDriver driver;
	final static String url= "http://orangehrm.qedgetech.com";
	
	@BeforeSuite
	public static void launchApp()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
	}
	
	@AfterSuite
	public static void closeApp()
	{
		driver.close();
	}


}
