package testngprojects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertionsss {
	
	public static WebDriver driver;
	static String url="http://dthahab.com/Setting/Splash/Create";
	
	@BeforeTest
	public void initBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=0)
	void VerifyurlofPage() {
		String verifyurl=driver.getCurrentUrl();
		Assert.assertEquals(verifyurl, "http://dthahab.com/Account/Login","verify url");
		System.out.println("nxt line after verify url");//hard assert next line skip but soft assert case pass or fail next line execute
		
	}
	
	@Test(priority=1)
	void VerifyTitleofPage() {
		String verifytitle=driver.getTitle();
		Assert.assertEquals(verifytitle, "Login | Dthahab","verify title");
		System.out.println("nxt line after verify title");
	}
	
	
	@AfterTest
	void teardDown() {
		driver.quit();
	}
	
	

}
