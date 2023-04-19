package titlechkefoemock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TitleofPage {
	
	
	public static void main(String[]args) throws InterruptedException{
		// WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://openai.com");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[text()='Company']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[text()='Careers']")).click();
		 
		String  oldtitle="Careers";
		String newtitle=driver.getTitle();
		if(newtitle.equals(oldtitle))
			System.out.println("title is Careers");
		else
			System.out.println("title is not Careers");
	}

}