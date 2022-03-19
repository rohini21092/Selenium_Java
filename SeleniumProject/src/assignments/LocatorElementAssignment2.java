package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorElementAssignment2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",".//executables//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		String expectedTitle="facebook login";
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("actual and expected url are same");
		}else {
			System.out.println("Actual and expected url are not same");
		}
		String homePageUrl=driver.getCurrentUrl();
		System.out.println("Homepage url ="+homePageUrl);
		
		driver.close();
	}

}
