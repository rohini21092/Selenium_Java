package keybordMouseOpt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CopyPaste {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		FileInputStream fis = new FileInputStream(".\\testData\\copypaste.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("URL");
		driver.get(url);
		
		WebElement fname=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		WebElement lname =driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		Thread.sleep(2000);
		fname.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		lname.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}

}
