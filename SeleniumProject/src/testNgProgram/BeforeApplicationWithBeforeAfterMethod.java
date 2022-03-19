package testNgProgram;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BeforeApplicationWithBeforeAfterMethod extends Utility {
	
	 WebDriver driver;
	@Test
	public void googlePageLanding() {
		String expectedTitle="Google";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle,"either google home page is not open or page title get changed");
		System.out.println("TestGoogleLandingPage is finished");
	}
	
	@Test
	public void testSearch() throws InterruptedException {
		WebElement searchElement = driver.findElement(By.name("q"));
		//Thread.sleep(5000);
		Assert.assertTrue(searchElement.isEnabled());
		searchElement.sendKeys("sql question",Keys.ENTER);
		Thread.sleep(5000);
		System.out.println("test search finished");
	}
	
	
	@BeforeMethod
	public void startUp() {		
		driver = setUp("chrome","https://www.google.com");
		driver.manage().timeouts().implicitlyWait(20000,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void cleanup() {
		driver.close();
	}

}
