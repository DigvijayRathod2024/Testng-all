package forAllureParrallelAndashot;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassForAllureParrelleTestandashot {


	@Test
	public void runParralelDemo()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\all jars\\chromedriver.exe");

	ChromeDriver dd = new ChromeDriver();

	dd.get("https://www.opencart.com/index.php?route=cms/feature");
	
	dd.findElement(By.xpath("//a[text()='Blog']")).click();
	
	dd.close();
		
	}

	
	
}
