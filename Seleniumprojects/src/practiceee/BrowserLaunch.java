package practiceee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class BrowserLaunch {
	
	public static void main (String[]args) {
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		
	}

}
