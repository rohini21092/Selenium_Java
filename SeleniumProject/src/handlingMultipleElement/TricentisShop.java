package handlingMultipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TricentisShop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		List<WebElement> categoryopt=driver.findElements(By.cssSelector("div[class='block block-category-navigation']>div:nth-of-type(2)>ul>li>a"));
	
//		List<WebElement> catOptions=driver.findElements(By.cssSelector("div[class='block block-category-navigation'] ul>li>a"));
	
		System.out.println("total count of catagory option is : "+categoryopt.size());
		for(int i=0;i<categoryopt.size();i++) {
			System.out.println(categoryopt.get(i).getText());
		}
	}

}
