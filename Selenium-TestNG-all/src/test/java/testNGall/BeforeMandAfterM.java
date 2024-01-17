package testNGall;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



/* before test....
 * before method....
 * (whatever method, bcoz this is test) actual test.......
 * after method...
 * after test...
 * 
 * 
 */

@Test
public class BeforeMandAfterM {


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
		
		
		@BeforeMethod
		public void connectdb()
		
		{
			System.out.println("conncetion onnnnn");
		}
		
		
		@AfterMethod
		public void disconnectdb()
		
		{
			System.out.println("conncetion offfff");
		}
		
		
		
		@Test(priority = 2)
		public void atest()
		{
			System.out.println("first test ");
		}
		
		
		
		@Test(priority = 1)
		public void btest()
		{
			System.out.println("second test");
		}
		
	
	}	
	
	


