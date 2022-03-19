package switchToPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testNgProgram.Utility;

public class HandlingAlerts extends Utility{
	static WebDriver driver;
	@Test
	public void testAlerts() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=setUp("chrome","https://demoqa.com/alerts");
	//	driver.findElement(By.id("item-1")).click();
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(5000);
		String alertText=driver.switchTo().alert().getText();
		System.out.println("alert msg is="+alertText);
		driver.switchTo().alert().accept();
		
//		driver.findElement(By.id("timerAlertButton")).click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("hello");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}
