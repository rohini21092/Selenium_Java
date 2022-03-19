package switchToPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import testNgProgram.Utility;

public class HandlingFrame extends Utility{

	@Test
	public void handlingFrame() {
		WebDriver driver =setUp("chrome","https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Autocomplete']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("tags")).sendKeys("j",Keys.chord(Keys.DOWN,Keys.ENTER));
	}
}
