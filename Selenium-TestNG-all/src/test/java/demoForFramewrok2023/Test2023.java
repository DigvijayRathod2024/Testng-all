package demoForFramewrok2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2023 {

	WebDriver driver;
	
	
	
	@Test
	public void test222() {
	
	System.setProperty("webdriver.chrome.driver", "D:\\all jars\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	
	driver.manage().window().maximize();
		
	driver.close();
	
	}
}
