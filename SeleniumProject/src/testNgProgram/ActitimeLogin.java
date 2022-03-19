package testNgProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeLogin {
	
	WebDriver driver;
	FileInputStream fis ;
	Properties prop;
	
	@Test(priority=0)
	public void login() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		fis = new FileInputStream(".//testdata/actiproperty.properties");
		prop = new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("appurl");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	//	driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}
	
	@Test(priority=1)
	public void logoutApp() {
//		WebElement logout=driver.findElement(By.linkText("Logout"));
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.elementToBeClickable(logout));
//		System.out.println("page title after login  "+driver.getTitle());
//		logout.click();
		
		WebElement logoutLink=driver.findElement(By.linkText("Logout"));
		WebDriverWait wait=new WebDriverWait(driver,20);		
		wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
		System.out.println("Page title after login: "+driver.getTitle());	
		logoutLink.click();	
		driver.close();
		
	}

}
