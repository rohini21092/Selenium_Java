package handlingMultipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonCount {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		WebElement signupbtn = driver.findElement(By.id("submitbtn"));
		System.out.println("signUp btn enabled :"+signupbtn.isEnabled()+" signUp btn is displayed : "+signupbtn.isDisplayed());
		
		System.out.println("SignUp btn name is : "+signupbtn.getText());
		
		/**
		 * <button type="submit" class="btn btn-primary" name="signup"> Submit </button>
		 * getAttribute("attribute_name")- first identify the webelement dn we can user getAttribute("",) 
		 * to get the html attribute value based on attribute name
		 */
		System.out.println("name attribute value: "+signupbtn.getAttribute("name"));
		System.out.println("class attribute value: "+signupbtn.getAttribute("class"));
		System.out.println("type attribute value: "+signupbtn.getAttribute("type"));
		
		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		System.out.println("Button count :"+buttons.size());
		
		for(int i=0;i<buttons.size();i++) {
			System.out.println(buttons.get(i).getAttribute("class"));
		}
		
		
	}

}
