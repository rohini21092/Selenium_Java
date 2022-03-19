package propertyFileOprations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actitimePropertyOpt {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		FileInputStream fis = new FileInputStream(".\\testData\\actiproperty.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("appurl");
		driver.get(url);
		
		String Uname = prop.getProperty("uname");
		String Pass = prop.getProperty("pass");
		
		driver.findElement(By.id("username")).sendKeys(Uname);
		driver.findElement(By.name("pwd")).sendKeys(Pass);
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("container_tasks")).click();
		
		
		
	}

}
