package screenshot2024New;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassforSS {

	public static WebDriver driver;

	public static void init() {

		System.setProperty("webdriver.chrome.driver", "D:\\all jars\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/v1/");

		driver.manage().window().maximize();

	}

	public void failedTestCase(String testname) {

		File Sourcefile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(Sourcefile, new File ( "D:\\eclipse wrkbnch\\Selenium_MyProject1\\Screenshots2024\\" + testname + ".png"));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
	}

}
