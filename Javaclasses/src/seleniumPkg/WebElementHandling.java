package seleniumPkg;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebElementHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("http:/demo.guru99.com/test/newtours/index.php");
		
		// Text Area - Web element
		
		WebElement usernameTxtField = driver.findElement(By.name("wrong"));
		usernameTxtField.sendKeys("Testtheuser123");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("testpass");
		Thread.sleep(3000);
		driver.findElement(By.name("submit")).submit();
		Thread.sleep(3000);
		
		// Link / partial link text
		
		
		driver.findElement(By.partialLinkText("REGISTER")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Flights")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Business")).click();
		Thread.sleep(3000);
		
		// TAGNAME
		
		List<WebElement> elementsWithInputTag = driver.findElements(By.tagName("input"));
		System.out.println("Number of Web elements with tag Name as \"input\" " +elementsWithInputTag.size()) ;
		
		
		driver.get("https:/amazon.com");
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
