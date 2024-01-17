package javaScriptExxx2023;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClickObnButton  {
	
	

	
	
	@Test
	public void click()
	{
		
		
System.setProperty("webdriver.chrome.driver", "D:\\all jars\\chromedriver.exe");
		
	 ChromeDriver	driver= new ChromeDriver();
		
		driver.get("https://www.tutorialsninja.com/demo/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('//*[@id=\"menu\"]/div[2]/ul/li[7]/a').click();");

		driver.close();
		
		
		
	}

}
