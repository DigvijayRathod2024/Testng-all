package remainingTestNGRevision;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportsTestss {
	
	@Test
	public void test1()
	{
		
		System.out.println("tets1111");
	}
	
	
	@Test
	public void tets2()
	{
		System.out.println("test22222");
	}
	
	
	@Test
	public void tets3()
	{
		Reporter.log("thirds class");
		System.out.println("test3333");
	}
}
