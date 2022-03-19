package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaucedemoUnamePass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.manage().window().maximize();
		
		WebElement uname = driver.findElement(By.cssSelector("#login_credentials"));
		System.out.println(uname.getText());
		String s= uname.getText();
		System.out.println("*********");
		String[] s1 = s.split("\n");
		
		System.out.println("first : "+s1[1]);
		System.out.println("second : "+s1[2]);
		System.out.println("third : "+s1[3]);
		System.out.println("forth : "+s1[4]);
	

		System.out.println("**************");
		WebElement pass = driver.findElement(By.cssSelector("div[class='login_password']"));
		System.out.println(pass.getText());
		String p= pass.getText();
		String[] s2 = p.split("\n");
		System.out.println("pass ="+s2[1]);
		
				
		driver.findElement(By.id("user-name")).sendKeys(s1[1]);
		driver.findElement(By.id("password")).sendKeys(s2[1]);
		
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(4000);
		driver.close();
	}

}
