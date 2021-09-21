package seleniumPkg;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelenuimShortNotes {

	public static void main(String[] args) {
		// introduction - driver etc
		System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
		WebDriver driverObject = new ChromeDriver();
		driverObject.get("https://www.walmart.com");
		driverObject.close();
		// web elements
		/*
		 * 1. Text
		 * 2. Button - eg:Submit button
		 * 3. Radio Button - eg: one way / round way trip 
		 * 4. Check Box
		 * 5. List Box / Drop Down Box
		 * 6. Menu
		 * 7. Table
		 * 8. Link
		 * 9. Images
		 */
		
		// locating strategy
		/*
		 * 1. Name
		 * 2. id
		 * 3. link 
		 * 4. partial link text
		 * 5. CSS selector
		 * 6. X path
		 * 7. class name
		 * 8. tag name
		 */
		
		WebElement webelementreferncename = driverObject.findElement(By.name(""));  // element matching with given value
		List<WebElement> webelementreferncename2 = driverObject.findElements(By.className("")); // creates a list of elements whose class name matches with given value
		
	
		 // to send an input into the web element - .sendKeys("input text");
		 
		 webelementreferncename.sendKeys("");
		 
		 //to click on web element - .click();
		 webelementreferncename.click();
		
		 // to maximize the window
		 
		 driverObject.manage().window().fullscreen();
		 driverObject.manage().window().maximize();
		 
		// handling drop down
		 
		 Select selectrefName = new Select (driverObject.findElement(By.name("drop down element")));
		 selectrefName.selectByIndex(0);
		 selectrefName.selectByValue("");
		 selectrefName.selectByVisibleText("");
		
		// X-path Customization
		 
		 

	}}
