package testNGall;

import org.testng.annotations.Test;


@Test
public class GroupDemo {

	@Test(groups = "regression")
	public void atest()
	{
		System.out.println("first test ");
	}
	
	
	
	
	@Test(groups = "regression")
	public void btest()
	{
		System.out.println("second test");
	}
	
	
	
	@Test (groups={"regression", "bvt"})
	public void ctest()
	{
		System.out.println("third test ");
	}
	
	
	
	@Test (groups={"regression", "bvt"})
	public void dtest()
	{
		System.out.println("fourth test");
	}
	
	
	
	}

