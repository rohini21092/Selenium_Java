package propertyFileOprations;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationTestingByPropertyFile {

	public static void main(String[] args) throws IOException, InterruptedException {

		FileInputStream fis=new FileInputStream(".\\testData\\appData.properties");
		Properties prop=new Properties();
		prop.load(fis);

		String url=prop.getProperty("appUrl");
		System.out.println("Applicaition URL: "+url);
		
//		System.out.println(prop.getProperty("username"));
//		System.out.println(prop.getProperty("password"));
//		System.out.println(prop.getProperty("loginPageTitle"));
		
		String fname = prop.getProperty("firstname");
		String lname = prop.getProperty("lastname");
		String add =prop.getProperty("address");
		String mail = prop.getProperty("email");
		String phone = prop.getProperty("phNo");
		String gender = prop.getProperty("Gender");
		String skill = prop.getProperty("skills");
		String con = prop.getProperty("country");
		String dobY = prop.getProperty("year");
		String dobM= prop.getProperty("month");
		String dobD = prop.getProperty("day");
		String password = prop.getProperty("pass");
		String repassword = prop.getProperty("repass");
		
		
		System.setProperty("webdriver.chrome.driver", ".//executables//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys(fname);
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(lname);
		driver.findElement(By.cssSelector("div[class='col-md-8 col-xs-8 col-sm-8']>textarea")).sendKeys(add);
		driver.findElement(By.xpath("//div[@id='eid']/input")).sendKeys(mail);;
		driver.findElement(By.cssSelector("div[class='col-sm-6 col-md-6 col-xs-12']>form>div:nth-of-type(4)>div>input")).sendKeys(phone);
		//driver.findElement(By.className("div[class='col-sm-6 col-md-6 col-xs-12']>form>div:nth-of-type(5)>div>label:nth-of-type(2)")).click();
		driver.findElement(By.id("checkbox2")).click();
		//driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']/div")).click();
		
		WebElement drop1 = driver.findElement(By.id("Skills"));
		Select s1 = new Select(drop1);
		System.out.println(s1.isMultiple());
		s1.selectByVisibleText(skill);
		
		WebElement drop2 = driver.findElement(By.id("countries"));
		Select s2 = new Select(drop2);
		s2.selectByIndex(0);
		
	//	driver.findElement(By.cssSelector("span[class='select2-selection select2-selection--single']>span")).click();
		
		WebElement drop3 = driver.findElement(By.id("yearbox"));
		Select s3= new Select(drop3);
		s3.selectByVisibleText(dobY);
		
		WebElement drop4 = driver.findElement(By.cssSelector("form[id='basicBootstrapForm']>div:nth-of-type(11)>div:nth-of-type(2)>select"));
		Select s4= new Select(drop4);
		s4.selectByVisibleText(dobM);
		
		WebElement drop5 = driver.findElement(By.id("daybox"));
		Select s5= new Select(drop5);
		s5.selectByVisibleText(dobD);
		
		driver.findElement(By.id("firstpassword")).sendKeys(password);
		driver.findElement(By.id("secondpassword")).sendKeys(repassword);
		
		driver.findElement(By.id("submitbtn")).click();
		Thread.sleep(6000);
		//driver.findElement(By.id("Button1")).click();
		
	}

}
