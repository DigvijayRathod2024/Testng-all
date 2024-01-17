package remainingTestNGRevision;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class ManageDependancy {
	
	@SuppressWarnings("deprecation")
	@Test
	public void test1()
	{
		System.out.println("first");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = "test1")
	public void test2()
	{
		System.out.println("second");
	}

	@Test
	public void test3()
	{
		System.out.println("third");
	}

	
	@Test
	public void test4()
	{
		System.out.println("Fourth");
	}

	
}
