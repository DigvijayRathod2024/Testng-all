package remainingTestNGRevision;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		Reporter.log("method name" + result.getName());
		System.out.println(" test is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		Reporter.log("status of execution is"+ result.getStatus());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println(" test is failed ...captured");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
