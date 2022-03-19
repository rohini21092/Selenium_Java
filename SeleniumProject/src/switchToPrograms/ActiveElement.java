package switchToPrograms;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import testNgProgram.Utility;

public class ActiveElement extends Utility{

	@Test
	public void testElement() {
		WebDriver driver = setUp("chrome","https://demo.actitime.com/login.do");
		
		WebElement element = driver.switchTo().activeElement();
		String act= element.getAttribute("placeholder");
		Assert.assertEquals(act, "Username", "By default control is not in user field");
		element.sendKeys("admin",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
		driver.close();
	}
	@Test
	public void googleTest() {
		WebDriver driver = setUp("chrome","https://google.com");
		driver.switchTo().activeElement().sendKeys("sql question",Keys.ENTER);
	}
}
