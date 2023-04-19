package Seleniumprogram;

public class BrowserTests extends CodeForBrowserInit {
	
	public static void main(String[]args) throws InterruptedException {
		browserInit("edge");
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		browserInit("chrome");
		driver.get("https://www.instagram.com/");
		driver.close();
		driver.quit();
		
	}

}



