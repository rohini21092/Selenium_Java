package keybordMouseOpt;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartHover {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class='_37M3Pb']/div[5]"));
		
		Actions action =new Actions(driver);
		
		for(int i=0;i<l1.size();i++) {
			action.moveToElement(l1.get(i)).perform();
		System.out.println(l1.get(i).getText());
		
		
		}
		
	}

}
