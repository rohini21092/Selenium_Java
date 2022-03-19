package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMultiElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> fkart= driver.findElements(By.cssSelector("div[class='_37M3Pb']>div"));
		System.out.println("cont of flipkart menu = "+fkart.size());
		for(int i=0;i<fkart.size();i++)
		{
			System.out.println(fkart.get(i).getText());
		}
		System.out.println("********");
		
		List<WebElement> fashion = driver.findElements(By.cssSelector("div[class='_37M3Pb']>div:nth-of-type(4)>a>div>div"));
		System.out.println("count in fashion menue : "+fashion.size());
		for(int i=0;i<fashion.size();i++)
		{
			System.out.println(fashion.get(i).getText());
		}
		System.out.println("********");
	
	
	}

	
}
