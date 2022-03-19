package seleniumClassScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		ChromeDriver cdriver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		FirefoxDriver fdriver = new FirefoxDriver();
		
		System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
		InternetExplorerDriver ie=new InternetExplorerDriver();
		
		
	}

}
