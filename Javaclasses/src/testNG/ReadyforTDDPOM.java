package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReadyforTDDPOM {
	
	WebDriver drives;
	
	
	
	@BeforeMethod()
	public void inlMethod(){
		System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
		drives = new ChromeDriver();
		drives.get("http://demo.guru99.com/test/newtours/login.php");
		drives.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		drives.manage().window().maximize();
		}
	
	
	@AfterMethod
	public void closedown() {
		drives.close();
		
	}
	
	@FindBy (xpath="//input[@name='userName']")
	WebElement username;
	@FindBy (name ="password")
	WebElement password;
	@FindBy (xpath="//input[@name='submit']")
	WebElement  submit;
	
	@Test
	public void trialEntry() throws InterruptedException {
		drives.findElement(By.xpath("//input[@name='userName']")).sendKeys("trialmethod");
		Thread.sleep(5000);
		drives.findElement(By.name("password")).sendKeys("trial");
		Thread.sleep(5000);
		drives.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(5000);
		
		
	}
	
	
	
	
	
	
	
}
