package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShott {
	
public static WebDriver driver;
	
	public void ScreenShot(String filename) throws IOException {
		TakesScreenshot scrnshot = (TakesScreenshot)driver;
		File source =scrnshot.getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\Users\\KING\\Pictures\\"+filename+".png");
		FileHandler.copy(source, destination);
	}

}



