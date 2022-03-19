package testNgProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization extends Utility {
	
//	@Parameters({"browser"})
//	@Test
//	public void testCaseOne(String browser) {
//		System.out.println("parameter for browser passed as :"+browser);
//	}
//	
//	@Parameters({"user","pass"})
//	@Test
//	public void testCaseTwo(String user,String pass) {
//	System.out.println("parameter for user name passed as "+user);
//	System.out.println("parameter for password passed as "+pass);	
//	
//	}
//	
//	@Parameters({"browser","user","pass"})
//	@Test
//	public void testCaseThree(String browser,String user,String pass) {
//		System.out.println("parameter for browser passed as :"+browser);
//		System.out.println("parameter  for user name passed as "+user);
//		System.out.println("parameter  for password passed as "+pass);
//	}
//	
	@Parameters({"browser","user","pass"})
	@Test
	public void loginForActitime(String browser,String user,String pass) {
		WebDriver driver = setUp(browser,"https://demo.actitime.com/login.do");
		System.out.println("parameter for browser passed as :"+browser);
		System.out.println("parameter  for user name passed as "+user);
		System.out.println("parameter  for password passed as "+pass);
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(pass,Keys.ENTER);
		
	}
	
}
