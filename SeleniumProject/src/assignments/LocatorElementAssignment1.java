package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorElementAssignment1 {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/");
		
		String pageTitle=driver.getTitle();
		int pageTitleLen=pageTitle.length();
		
		System.out.println("page title is :"+pageTitle);
		System.out.println("page title length is: "+pageTitleLen);
		
		String pageUrl=driver.getCurrentUrl();
		String url = "https://demo.actitime.com/";
		System.out.println("page url ="+pageUrl);
		System.out.println("program input url ="+url);
		if(pageUrl.equals(url)) {
			System.out.println("both url are same");
		}else
		{
			System.out.println("page url are not macth to current url");
		}
		
		String sourceCode=driver.getPageSource();
		int sourceCodeLen=sourceCode.length();
	//	System.out.println("source code of current page is "+sourceCode);
		System.out.println("length of source coe is "+sourceCodeLen);
		
		driver.close();
	}

}
