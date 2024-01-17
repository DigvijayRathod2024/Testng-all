package testNGall;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest1 {

	@Test
	public void titletest()
	{
		
		SoftAssert asst = new SoftAssert();
		
		String testT = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\all JARS\\chromedriver.exe");

		WebDriver dd = new ChromeDriver();
		
		dd.get("https://www.ebay.com/");
		
		
		dd.manage().window().maximize();
		
		String resultT = dd.getTitle();
		
		
		asst.assertEquals(testT, resultT);
		

		dd.close();
		
		
		
		
		
		
		
	}
				
}


