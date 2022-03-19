package switchToPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.internal.Utils;

import testNgProgram.Utility;

public class GetScreenshot extends Utility{

	public static void main(String[] args) throws IOException {
		WebDriver driver = setUp("chrome","https://google.com");
		TakesScreenshot ts= (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE) ;
		FileUtils.copyFile(file,new File("./screenshots/GoogleSearchPage.jpg"));
		//Utils.getScreenShot(driver, "./screenshots/GoogleSearchPage2.png");
	}
	
}
