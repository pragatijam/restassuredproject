package testngprojects;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ChekinTestSequence {
	  
	@Test(priority=1)
	public void ba() {
		System.out.println("2nd test");
		Assert.assertEquals(false, true);
	}
    
	@Test(priority=-1,invocationCount= 10)
	public void ab() {
		System.out.println("1st test");
		Reporter.log("checking Reporter",false);
	}

}
