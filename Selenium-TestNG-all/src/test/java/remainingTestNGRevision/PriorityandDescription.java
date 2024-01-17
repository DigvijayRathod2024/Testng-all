package remainingTestNGRevision;

import org.testng.annotations.Test;

public class PriorityandDescription {
	
	@Test(priority = 2, description ="timepass")
	public void loginTest1()
	{
		System.out.println("log in test");
	}
	
	
	
	@Test(priority=1, description="this is first")
	public void endtest()
	{
		System.out.println("end the test");
	}

}
