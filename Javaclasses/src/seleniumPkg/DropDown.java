package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
	WebDriver drives = new ChromeDriver();
	drives.get("https://www.amazon.com/");
	drives.manage().window().maximize();

	Select selref = new Select(drives.findElement(By.id("searchDropdownBox")));
	
	selref.selectByIndex(0);
	Thread.sleep(1000);
	selref.selectByValue("search-alias=audible");
	Thread.sleep(1000);
	selref.selectByVisibleText("All Departments");
	Thread.sleep(1000);
		
	
	drives.close();
	
	}

}
