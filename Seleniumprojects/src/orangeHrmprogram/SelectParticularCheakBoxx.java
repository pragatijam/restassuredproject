package orangeHrmprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Seleniumprogram.CodeForBrowserInit;

public class SelectParticularCheakBoxx {

	public class SelectParticularCheckBox2 extends CodeForBrowserInit {

		public void login() {
			driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@type='submit']")).click();
		}

		public void ClickPartiEmpname(String fname, String lname) {
			driver.findElement(By.xpath("//*[contains(text(),'" + fname + "')]//parent::div//following-sibling::div"
					+ "//*[contains(text(),'" + lname + "')]//parent::div//preceding-sibling::div//span//i")).click(); // usingparentandsibling
     	}
    	public  void main(String[] args) {
			CodeForBrowserInit.browserInit("chrome");

			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			SelectParticularCheckBox2 partchk = new SelectParticularCheckBox2();
			partchk.login();
			driver.findElement(By.xpath("//*[text()='PIM']")).click();
			partchk.ClickPartiEmpname("Garry", "White");

		}
	}

}
