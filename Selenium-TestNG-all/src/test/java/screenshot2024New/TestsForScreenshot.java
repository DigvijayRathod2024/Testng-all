package screenshot2024New;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testNGall.CustomListerner;



@Listeners(CustomLister2024.class)
public class TestsForScreenshot extends BaseClassforSS {

	@BeforeMethod
	public void setUp() {
		init();

	}

	@AfterMethod
	public void closed() {
		driver.close();
	}

	
	
	@Test
	public void Test1()
	{
		
		Assert.assertEquals(false, true);
	}
	
	
	
	@Test
	public void Test2()
	{
		
		Assert.assertEquals(false, true);
	}
	
	
	
	
	@Test
	public void Test3()
	{
		
		Assert.assertEquals(false, true);
	}
}
