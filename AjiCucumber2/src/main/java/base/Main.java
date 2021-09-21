package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static WebDriver drives;
	
	public Main() {
	drives = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
	drives.get("http://demo.guru99.com/test/newtours/index.php");
	drives.manage().window().fullscreen();
	drives.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
}
