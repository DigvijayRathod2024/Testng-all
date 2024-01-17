package screenshot2024New;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class CustomLister2024 extends BaseClassforSS implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("this test is failed");
		failedTestCase(result.getMethod().getMethodName());
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}

	
	
	

}
