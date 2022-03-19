package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import testNgProgram.Utility;

public class WindowsHandling extends Utility{
	static WebDriver driver;

	@Test
	public void testWindow() {
		driver=setUp("chrome","https://demoqa.com/browser-windows");
		System.out.println("current window url :"+driver.getCurrentUrl());
		String homeWinId = driver.getWindowHandle();
		System.out.println("current window i d: "+homeWinId);
		driver.findElement(By.id("tabButton")).click();
		Set<String> allWinId = driver.getWindowHandles();
		System.out.println("all windows id ="+allWinId);
		 allWinId.remove(homeWinId);
		 System.out.println("after removing old win id "+allWinId);
		 String childWinId = allWinId.iterator().next();
		 driver.switchTo().window(childWinId);
		 System.out.println("new tab url ="+driver.getCurrentUrl()); 
		 driver.close();
		 driver.switchTo().window(homeWinId);
		// driver.close();
		 driver.quit();
		
	}
}
