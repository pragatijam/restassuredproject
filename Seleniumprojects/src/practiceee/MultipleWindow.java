package practiceee;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

;

public class MultipleWindow {
	
	public static void main(String[]args) {
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		String win1=driver.getWindowHandle();
		driver.findElement(By.linkText("Create a Page"));
		Set<String>windows=driver.getWindowHandles();
		for(String window:windows)
			System.out.println(window);
	
	
	}

}
