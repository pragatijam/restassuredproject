package orangeHrmprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownUsingSelectt {

	public class HandleDropDownUsingSelect {

		public void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver Driver = new ChromeDriver();
			Driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
			Driver.manage().window().maximize();
			Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// year
			WebElement year = Driver.findElement(By.id("year"));
			Select y = new Select(year);
			y.selectByVisibleText("1997");

			// month
			WebElement month = Driver.findElement(By.id("month"));
			Select z = new Select(month);
			z.selectByValue("11");

			// day
			WebElement day = Driver.findElement(By.id("day"));
			Select x = new Select(day);
			x.selectByIndex(23);

			// Driver.quit();

		}
	}
}
