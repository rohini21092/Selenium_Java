package seleniumClassScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestVtiger {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println("login page title before login :"+driver.getTitle());
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		System.out.println("user name is enabled  :"+username.isEnabled());
		System.out.println("user name is displayed  :"+username.isDisplayed());

		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("Test@123");
		System.out.println("password is enabled  :"+password.isEnabled());
		System.out.println("password is displayed  :"+password.isDisplayed());
		
		
		WebElement loginbtn =driver.findElement(By.className("buttonBlue"));
		loginbtn.click();
		Thread.sleep(5000);
		driver.findElement(By.className("fa-user")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
		
		//driver.findElement(By.className("fa-user")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
		
	}

}
