package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChkIframeWithoutWaitt {
	
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
	 // WebDriverWait wa = new WebDriverWait(driver,60);
     //	wa.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
		
		WebElement source = driver.findElement(By.cssSelector("#slider span"));
		Actions act = new Actions(driver);
		act.clickAndHold(source).build().perform();
		act.moveToElement(source, 550, 0).release().build().perform();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Download")).click();

	     }
	}



