package seleniumPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		
		//1. Set the System - which browser and where is the driver located in the system		
		System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
		
		//2. Instance of browser new ChromeDriver () and its parent class is imported chrome.ChromeDriver
		//2a. Parent Class Reference and reference name => WebDriver & driver
		//2b. Import the Parent Class for the reference => WebDriver
		WebDriver driver = new ChromeDriver();
		
		// 3. Load the application which we are testing = here the application is amazon
		driver.get("https://www.amazon.com");
		
		// 4. write the various test cases and execute.
		
			// test case1.
			// test case2.
		    // :
			// :
			// test case n.
		
		//5. close the browser
		driver.close();

	}}
