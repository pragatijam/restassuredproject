package Seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CodeForBrowserInit {
	
	public static WebDriver driver;
	public static WebDriver browserInit(String browser) {
		System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		if(browser.equals("edge"))
			driver = new EdgeDriver();
		
		if(browser.equals("chrome"))
			driver = new ChromeDriver();
		
		return driver;
	}

}



