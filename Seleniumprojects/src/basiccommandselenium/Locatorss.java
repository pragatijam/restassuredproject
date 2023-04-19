package basiccommandselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorss {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// WebElement hyperlink = Driver.findElement(By.linkText("OrangeHRM, Inc"));
		// hyperlink.click();
		
		WebElement hyperlink = Driver.findElement(By.partialLinkText("OrangeHRM"));
		hyperlink.click();
}


}
