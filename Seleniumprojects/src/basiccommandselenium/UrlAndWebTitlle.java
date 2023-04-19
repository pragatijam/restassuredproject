package basiccommandselenium;

import Seleniumprogram.CodeForBrowserInit;

public class UrlAndWebTitlle  extends CodeForBrowserInit{ 
	public void checkInTitleOfPage(String title) {
			String TitleOfPage = driver.getTitle();
			if(TitleOfPage.equals(title))
				System.out.println("test is pass");
			else
				System.out.println("test is fail");
		    }
			
			public void checkInurlOfPage(String url) {
				String checkInurlOfPage = driver.getTitle();
				if(checkInurlOfPage.equals(url))
					System.out.println("test is pass");
				else
					System.out.println("test is fail");
				}
		
			public static void main(String[]args) {
				browserInit("chrome");
				driver.get("https://www.instagram.com/");
				driver.manage().window().maximize();
				
				UrlAndWebTitlle ref = new UrlAndWebTitlle();
				ref.checkInTitleOfPage("instagram");
			}

	}




			