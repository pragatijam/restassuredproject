package basiccommandselenium;

import Seleniumprogram.CodeForBrowserInit;


public class TestSeleniummmm {
	
	public class TestSelenium extends CodeForBrowserInit {
		public void main(String[]args) {
			browserInit("edge");
			driver.get("https://www.instagram.com/");
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.navigate().back();
			driver.close();
	}
	
	}
}
