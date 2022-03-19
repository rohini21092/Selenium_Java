package handlingMultipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownList {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//executables//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement dropdn = driver.findElement(By.id("carselect"));
		Select dropdnSelect = new Select(dropdn);
		System.out.println("dropdown is multiple : "+dropdnSelect.isMultiple());
		
		System.out.println("the first selected options : "+dropdnSelect.getFirstSelectedOption().getText());
		
		List<WebElement> option = dropdnSelect.getOptions();
		
		System.out.println("count in list : "+option.size());
		for(int i=0;i<option.size();i++) {
			System.out.println(" option in list : "+option.get(i).getText());
		}
		Thread.sleep(2000);
		dropdnSelect.selectByIndex(0);
		System.out.println("selected option is " +dropdnSelect.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		dropdnSelect.selectByValue("benz");
		System.out.println("selected option is " +dropdnSelect.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		dropdnSelect.selectByVisibleText("Honda");
		System.out.println("selected option is " +dropdnSelect.getFirstSelectedOption().getText());
		
		System.out.println("*****************************");
		
		WebElement multi = driver.findElement(By.id("multiple-select-example"));
		Select mSelect = new Select(multi);
		
		System.out.println(" dropdown is multiselect : "+mSelect.isMultiple());

		for(int i=0;i<mSelect.getOptions().size();i++) {
			System.out.println("option in multi select dropdown list : "+mSelect.getOptions().get(i).getText());
		}
		Thread.sleep(3000);
		mSelect.selectByIndex(1);
		Thread.sleep(2000);
		mSelect.selectByValue("apple");
		Thread.sleep(2000);
		mSelect.selectByVisibleText("Peach");
		
		for(int i=0;i<mSelect.getOptions().size();i++) {
			System.out.println(mSelect.getAllSelectedOptions().get(i).getText());
		}
	}

}
