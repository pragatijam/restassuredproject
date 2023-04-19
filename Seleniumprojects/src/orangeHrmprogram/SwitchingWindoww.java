package orangeHrmprogram;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindoww {
	
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String winid1 = driver.getWindowHandle();
		System.out.println(winid1);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	    Set<String> allwinid = driver.getWindowHandles();
	    for(String eachwinid:allwinid) {
	    	if(!eachwinid.equals(winid1)) {
	    	driver.switchTo().window(eachwinid);
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("(//button[text()='Contact Sales'])[2]")).click();
	  }
	}
		Thread.sleep(5000);
		driver.switchTo().window(winid1);	
	}	
}



