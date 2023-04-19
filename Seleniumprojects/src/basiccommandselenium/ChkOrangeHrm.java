package basiccommandselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChkOrangeHrm {
	
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
       WebElement txt =  Driver.findElement(By.xpath("//h5[text()='Login']"));
        String retstr  = txt.getText();
        System.out.println(retstr);
       
	

		WebElement username = Driver.findElement(By.name("username"));
		username.sendKeys("Admin");

		WebElement password = Driver.findElement(By.name("password"));
		password.sendKeys("admin123");
        
      //  WebElement username = Driver.findElement(By.xpath("//input[@name='username']"));
		//username.sendKeys("Admin");

		//WebElement password = Driver.findElement(By.xpath("//input[@name='password']"));
		//password.sendKeys("admin123");

		//WebElement LogIn = Driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		//LogIn.click();
		
		
		WebElement LogIn1 = Driver.findElement(By.cssSelector(".oxd-form-actions.orangehrm-login-action button"));
		LogIn1.click();
		
        String oldtitle = "OrangeHRM";
		String newtitle = Driver.getTitle();
		if(newtitle.equals(oldtitle))
			System.out.println("test pass");
		else
			System.out.println("test fail");
		Thread.sleep(5000);
		//Driver.close();	
			
	}
}

	
