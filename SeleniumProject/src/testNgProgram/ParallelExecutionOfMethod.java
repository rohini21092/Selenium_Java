package testNgProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ParallelExecutionOfMethod extends Utility{

	@Test
	public void loginForActitime() {
		WebDriver driver = setUp("chrome","https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		cleanUp();
	}
	
	@Test
	public void vtigerForActitime() {
		WebDriver driver = setUp("ie","https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("Test@123",Keys.ENTER);
		cleanUp();
	}
}
