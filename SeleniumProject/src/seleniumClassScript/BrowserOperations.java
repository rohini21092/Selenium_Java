package seleniumClassScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperations {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(6000);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(6000);

		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(6000);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.manage().window().setSize(new Dimension(500,500));
		Thread.sleep(6000);
		driver.navigate().back();
		
		Thread.sleep(6000);
		driver.navigate().forward();
		
		Thread.sleep(6000);
		driver.navigate().refresh();
		
		Thread.sleep(6000);
		driver.navigate().to("https:\\www.google.com");
		driver.close();
		
		
	}

}
