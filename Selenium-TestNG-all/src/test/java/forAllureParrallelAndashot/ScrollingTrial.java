package forAllureParrallelAndashot;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollingTrial {

	@Test
	public void scrolingInJsExcecutor() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\all jars\\chromedriver.exe");

		ChromeDriver dd = new ChromeDriver();

		dd.get("https://www.opencart.com/index.php?route=cms/feature");

		JavascriptExecutor js = (JavascriptExecutor) dd;

		js.executeScript("window.scrollBy(0,3000)", "");

		Thread.sleep(2000);

		String title = js.executeScript("return document.title;").toString();

		System.out.println(title);

		dd.close();

	}

}
