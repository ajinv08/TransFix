package seleniumPkg;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
		WebDriver drives = new ChromeDriver();
		drives.get("https://www.spicejet.com");
		
		WebElement flight = drives.findElement(By.xpath("//span[text()='Flights']"));
		// declaring implicit wait of 10 seconds
		drives.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//explicit wait
//		WebDriverWait expWait = new WebDriverWait(drives,20);
//		expWait.until(ExpectedConditions.elementToBeClickable(flight));
//		expWait.until(ExpectedConditions.visibilityOf(flight));
//		flight.click();
		
		
		//FluentWait
		
		Wait fluWait = new FluentWait(drives).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1)).ignoring(Exception.class);
		fluWait.until(ExpectedConditions.visibilityOf(flight));		
		flight.click();
		
		
		drives.close();
		

	}

}
