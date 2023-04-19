package orangeHrmprogram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropDown {
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//year
		List<WebElement> years = Driver.findElements(By.xpath("//*[@id='year']//option"));
		for(WebElement year:years)
			if(year.getText().equals("1997"))
				year.click();
		
		//month
		List<WebElement> months = Driver.findElements(By.xpath("//*[@id='month']//option"));
		for(WebElement month:months)
			if(month.getText().equals("Nov"))
				month.click();
		
		//day
         List<WebElement> days = Driver.findElements(By.xpath("//*[@id='day']//option"));
         for(WebElement day:days)
        	 if(day.getText().equals("23"))
        		 day.click();
         
       //  Driver.quit();
		
		
	}
}

