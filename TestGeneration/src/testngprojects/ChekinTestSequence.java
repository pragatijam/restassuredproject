package testngprojects;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;


public class ChekinTestSequence extends MethodToRunTestCasesOnCurrentPage {
	
	@org.testng.annotations.BeforeSuite
	void BeforeSuite() {
	}
	
	@BeforeTest
	void BeforeTest() {
	}
	
	@BeforeClass
	void BeforeClass() {
	}
	
	@BeforeMethod
	void checkTextLoginPage() {
	}
	
	@Test
	void verifyloginaftercorrectcredentials() {
		ChekinTestSequence t=new ChekinTestSequence();
		t.login("Admin","admin123");
		AssertJUnit.assertEquals(true, true);
	}
	
	@AfterMethod
	public
	void logout() {
	}
	
	@AfterClass
	void AfterClass() {
	}
	
	@org.testng.annotations.AfterTest
	void AfterTest() {
	}
	
	@org.testng.annotations.AfterSuite
	void AfterSuite() {
	}
	

}
