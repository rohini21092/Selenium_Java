package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTestingMultipleElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//executables//chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		List<WebElement> navOpt =driver.findElements(By.cssSelector("div[class='navbar-collapse collapse navbar-right']>ul>li>a"));
		System.out.println("total count is : "+navOpt.size());
		for(int i=0;i<navOpt.size();i++) {
			System.out.println(navOpt.get(i).getText());
		}
		
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='navbar-collapse collapse navbar-right']>ul:first-child>li>a"));
		
		List<WebElement> switchTo =driver.findElements(By.cssSelector("div[class='navbar-collapse collapse navbar-right']>ul>li:nth-of-type(4)>ul>li>a"));
		System.out.println("total switchTo count is : "+switchTo.size());
		for(int i=0;i<switchTo.size();i++) {
			System.out.println(switchTo.get(i).getText());
		}
		System.out.println("******************");
		List<WebElement> Wedge=driver.findElements(By.cssSelector("div[class='navbar-collapse collapse navbar-right']>ul>li:nth-of-type(5)>ul>li>a"));
		System.out.println("count of wedges :"+Wedge.size());
		for(int i=0;i<Wedge.size();i++) {
			System.out.println(Wedge.get(i).getText());
		}	
		
		System.out.println("******************");

		List<WebElement> interaction =driver.findElements(By.cssSelector("div[class='navbar-collapse collapse navbar-right']>ul>li:nth-of-type(6)>ul>li>a"));
		System.out.println("total interaction count is : "+interaction.size());
		for(int i=0;i<interaction.size();i++) {
			System.out.println(interaction.get(i).getText());
		}
		
		System.out.println("******************");

		List<WebElement> video =driver.findElements(By.cssSelector("div[class='navbar-collapse collapse navbar-right']>ul>li:nth-of-type(7)>ul>li>a"));
		System.out.println("total video count is : "+video.size());
		for(int i=0;i<video.size();i++) {
			System.out.println(video.get(i).getText());
		}
		
		System.out.println("******************");

		List<WebElement> wysiwyg =driver.findElements(By.cssSelector("div[class='navbar-collapse collapse navbar-right']>ul>li:nth-of-type(8)>ul>li>a"));
		System.out.println("total wysiwyg count is : "+wysiwyg.size());
		for(int i=0;i<wysiwyg.size();i++) {
			System.out.println(wysiwyg.get(i).getText());
		}
		
		System.out.println("******************");

		List<WebElement> more =driver.findElements(By.cssSelector("div[class='navbar-collapse collapse navbar-right']>ul>li:nth-of-type(9)>ul>li>a"));
		System.out.println("total more count is : "+more.size());
		for(int i=0;i<more.size();i++) {
			System.out.println(more.get(i).getText());
		}
		
	}

}
