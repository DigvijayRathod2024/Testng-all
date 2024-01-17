package testNGall;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {

	static boolean dataset=true;
	
	
	// Completely skipping because enabled=false....
	@Test(enabled = false)
	public static void skiptest1()
	{
		System.out.println("skip this test completly");
	
	}

	
	

	// because we added exception so..it is also skipped 
	@Test
	public  static void skiptest2()
	{
		System.out.println("force stop");
		throw new SkipException("stop forcefully");
	}
	
	
	
	@Test
	public  static void skiptest3()
	{
		if(dataset==true)
		{
			System.out.println("passss");
		}
		else 
		{
		System.out.println("faillll");	
		throw new SkipException("case3");
		}
	}
	
}


