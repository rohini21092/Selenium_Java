package seleniumClassScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperations {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./executables/chromedriver.exe");
		WebDriver cdriver=new ChromeDriver();
		
		//enter required Url
		cdriver.get("http:/www.google.com");
		
		//print current page source
		System.out.println("current page source "+cdriver.getPageSource());
		
		//current page title
		System.out.println("current page title is "+cdriver.getTitle());
		
		/* or
		 * String obj2 =cdriver.getTitle();
		 * System.out.println("current page title is "+obj2); 
		 * */
		
		//get current Url
		System.out.println("current page url is "+cdriver.getCurrentUrl());
		/* or
		 * String obj1 =cdriver.getCurrentUrl();
		 * System.out.println("current page title is "+obj1); 
		 * */
		
		//close current browser instance 
		cdriver.close();
	}

}
