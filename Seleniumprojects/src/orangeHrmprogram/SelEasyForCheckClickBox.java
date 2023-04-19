package orangeHrmprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelEasyForCheckClickBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		Driver.manage().window().maximize();

		Driver.findElement(By.id("isAgeSelected")).click();
		boolean obj = Driver.findElement(By.id("isAgeSelected")).isSelected();
		System.out.println(obj);
		// List<WebElement> chbox =
		// Driver.findElements(By.xpath("//*[@class='cb1-element']"));
		// for(WebElement cb:chbox) {
		// cb.click();
		// }

		Driver.findElement(By.id("check1")).click();
		Boolean enable = Driver.findElement(By.id("check1")).isEnabled();
		System.out.println(enable);
	}
}
