package seleniumverifymethodss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedChk {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		Driver.manage().window().maximize();
		
		WebElement radiobutton = Driver.findElement(By.xpath("//span[text()='Female']//parent::label//input"));
		//radiobutton.click();
		//System.out.println(radiobutton.isSelected());
		
		WebElement radiobutton1 = Driver.findElement(By.xpath("//span[text()='Male']//parent::label//input"));
		radiobutton1.click();
		System.out.println(radiobutton1.isSelected());
		System.out.println(radiobutton1.isDisplayed());
		System.out.println(radiobutton1.isEnabled());
	}
}




