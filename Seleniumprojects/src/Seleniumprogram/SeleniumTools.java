package Seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumTools {
	
	public static void main(String[]args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		Driver.manage().window().maximize();
	    Driver.navigate().to("https://www.instagram.com/");
	    Thread.sleep(2000);
	    Driver.navigate().back();
	}

}



