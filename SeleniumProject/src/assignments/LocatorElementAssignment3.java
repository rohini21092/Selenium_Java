package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LocatorElementAssignment3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
//		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
		driver.get("http://www.google.com");
		
		System.out.println("current page url ="+driver.getCurrentUrl()); 
		String sourceCode=driver.getPageSource();
		int sourceCodeLen=sourceCode.length();
		System.out.println("length of sourcr code is ="+sourceCodeLen);
		driver.close();
	}

}
