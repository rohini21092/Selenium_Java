package keybordMouseOpt;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.yaml.snakeyaml.introspector.Property;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeLogin {

	public static void main(String[] args) throws Throwable {

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.actitime.com/login.do");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		WebElement uname = driver.findElement(By.name("username"));
//		uname.sendKeys("admin",Keys.TAB);
//		WebElement pass = driver.findElement(By.name("pwd"));
//		pass.sendKeys("manager",Keys.TAB);
//		
//		Thread.sleep(2000);
//		driver.get("https://www.flipkart.com/");
//		//to remove login popup press Escape button
//		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		
		
		
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		
//		FileInputStream fis =new FileInputStream(".//testData/actiproperty.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
//		
//		String url = prop.getProperty("appurl");
//		driver.get(url);
//		driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB);
//		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		FileInputStream fis = new FileInputStream(".//testData/actiProperty.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("appurl");
		driver.get(url);
		
		driver.findElement(By.id("username")).sendKeys("admin",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL,"v");
	}

}
