package testNGall;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


@Test
public class BeforeMandAfterdepe {


		@BeforeTest
		public void loginTest1()
		{
			System.out.println("log in test");
		}
		
		@AfterTest
		public void endtest()
		{
			System.out.println("end the test");
		}
		
		@Test
		public void connectdb()
		
		{
			System.out.println("conncetion onnnnn");
			Assert.assertTrue(false);
		}
		
		@Test
		public void disconnectdb()
		
		{
			System.out.println("conncetion offfff");
		}
		
		@Test(dependsOnMethods = "connectdb", alwaysRun = true)
		public void atest()
		{
			System.out.println("first test ");
		}
		
		@Test
		public void btest()
		{
			System.out.println("second test");
		}
		
	
	}	
	
	


