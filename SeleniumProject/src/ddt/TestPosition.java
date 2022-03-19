 package ddt;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testNgProgram.Utility;



public class TestPosition extends Utility{
	
	WebDriver driver;
	@Test
	public void testPositionOfActitime() {
		
		WebElement uname=driver.findElement(By.name("username"));
		Point Upt =uname.getLocation();
		int xUpt=Upt.getX();
		int yUpt = Upt.getY();
		
		WebElement pass=driver.findElement(By.name("pwd"));
		Point ppt =pass.getLocation();
		int xppt=Upt.getX();
		int yppt = Upt.getY();
		System.out.println("x and y point locator :"+xppt+" "+yppt);
		
	System.out.println(yUpt<yppt);
		
	}
	@BeforeTest
	public void startuo() {
		driver=setUp("chrome","https://demo.actitime.com/");
		
		driver.switchTo().activeElement().sendKeys("admin",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
	}

}
