package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricinfoDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		
		List<WebElement> count = driver.findElements(By.cssSelector("ul[class='navbar-nav mr-auto']>li>a"));
		
		System.out.println("total count of menu : "+count.size());
		for(int i=0;i<count.size();i++) {
			System.out.println(count.get(i).getText());
		}
		
		System.out.println("**************");
		
//List<WebElement> lScores = driver.findElements(By.cssSelector("ul[class='navbar-nav mr-auto']>li"));
//		
//		System.out.println("total count in Scores menu : "+lScores.size());
//		for(int i=0;i<lScores.size();i++) {
//			System.out.println(lScores.get(i).getText());
//		}
		
		System.out.println("**************");
		
List<WebElement> teams = driver.findElements(By.cssSelector("ul[class='navbar-nav mr-auto']>li>div>ul>li>a"));
		
		System.out.println("total count in teams menu : "+teams.size());
		for(int i=0;i<teams.size();i++) {
			System.out.println(teams.get(i).getText());
		}
		
//		System.out.println("**************");
//		
//List<WebElement> news = driver.findElements(By.cssSelector("ul[class='navbar-nav mr-auto']>li>a"));
//		
//		System.out.println("total count in News menu : "+news.size());
//		for(int i=0;i<news.size();i++) {
//			System.out.println(news.get(i).getText());
//		}
//		
//		System.out.println("**************");
//		
//List<WebElement> Features = driver.findElements(By.cssSelector("ul[class='navbar-nav mr-auto']>li>a"));
//		
//		System.out.println("total count in series menu : "+Features.size());
//		for(int i=0;i<Features.size();i++) {
//			System.out.println(Features.get(i).getText());
//		}
//		
//		System.out.println("**************");
//		
//List<WebElement> Videos = driver.findElements(By.cssSelector("ul[class='navbar-nav mr-auto']>li>a"));
//		
//		System.out.println("total count in series menu : "+Videos.size());
//		for(int i=0;i<Videos.size();i++) {
//			System.out.println(Videos.get(i).getText());
//		}
//		
//		System.out.println("**************");
//		
//List<WebElement> Stats = driver.findElements(By.cssSelector("ul[class='navbar-nav mr-auto']>li>a"));
//		
//		System.out.println("total count in series menu : "+Stats.size());
//		for(int i=0;i<Stats.size();i++) {
//			System.out.println(Stats.get(i).getText());
//		}
//		
//		System.out.println("**************");
//		
		
	}

}
