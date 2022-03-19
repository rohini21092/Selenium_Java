package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementAssignment4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./executables/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement userNameInputField=driver.findElement(By.name("txtUsername"));
		userNameInputField.sendKeys("Admin");
		
		WebElement passwordInputField=driver.findElement(By.name("txtPassword"));
		passwordInputField.sendKeys("admin123");
		
		WebElement loginButton=driver.findElement(By.name("Submit"));
		loginButton.click();
		
		//driver.close();
		
		
		
	}

}
