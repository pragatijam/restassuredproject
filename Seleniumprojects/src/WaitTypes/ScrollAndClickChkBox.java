package WaitTypes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollAndClickChkBox {
	
	 public static void main(String []args) throws InterruptedException {
	    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	
	    	driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
	    	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
	    	driver.findElement(By.xpath("//*[@type='submit']")).click();
	    	driver.findElement(By.xpath("//*[text()='PIM']")).click();
	    	Thread.sleep(5000);
	    	
	    	WebElement srollthischeckbox = driver.findElement(By.xpath("//*[contains(text(),'David')]//ancestor::div//*[contains(text(),'Morris')]//parent::div//parent::div//span//i"));
	       JavascriptExecutor js= (JavascriptExecutor)driver;
	       js.executeScript("arguments[0].click();",srollthischeckbox);
	       //driver.close();
	 
	 }
}



