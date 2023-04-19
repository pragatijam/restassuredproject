package orangeHrmprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectPartiChkBoxForDynamicTable {
	
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
    	Thread.sleep(2000);
    	//driver.findElement(By.xpath("//*[contains(text(),'hari')]//parent::div//following-sibling::div"
    		//	+ "//*[contains(text(),'prakash')]//parent::div//preceding-sibling::div//span//i")).click();     //using parent and sibling
    	
       // driver.findElement(By.xpath("//*[contains(text(),'Alice')]//parent::div//parent::div//"
        	//	+ "*[contains(text(),'Duval')]//parent::div//parent::div//span//i")).click();        //using only parent
   
        driver.findElement(By.xpath("//*[contains(text(),'Anthony')]//ancestor::div//*[contains(text(),'Nolan')]"
        		+ "//parent::div//parent::div//span//i")).click();       //using ancestor and parent
    }
}



