package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocatorOperations {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(2000);		
		WebElement fname = driver.findElement(By.id("firstName"));
		System.out.println("fname  enabled :"+fname.isEnabled());
		System.out.println("fname  displayed :"+fname.isDisplayed());
		System.out.println("class attribute value of fname: "+fname.getAttribute("class"));
		System.out.println("type attribute value of fname: "+fname.getAttribute("type"));
		System.out.println("placeholder attribute value of fname: "+fname.getAttribute("placeholder"));
		System.out.println("id attribute value of fname: "+fname.getAttribute("id"));
		fname.sendKeys("abc");
		
		System.out.println("**************");
		
		WebElement lname = driver.findElement(By.id("lastName"));
		System.out.println("lname  enabled :"+lname.isEnabled());
		System.out.println("lname  displayed :"+lname.isDisplayed());
		System.out.println("class attribute value of lname: "+lname.getAttribute("class"));
		System.out.println("type attribute value of lname: "+lname.getAttribute("type"));
		System.out.println("placeholder attribute value of lname: "+lname.getAttribute("placeholder"));
		System.out.println("id attribute value of lname: "+lname.getAttribute("id"));
		lname.sendKeys("xyz");

		
		System.out.println("**************");
		
		WebElement email = driver.findElement(By.id("userEmail"));
		System.out.println("email  enabled :"+email.isEnabled());
		System.out.println("email  displayed :"+email.isDisplayed());
		System.out.println("class attribute value of email: "+email.getAttribute("class"));
		System.out.println("type attribute value of email: "+email.getAttribute("type"));
		System.out.println("placeholder attribute value of email: "+email.getAttribute("placeholder"));
		System.out.println("id attribute value of email: "+email.getAttribute("id"));
		System.out.println("pattern attribute value of email: "+email.getAttribute("pattern"));
		email.sendKeys("abc@gmail.com");
		
		System.out.println("*************");
		
		WebElement radiobtn1 =driver.findElement(By.id("gender-radio-1"));
		System.out.println("radiobtn1 male is enabled :"+radiobtn1.isEnabled());
		System.out.println("radiobtn1 male is  displayed :"+radiobtn1.isDisplayed());
		System.out.println("radiobtn1 male is selected :"+radiobtn1.isSelected());
		System.out.println("class attribute value of radiobtn1 male: "+radiobtn1.getAttribute("class"));
		System.out.println("type attribute value of radiobtn1 male: "+radiobtn1.getAttribute("type"));
		System.out.println("id attribute value of radiobtn1 male: "+radiobtn1.getAttribute("id"));
		System.out.println("value attribute value of radiobtn1 male: "+radiobtn1.getAttribute("value"));
		
		WebElement element =driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
		Thread.sleep(4000);	
		element.click();
		System.out.println("element male is selected :"+element.isSelected());

		System.out.println("*************");

		WebElement radiobtn2 =driver.findElement(By.id("gender-radio-2"));
		System.out.println("radiobtn2 male is enabled :"+radiobtn2.isEnabled());
		System.out.println("radiobtn2 male is  displayed :"+radiobtn2.isDisplayed());
		System.out.println("radiobtn2 male is selected :"+radiobtn2.isSelected());
		System.out.println("class attribute value of radiobtn2 female: "+radiobtn2.getAttribute("class"));
		System.out.println("type attribute value of radiobtn2 female: "+radiobtn2.getAttribute("type"));
		System.out.println("id attribute value of radiobtn2 female: "+radiobtn2.getAttribute("id"));
		System.out.println("value attribute value of radiobtn2 female: "+radiobtn2.getAttribute("value"));
		
		WebElement element1 =driver.findElement(By.cssSelector("label[for='gender-radio-2']"));
		Thread.sleep(4000);	
		element1.click();
		System.out.println("element male is selected :"+element1.isSelected());
		
		System.out.println("*************");
		
		WebElement radiobtn3 =driver.findElement(By.id("gender-radio-3"));
		System.out.println("radiobtn3 other is enabled :"+radiobtn3.isEnabled());
		System.out.println("radiobtn3 other is  displayed :"+radiobtn3.isDisplayed());
		System.out.println("radiobtn3 other  is selected :"+radiobtn3.isSelected());
		System.out.println("class attribute value of radiobtn3 other: "+radiobtn3.getAttribute("class"));
		System.out.println("type attribute value of radiobtn3 other: "+radiobtn3.getAttribute("type"));
		System.out.println("id attribute value of radiobtn3 other: "+radiobtn3.getAttribute("id"));
		System.out.println("value attribute value of radiobtn3 other: "+radiobtn3.getAttribute("value"));
		
		WebElement element2 =driver.findElement(By.cssSelector("label[for='gender-radio-3']"));
		Thread.sleep(4000);		
		element2.click();
		System.out.println("element other is selected :"+element2.isSelected());
		
		System.out.println("*************");

		WebElement number = driver.findElement(By.id("userNumber"));
		System.out.println("number is enabled :"+number.isEnabled());
		System.out.println("number is  displayed :"+number.isDisplayed());
		System.out.println("class attribute value of number: "+number.getAttribute("class"));
		System.out.println("type attribute value of number: "+number.getAttribute("type"));
		System.out.println("id attribute value of number: "+number.getAttribute("id"));
		System.out.println("placeholder attribute value of radiobtn3 other: "+number.getAttribute("placeholder"));
		System.out.println("pattern attribute value of number: "+number.getAttribute("pattern"));
		System.out.println("minlength attribute value of number: "+number.getAttribute("minlength"));
		System.out.println("maxlength attribute value of number: "+number.getAttribute("maxlength"));
		number.sendKeys("5623158965");
		
		System.out.println("*************");

		WebElement sub = driver.findElement(By.className("subjects-auto-complete__indicators"));
		System.out.println("subject is enabled :"+sub.isEnabled());
		System.out.println("subject is  displayed :"+sub.isDisplayed());
		System.out.println("class attribute value: "+sub.getAttribute("class"));
		//sub.sendKeys("abcdefg");
		System.out.println("*************");

		WebElement checkBox=driver.findElement(By.id("hobbies-checkbox-1"));			
		WebElement element3=driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		System.out.println("checkBox  is enabled :"+checkBox.isEnabled());
		System.out.println("checkBox  is  displayed :"+checkBox.isDisplayed());
		System.out.println("checkBox  is selected :"+checkBox.isSelected());
		//element3.click();
		System.out.println("Using input for only selected: "+checkBox.isSelected()+":  "+element3.isDisplayed()+": "+element.isEnabled());
		//element3.click();
		System.out.println("Using input for only selected: "+checkBox.isSelected()+":  "+element3.isDisplayed()+": "+element.isEnabled());
		
		WebElement caddress=driver.findElement(By.id("currentAddress"));
		System.out.println("caddress  enabled :"+caddress.isEnabled());
		System.out.println("caddress  displayed :"+caddress.isDisplayed());
		System.out.println("class attribute value of caddress: "+caddress.getAttribute("class"));
		System.out.println("rows attribute value of caddress: "+caddress.getAttribute("rows"));
		System.out.println("cols attribute value of caddress: "+caddress.getAttribute("cols"));
		System.out.println("placeholder attribute value of caddress: "+caddress.getAttribute("placeholder"));
		System.out.println("id attribute value of caddress: "+caddress.getAttribute("id"));
		caddress.sendKeys("abcfsdghfgh sfdhjgk, sfghfjk");
		
		
		System.out.println("*************");
		//scrolling page
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		
		System.out.println("*************");
		
		Thread.sleep(2000);		
		WebElement signupbtn = driver.findElement(By.id("submit"));
		System.out.println("signUp btn enabled :"+signupbtn.isEnabled()+" signUp btn is displayed : "+signupbtn.isDisplayed());
		System.out.println("SignUp btn name is : "+signupbtn.getText());		
		System.out.println("class attribute value: "+signupbtn.getAttribute("class"));
		System.out.println("type attribute value: "+signupbtn.getAttribute("type"));
		
		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		System.out.println("Button count :"+buttons.size());
		
		for(int i=0;i<buttons.size();i++) {
			System.out.println(buttons.get(i).getAttribute("class"));
		}
		
		signupbtn.click();
		
	}

}
