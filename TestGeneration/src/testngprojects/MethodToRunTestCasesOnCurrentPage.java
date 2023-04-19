package testngprojects;

import org.openqa.selenium.By;

public class MethodToRunTestCasesOnCurrentPage extends Assertionsoft {
	
	public void login(String usname, String pass) {
	driver.findElement(By.id("Username")).sendKeys(usname);
	driver.findElement(By.id("Password")).sendKeys(pass);
	driver.findElement(By.xpath("//*[text()='Log In']")).click();
	}

	String GetPageText(String pageText) {
		String text =driver.findElement(By.xpath("//h4[text()='" + pageText + "']")).getText();
		return text;
	}
	
	String GetBlocksOnDashboard(String blockname) {
		String text=driver.findElement(By.xpath("//h6[text()='" + blockname + "']")).getText();
		return text;
	}
	
	public void logout() {
		System.out.println("logout logic");
	}
	
	void chekingPageTitle() {
		System.out.println("check page title");
	}
}
