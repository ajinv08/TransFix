package seleniumPkg;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class WebElementsAsgnmntAmazon {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(15000);
		
		/* WEB ELEMENTS
		 * 1. Text Area - some thing we can type
		 * 2. Radio Button - eg : male / female , round trip / one way
		 * 3. Table - Interactive / Informative - eg: Calender / price list 
		 * 4. Images- Interactive / Informative
		 * 5. check boxes - eg : brands, suppliers , etc
		 * 6. Menu - statice / dynamic
		 * 7. Button - enter / click - to do some function or 
		 * 8. List Box / Dropdown box - eg: countries to chose
		 * 9. Link / hyperlink
		 * 
		 * 
		 * 
		 * LOCATING STRATEGY
		 * 
		 * 1. Name          - attribute name, 1st choice, mostly  unique
		 * 2. id            -  attribute id, 1st choice, mostly  unique
		 * 3. Css selector
		 * 4. X Path
		 * 5. Class name   - attribute class
		 * 6. Tag Name     -1st field in the dom element
		 * 7. Link Text    
		 * 8. Partial Link Text
		 * 
		 */
		
		//WebElement inputStrategy = driver.findElement(By.name("input"));
		//List<WebElement> sta = driver.findElements(By.tagName("input"));
		//System.out.println(sta.size());
		
		//1. Text Area - some thing we can type => name & id
		
		driver.findElement(By.name("field-keywords")).sendKeys("Caterpillar Shoes for Men");
		Thread.sleep(1000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
		
		//2. Images- Interactive / Informative  ==> id
		driver.findElement(By.id("icp-nav-flyout")).click();
		Thread.sleep(1000);
		
		//3. Radio Button ==> id & cssSelector
		
		driver.findElement(By.id("icp-sl-t-hint")).click();
		Thread.sleep(1000);	
		driver.findElement(By.cssSelector("#customer-preferences > div > div > form > "
				+ "div.a-row > div.a-column.a-span7 > div:nth-child(6) > div > label > i")).click();
		Thread.sleep(1000);	
		
		//4a. Click on the Sign In Page, Enter the Email, click submit, can you record the response?
		
		//4b. Click on the Sign In Page, Enter the telephone#, click submit, can you record the response?
		
		driver.findElement(By.id("nav-link-accountList-nav-line-1" )).click();
		Thread.sleep(1000);	
		driver.findElement(By.id("ap_email")).sendKeys("wrong@wrong.com");
		Thread.sleep(1000);
		driver.findElement(By.id("continue" )).click();
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("WrongPassword@12345");
		driver.findElement(By.id("signInSubmit" )).click();
		Thread.sleep(1000);
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Best Sellers")).click();
		Thread.sleep(10000);
		driver.findElement(By.partialLinkText("Audible")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("nav-swmslot" )).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Best Sellers")).click();
		Thread.sleep(10000);
		
		List<WebElement> homeWidget= driver.findElements(By.partialLinkText("https://www.amazon.com"));
		System.out.println(homeWidget.size());
		
		
		
		driver.close();}}
