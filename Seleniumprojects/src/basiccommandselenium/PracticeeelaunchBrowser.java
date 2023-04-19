package basiccommandselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PracticeeelaunchBrowser {
	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.id("email")).sendKeys("pragati");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("pragati123");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();

	}
}