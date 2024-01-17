package testNGall;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;


@Test(groups="Sample tests for befores")
public class BeforeGroupsClass {
	
	
	
	
	
	@BeforeClass
	public void atest()
	{
		System.out.println("run this before class ");
	}
	
	@AfterClass
	public void ztest()
	{
		System.out.println("run this after class");
	}
	
	
	
	@BeforeGroups(value="regression")
	public void beforegrouptest()
	{
		System.out.println("this is first group ");
	}
	
	
	@AfterGroups(value="regression")
	public void aftergrouptest()
	{
		System.out.println("this is last group ");
	}
	
	
	@Test (groups="regression")
	public void btest()
	{
		System.out.println("first test");
	}
	
	
	@Test (groups="regression")
	public void ctest()
	{
		System.out.println("second test");
	}
	
	
	@Test (groups={"regression", "bvt"})
	public void dtest()
	{
		System.out.println("third test ");
	}
	
	
	
	@Test (groups={"regression", "bvt"})
	public void etest()
	{
		System.out.println("fourth test");
	}
	
	
	
	
	}

