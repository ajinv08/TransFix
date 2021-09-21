package seleniumPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableCalendarAlertWindow {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.guru99.com/test/newtours/index.php");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
			driver.close();

			// see video on 05/19/21
			// try table 
			// try calendar
	}

}
