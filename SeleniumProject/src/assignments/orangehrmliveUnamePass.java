 package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrmliveUnamePass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//executables//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement uname = driver.findElement(By.cssSelector("#wrapper>div>div:nth-of-type(2)"));
		System.out.println(uname.getText());
		String s= uname.getText();
	//	System.out.println(s);
		String[] s1 = s.split(":");
		System.out.println("index 0 "+s1[0] );
		System.out.println("index1 ="+s1[1]);
		System.out.println("index2 ="+s1[2]);

		String[] s2 = s1[1].split(" ");
		
		//System.out.println("index s2[0] = "+s2[0]);
		System.out.println("index s2[1] = "+s2[1]);
		//System.out.println("index s2[2] = "+s2[2]);
		//System.out.println("index s2[3] = "+s2[3]);
		
		String[] s3=s1[2].split(" ");
		//System.out.println("index s3[0] "+s3[0]);
		System.out.println("index s3[1] "+s3[1]);
		//System.out.println("index s3[2] "+s3[2]);

		
		driver.findElement(By.id("txtUsername")).sendKeys(s2[1]);
		driver.findElement(By.id("txtPassword")).sendKeys(s3[1]);
		
		driver.findElement(By.id("btnLogin")).click();
		
//		Thread.sleep(4000);
//		driver.close();
	}

}
