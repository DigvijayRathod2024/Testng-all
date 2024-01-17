package remainingTestNGRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RealDataProviderexmple {

	
	
	@Test(dataProvider = "create", dataProviderClass = DataProviderMoveDemo.class)
	public void test(String username, String password)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\all JARS\\chromedriver.exe");

		WebDriver dd = new ChromeDriver();
		
		dd.get("https://www.saucedemo.com/");
		
		dd.findElement(By.name("user-name")).sendKeys(username);
		dd.findElement(By.name("password")).sendKeys(password);
		dd.findElement(By.id("login-button")).click();
		dd.close();
	}
	

}	
	
	
	

