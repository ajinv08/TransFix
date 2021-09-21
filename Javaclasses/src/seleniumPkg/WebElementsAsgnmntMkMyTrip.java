package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsAsgnmntMkMyTrip {

	/* WEB ELEMENTS
	 * 1. TEXT
	 * 2. BUTTON
	 * 3. RADIO BUTTON
	 * 4. TABLE
	 * 5. CHECK BOX
	 * 6. MENU
	 * 7. LIST BOX /DROP BOX
	 * 8. IMAGE
	 * 9. LINK / HYPER LINK
	 * 
	 * LOCATING STRATEGY
	 * 1. NAME
	 * 2. ID
	 * 3. TAGNAME
	 * 4. CLASS NAME
	 * 5. LINK TEXT
	 * 6. PARTIAL LINK TEXT
	 * 7. CSS SELECTOR
	 * 8. X PATH
	 */
	
	//
		
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Serha is the best girl in the Universe");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();;
		Thread.sleep(2000);
		
		
		
		
		driver.close();
		
	}

}
