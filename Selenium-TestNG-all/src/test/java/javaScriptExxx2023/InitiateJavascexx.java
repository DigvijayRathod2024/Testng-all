package javaScriptExxx2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class InitiateJavascexx {
	
	public static WebDriver driver;
	
	
	@BeforeMethod
	public void start() {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\all jars\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("https://www.tutorialsninja.com/demo/");
		
		driver.manage().window().maximize();
		
		
	}

	
	@AfterMethod
	public void end()
	{
		driver.close();
	}
}
