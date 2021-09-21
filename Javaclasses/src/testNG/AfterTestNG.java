package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AfterTestNG {
	
	WebDriver drives;
	
	@BeforeMethod
	public void initialization() {
		
		// initialization
		System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
		WebDriver drives = new ChromeDriver();
		drives.get("http://demo.guru99.com/test/newtours/index.php");
		drives.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	
	@AfterMethod
	public void tearDown() {
		drives.close();
	}
	
	
	@Test
	public void negativeLoginTest() {
		//Test Script
		//validation point
	}
	
	@Test
	public void test2() {
		//Test Script
		//validation point
	}
	
	@Test
	public void test3() {
		//Test Script
		//validation point
		
	}
	
	
	
}



