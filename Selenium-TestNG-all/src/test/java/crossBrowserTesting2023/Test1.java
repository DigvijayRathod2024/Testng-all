package crossBrowserTesting2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Test1 {
	
	WebDriver driver;
	
	@BeforeMethod
	@Parameters("browsers")
	public void init(String browser)
	{
		switch (browser.toLowerCase())
		
		{
		
		case "chrome":
		
		System.setProperty("webdriver.chrome.driver", "D:\\all jars\\chromedriver.exe");
		driver = new ChromeDriver();
		break;
		
		
		case "firefox":
		System.setProperty("webdriver.chrome.driver", "D:\\all jars\\chromedriver.exe");
		driver = new ChromeDriver();
		break;	
		
		
		case "ie":
		System.setProperty("webdriver.chrome.driver", "D:\\all jars\\chromedriver.exe");
		driver = new ChromeDriver();
		break;	
			
		
		default:
		driver =null;
		break;
		
		}
	}

	@Test
	public void test2023New() {
		
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.close();
		
	}
}
