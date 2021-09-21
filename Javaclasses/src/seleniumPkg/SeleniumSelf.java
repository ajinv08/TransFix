package seleniumPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSelf {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe\\");
		WebDriver driverObject = new ChromeDriver();
		
		driverObject.get("https://www.walmart.com");
		driverObject.close();

		//Web Elements
			/*
			 1. Text - Type
			 2. Button - Click / carriage return key
			 3. Menu
			 4. Link/HyperLink
			 5. Images
			 6. Radio Button
			 7. List Box / Drop Down Box
			 8. check box
			 9. table
			 */
		//Web Elements Locating Strategy
			/*
			 1. Name
			 2. ID
			 3. ClassName
			 4. Link Text
			 5. Partial Link Text
			 6. XPath
			 7. Css selector
			 8. TagName
			 
			*/
		
	}

}
