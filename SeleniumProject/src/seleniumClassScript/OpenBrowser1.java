package seleniumClassScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver obj1 = new ChromeDriver();
		
		System.setProperty("webdriver.ie.driver",".\\executables\\IEDriverServer.exe");
		WebDriver ie=new InternetExplorerDriver();
		
		System.setProperty("webdriver.gecko.driver",".\\executables\\geckodriver.exe");
		WebDriver fobj=new FirefoxDriver(); 

	}

}
