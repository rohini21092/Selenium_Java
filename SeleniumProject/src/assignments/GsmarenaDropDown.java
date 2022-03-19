package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmarenaDropDown {

	public static void main(String[] args) {

		/*
 TC3:1.    Open gsmarena.com
Validate home page
Get mobile phone name count from phone finder
Print mobile phone name 

TC4:1.    Open gsmarena.com
Validate home page
Click on Samsung phone link present in phone finder
Get device count and print on console
Print all the device names on the console
Shailesh Gupta8:32 PM
http://omayo.blogspot.com/
**/
		
		System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gsmarena.com/");
		List<WebElement> phfinder = driver.findElements(By.cssSelector("div[class='brandmenu-v2 light l-box clearfix']>ul>li>a"));
		System.out.println("size of phone finder element is : "+phfinder.size());
		for(int i=0;i<phfinder.size();i++) {
			System.out.println(phfinder.get(i).getText());
		}
		
		driver.findElement(By.cssSelector("div[class='brandmenu-v2 light l-box clearfix']>ul>li:first-child>a")).click();
	
		List<WebElement> samsunglist=driver.findElements(By.cssSelector("#review-body>div[class='makers']>ul>li>a"));
		System.out.println("samsung device count is ="+samsunglist.size());
		for(int i=0;i<samsunglist.size();i++) {
			System.out.println(samsunglist.get(i).getText());
		}
	}

}
