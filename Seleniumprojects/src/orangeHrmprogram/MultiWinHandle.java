package orangeHrmprogram;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWinHandle {
	
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String winid1 = driver.getWindowHandle();
		System.out.println(winid1);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	    Set<String> allwinid = driver.getWindowHandles();
	    for(String eachwinid:allwinid) 
	    	System.out.println(eachwinid);
	}

}



