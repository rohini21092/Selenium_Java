package keybordMouseOpt;

import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropMouseOp {

	public static void main(String[] args) throws IOException, InterruptedException {

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver =new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		FileInputStream fis=new FileInputStream(".\\testData\\dragdrop.properties");
//		Properties prop =new Properties();
//		prop.load(fis);
//		
//		String url = prop.getProperty("URL");
//		driver.get(url);
//		driver.switchTo().frame(0);
//		// S1: Create an instance of Actions class and pass webdriver instance as an argument to its constructor
//		Actions action = new Actions(driver);
//		//Identify source and target element for Drag and Drop
//		WebElement src= driver.findElement(By.id("draggable"));
//		WebElement target = driver.findElement(By.id("droppable"));
//		//call dragAndDrop() of actions class
//		Thread.sleep(2000);
//		action.dragAndDrop(src, target).build().perform();
//		Thread.sleep(2000);
//		action.dragAndDropBy(src, 50, 50).build().perform();
		
		
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  
		  FileInputStream fis =new FileInputStream(".//testData/dragdrop.properties");
		  Properties prop = new Properties();
		  prop.load(fis);
		  
		  String url = prop.getProperty("URL");
		  driver.get(url);
		  
		  driver.manage().window().maximize();
		  
		  driver.switchTo().frame(0);
		  WebElement src = driver.findElement(By.id("draggable"));
		  WebElement target = driver.findElement(By.id("droppable"));
		  
		  Actions action = new Actions(driver);
		
		  action.dragAndDrop(src, target).build().perform();
		  //or
		  action.dragAndDropBy(src, 50, 20).build().perform();
		
	}

}
