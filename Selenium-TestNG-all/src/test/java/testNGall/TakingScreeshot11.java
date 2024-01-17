package testNGall;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

// very important this @listnerrrrrrrrr
@Listeners(CustomListerner.class)
public class TakingScreeshot11 extends BaseclassForscreenshots {

	@BeforeMethod
	public void steUp()
	{
		initiate();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void takeScreenShotTest1()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void takeScreenShotTest2()
	{
		Assert.assertEquals(false, true);
		
	
	}
	
	
	
	@Test
	public void takeScreenShotTest3()
	{
		Assert.assertEquals(false, true);
		
	
	}
	
	
	
}
