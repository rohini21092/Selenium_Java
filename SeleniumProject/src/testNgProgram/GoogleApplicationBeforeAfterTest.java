package testNgProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleApplicationBeforeAfterTest extends Utility {
	
	WebDriver driver;
	
	@Test
	public void googlePageLanding() {
		String actual = "Google";
		String expected= driver.getTitle();
		Assert.assertEquals(actual, expected,"Either google home page is not displayed or title may get changed");
		System.out.println("googlelanding page is finished");
	}
	@Test
	public void searchText() throws InterruptedException {
		WebElement search=driver.findElement(By.name("q"));
		Assert.assertTrue(search.isEnabled());
		search.sendKeys("sql question",Keys.ENTER);
		Thread.sleep(6000);
		System.out.println("search text completed");
	}
	
	@BeforeTest
	public void startUp() {
		driver=setUp("chrome","https://google.com");
		
		}

	@AfterTest
	public void cleanup() {
		driver.close();
	}
}
