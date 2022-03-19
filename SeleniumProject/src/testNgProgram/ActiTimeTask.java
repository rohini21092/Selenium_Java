package testNgProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimeTask {
	WebDriver driver;
	@Test
	public void openBroserAndLogin() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}
	
	@Test (dependsOnMethods="openBroserAndLogin")
	public void createAndVerifyTask() {
		driver.findElement(By.xpath("//td[@class='navItem preventPanelsHiding navCell relative notSelected']//div[@id='container_tasks']")).click();
	}
	
	@Test 
	public void modifyAndVerifyTask() {
		
	}
	
	@Test 
	public void deleteAndVerifyTask() {
		
	}

	@Test 
	public void logoutAndClose() {
		WebElement logoutLink=driver.findElement(By.linkText("Logout"));
		WebDriverWait wait=new WebDriverWait(driver,20);		
		wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
		System.out.println("Page title after login: "+driver.getTitle());	
		logoutLink.click();	
		driver.close();	
	}

}
