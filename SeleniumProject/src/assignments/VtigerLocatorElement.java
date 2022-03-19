package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VtigerLocatorElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("page title before login: "+driver.getTitle());
		Thread.sleep(2000);
		WebElement userInputName = driver.findElement(By.id("username"));
		userInputName.clear();
		
		Thread.sleep(2000);
		WebElement  password =driver.findElement(By.id("password"));
		password.clear();
		
		Thread.sleep(2000);
		userInputName.sendKeys("admin");
		Thread.sleep(2000);
		password.sendKeys("Test@123");
		
		Thread.sleep(2000);
		driver.findElement(By.className("buttonBlue")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("fa-user")).click();
		WebElement logout=driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT"));

		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(logout));
		Thread.sleep(2000);
		System.out.println("page title after login is:"+driver.getTitle());
		Thread.sleep(2000);
		logout.click();
		
		//driver.close();
		
//		open browser and enter the utl as "http://demo.automationtesting.in/Register.html"
//		get the main menu options count and print in console
//		print one by one all the options in th console
		//flipkart
		
	}

}
