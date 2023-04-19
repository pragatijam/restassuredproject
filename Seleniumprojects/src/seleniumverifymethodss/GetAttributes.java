package seleniumverifymethodss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributes {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		Driver.manage().window().maximize();
		
		
		//String attribute = Driver.findElement(By.xpath("//*[text()='Demo Home']//parent::div")).getDomAttribute("class");
		//System.out.println(attribute);
		
		Driver.findElement(By.id("isAgeSelected")).click();
		Driver.findElement(By.id("isAgeSelected")).click();
		Driver.findElement(By.id("isAgeSelected")).click();
		String getattribute = Driver.findElement(By.id("txtAge")).getAttribute("style");
		System.out.println(getattribute);
		if(getattribute.contains("block"));
		System.out.println("Success - Check box is checked");
	}
}



