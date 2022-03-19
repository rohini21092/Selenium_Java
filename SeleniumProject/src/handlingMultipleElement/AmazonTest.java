package handlingMultipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//executables//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> menue=driver.findElements(By.cssSelector("#nav-xshop>a"));
		System.out.println("main menue count : "+menue.size());
		
		for(int i=0;i<menue.size();i++) {
			if(menue.get(i).isDisplayed()) {
				System.out.println(menue.get(i).getText());
			}else {
				System.out.println("with innerHTML attribute: "+menue.get(i).getAttribute("innerHTML"));

			}
		}
	}

}
