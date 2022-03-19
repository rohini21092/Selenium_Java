package assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBlaze {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
//		FileInputStream fis = new FileInputStream(".\\testData\\demoBlaze.properties"); 
//		
//		Properties prop =new Properties();
//		prop.load(fis);
//		prop.getProperty("url");	
		
		driver.get("http://www.demoblaze.com/");
		
		List<WebElement> elements= driver.findElements(By.cssSelector("div[class='col-lg-9']>div>div"));
		System.out.println("total item in page1 = "+elements.size());
		List<WebElement> name=driver.findElements(By.cssSelector("div[id='tbodyid']>div>div>div>[class='card-title']"));
		List<WebElement> price = driver.findElements(By.cssSelector("div[id='tbodyid']>div>div>div>h5"));
		for(int i=0;i<elements.size();i++) {
			System.out.println("Name = "+name.get(i).getText());
			System.out.println("Price = "+price.get(i).getText());
		}
		
		WebElement btn=driver.findElement(By.cssSelector("button[id='next2']"));
		System.out.println(btn.isDisplayed());
		if(btn.isDisplayed()) {
			btn.click();
		}
		
		for(int i=0; i<elements.size();i++)
		{
				if(elements.get(0).getText()==""){
					elements=driver.findElements(By.cssSelector("div[class='col-lg-9']>div>div"));
					System.out.println("total item in page1 = "+elements.size());

				}
		}
		//name=driver.findElements(By.cssSelector("div[id='tbodyid']>div>div>div>[class='card-title']"));
		//price = driver.findElements(By.cssSelector("div[id='tbodyid']>div>div>div>h5"));
		
//		for(int i=0;i<elements.size();i++) {
//			System.out.println("Name = "+name.get(i).getText());
//			System.out.println("Price = "+price.get(i).getText());
//		}
		
		
		WebElement prev= driver.findElement(By.cssSelector("button[id='prev2']"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(prev));
		System.out.println("total item in page2 = "+elements.size());
		
		
		
		
//		List<WebElement> element2=driver.findElements(By.cssSelector("div[id='tbodyid']>div>div>div[class='card-block']>h4"));
//		System.out.println("total element in page2 ="+element2.size());
//		
	}

}
