package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BeforeTestNG {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
		WebDriver drives = new ChromeDriver();
		drives.get("http://demo.guru99.com/test/newtours/index.php");
		drives.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//1.Positive Login Fn
		
		//2.Negative Login Fn
		
		//3.Positive Registration Fn
		
		drives.close();
	}

}
