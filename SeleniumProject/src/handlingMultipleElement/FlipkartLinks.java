package handlingMultipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		List<WebElement> flipkartLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("links in flipkart : "+flipkartLinks.size());
		
		System.out.println("menu item in flipkart ");
		
	}

}
