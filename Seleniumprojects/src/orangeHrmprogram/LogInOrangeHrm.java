package orangeHrmprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInOrangeHrm {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Driver.manage().window().maximize();
		Thread.sleep(2000);
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		Driver.findElement(By.xpath("//*[@type='password']")).sendKeys("admin123");
		Driver.findElement(By.xpath("//*[@type='submit']")).click();
		boolean dashboardcheck = Driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText().equals("Dashboard");
		if (dashboardcheck == true)
			System.out.println("dashboard appaered");
		else
			System.out.println("dashboard not appeared");
		
		Driver.findElement(By.xpath("//*[text()='Paul Collings']//parent::span//i")).click();
		Driver.findElement(By.linkText("Logout")).click();
        Driver.close();
	}
}


