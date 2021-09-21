package testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frames {
	
	JustTestCasesforXMLStudy dd = new JustTestCasesforXMLStudy();

	
	
	
	@BeforeTest(alwaysRun=true)
	public void testStarts () throws IOException {
	System.out.println("JTC4XML Class-Test Starting and comes here searching codes");
	dd.props = new Properties();
	dd.fiss = new FileInputStream("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\Javaclasses\\src\\testNG\\property.properties");
	dd.props.load(dd.fiss);
	System.setProperty(dd.props.getProperty("chromeKeya"), dd.props.getProperty("chromePatha"));
	dd.drives = new ChromeDriver();
	dd.drives.get(dd.props.getProperty("qaUrlb"));
	dd.drives.manage().window().fullscreen();
	dd.drives.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}



	@AfterTest(alwaysRun=true)
	public void testFinished() {
		dd.drives.quit();
	}
	
	@BeforeMethod
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
		dd.drives = new ChromeDriver();
		dd.drives.get("https://www.amazon.com/");
		dd.drives.manage().window().maximize();
		dd.drives.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	
	@AfterMethod
		public void closeDown() {
		dd.drives.close();
		}
	
	@Test (enabled =true,timeOut = 15000,priority=11, groups= {"SmokeTest","Reg-Aji-Self","Regression-Minor"}) 
	public void frameTest() throws InterruptedException {
		dd.drives.findElement(By.id("glow-ingress-line2")).click();
               
		dd.drives.switchTo().frame(0);
		
		
		//drives.findElement(By.xpath("//span[contains(text(),'Sign in to ')]")).click();
		//drives.findElement(By.xpath("//span[@id='GLUXSignInButton']/span")).click();
		//drives.findElement(By.xpath("//span[@class='a-button-text a-declarative']/parent::span")).click();
		Select newsel = new Select (dd.drives.findElement(By.xpath("//*[@id='GLUXCountryList']")));
		newsel.selectByIndex(5);
		
		
		Thread.sleep(2000);
		
		
		
	}
}
