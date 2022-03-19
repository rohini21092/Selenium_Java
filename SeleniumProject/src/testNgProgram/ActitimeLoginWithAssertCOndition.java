package testNgProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeLoginWithAssertCOndition {

	
	WebDriver driver;
	@Test(priority=0)
	public void  loginwithAssert() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		String expectedTitle = "actiTIME - Login";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		WebElement login=	driver.findElement(By.id("loginButton"));
		Assert.assertEquals(login.isDisplayed(), true);
		login.click();
	}
	
	@Test(priority=1)
	public void logout() {
		WebElement logout =driver.findElement(By.id("loginButton"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(logout));
		System.out.println("page title after login is "+driver.getTitle());
		logout.click();
		
	}
	
	
	
}
