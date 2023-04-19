package testngprojects;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listnerrrrr implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("start test",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("test success",true);
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("test is fail",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

}
