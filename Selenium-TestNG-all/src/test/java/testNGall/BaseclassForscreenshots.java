package testNGall;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseclassForscreenshots {


	public static WebDriver driver;
	
	public static void initiate()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\all jars\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
	
	}
	
	
	public void failedTestCase(String testMethodName)
	
	{
			File SourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
			try {
				FileUtils.copyFile(SourceFile, new File("D:\\eclipse wrkbnch\\Selenium_MyProject1\\screeshots\\" + testMethodName + ".png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			

			
	}
	
	
	
	}


