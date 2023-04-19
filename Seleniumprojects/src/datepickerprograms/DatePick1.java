package datepickerprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class DatePick1 {

	public static void main(String[]args) throws InterruptedException {
		//System.setProperty("WebDriver.edge.driver", "D:\\chromedriver.exe");
		//WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10 , TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		driver.findElement(By.id("datepicker1")).click();
		Thread.sleep(2000);
		
		int i = 0;
		while(i==0) {
		String monthyear = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		if(!(monthyear.equals("November 1997")))
		     driver.findElement(By.xpath("//*[text()='Prev']")).click();
		else
			break;
		}
		driver.findElement(By.xpath("//*[text()='23']")).click();
		
		}
	}




