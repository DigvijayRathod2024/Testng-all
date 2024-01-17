package remainingTestNGRevision;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BeforesSuit {

	
	@BeforeSuite
	public void dataSetup() {
		System.out.println("comman data setup");
	}

	
	
	@AfterSuite
	public void dataTearDown() {
		System.out.println("comman data cleanup");
	}

	
}
