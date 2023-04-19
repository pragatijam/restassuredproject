package orangeHrmprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LogInfb {
	
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://m.facebook.com/");
		Driver.manage().window().maximize();
		
		//Driver.findElement(By.cssSelector("#m_login_email")).sendKeys("Pragati");
		//Driver.findElement(By.cssSelector("#m_login_password")).sendKeys("pragati123");
		//Driver.findElement(By.cssSelector("._54k8._52jh._56bs._56b_._28lf._9cow._56bw._56bu")).click();
		
		Driver.findElement(By.cssSelector("[name='email']")).sendKeys("Pragati");
		Driver.findElement(By.cssSelector("[type='password']")).sendKeys("pragati123");
		Driver.findElement(By.cssSelector("[name='login']")).click();
			
	}
}



