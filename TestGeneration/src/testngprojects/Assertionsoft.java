package testngprojects;

	
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(testngprojects.Listnerrrrr.class)
	public class Assertionsoft {
		
		public static WebDriver driver;
		static String url="http://dthahab.com/Setting/Splash/Create";
		
		@BeforeTest(alwaysRun=true,groups="sanity,regression")
		 void initBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
		}
		
		@Test(priority=0,groups="sanity")
		void VerifyurlofPage() {
			String verifyurl=driver.getCurrentUrl();
			SoftAssert softast = new SoftAssert();   //soft assert
			softast.assertEquals(verifyurl, url,"verify url");
			System.out.println("nxt line after verify url");//hard assert next line skip but soft assert case pass or fail next line execute
			softast.assertAll();   //compulsion
		}
		
		@Test(priority=1,groups="regression")
		void VerifyTitleofPage() {
			String verifytitle=driver.getTitle();
			SoftAssert softast = new SoftAssert();
			softast.assertEquals(verifytitle, "Login | Dthahab","verify title");
			System.out.println("nxt line after verify title");
			softast.assertAll();
		}
		
		@Test(priority=2,groups={"sanity","regression"})
		void VerifyDashboardAfterLogin() {
			MethodToRunTestCasesOnCurrentPage c = new MethodToRunTestCasesOnCurrentPage();
			c.login("VELOCITY", "VELOCITY123");
		String txt	=c.GetPageText("Dashboard");
			Assert.assertEquals(txt, "Dashboard","verifying page text");
			
		}
		
		@Test(priority=3,dependsOnMethods="VerifyDashboardAfterLogin",groups="regression")
		void VerifyDashboardPageBlock() {
			MethodToRunTestCasesOnCurrentPage c=new MethodToRunTestCasesOnCurrentPage();
			String txt1=c.GetBlocksOnDashboard("Orders");
			String txt2=c.GetBlocksOnDashboard("Revenue");
			String txt3=c.GetBlocksOnDashboard("Average Price");
			String txt4=c.GetBlocksOnDashboard("Product Sold");
			Assert.assertEquals(txt1, "ORDERS","verifying page block");
			Assert.assertEquals(txt2, "REVENUE","verifying page block");
			Assert.assertEquals(txt3, "AVERAGE PRICE","verifying page block");
			Assert.assertEquals(txt4, "PRODUCT SOLD","verifying page block");
		}
		
		 @AfterTest
		void teardDown() {
			driver.quit();
		}
		
	}


