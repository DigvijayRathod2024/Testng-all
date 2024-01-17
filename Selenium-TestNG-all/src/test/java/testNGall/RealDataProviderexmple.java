package testNGall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RealDataProviderexmple {


	@Test(dataProvider="create")
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
	
	
	@DataProvider(name="create")
	public Object[][] dataset22()
	{
		return new Object[][]
				{
				{"", "secret_sauce"},
				{"locked_out_user",  "secret_sauce"},
				{"problem_user","secret_sauce"},
				{"performance_glitch_user","secret_sauce"}
				
				};
				
	}



}	


	
	
	

