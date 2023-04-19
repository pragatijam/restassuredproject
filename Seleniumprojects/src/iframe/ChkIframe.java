package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;



public class ChkIframe {
	
	public static void main(String[] args) throws InterruptedException  {
		//WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\KING\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	     WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		WebElement source = driver.findElement(By.cssSelector("#slider span"));
		Actions act = new Actions(driver);
		act.clickAndHold(source).build().perform();
		Thread.sleep(2000);
		act.moveToElement(source, 550, 0).release().build().perform();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Download")).click();

	
	}
}



