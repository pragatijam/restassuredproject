package WaitTypes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollinggg {
	
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
	    	
	    	JavascriptExecutor js = (JavascriptExecutor)driver;
	    	js.executeScript("window.scrollBy(0,800)");
	    	Thread.sleep(5000);
	    	js.executeScript("window.scrollBy(0,-800)");
	    	Thread.sleep(5000);
	    	//driver.close();
	    	
	   }
}



