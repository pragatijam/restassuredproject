package OptionClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 WebElement source=driver.findElement(By.cssSelector("#fourth a"));
		 WebElement target=driver.findElement(By.cssSelector("#amt7 li"));
		 Thread.sleep(2000);
		    Actions act=new Actions(driver);
		    act.clickAndHold(source).perform();
			 Thread.sleep(20000);
			 act.moveToElement(target).release().build().perform();
	}

}



