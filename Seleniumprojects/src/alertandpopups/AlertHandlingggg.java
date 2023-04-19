package alertandpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingggg {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("alert")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.name("confirmation")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();         //accept or dismiss for confirmation
		driver.findElement(By.name("prompt")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("pragati"); // use sendkeys for prompt
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	
	}


}
