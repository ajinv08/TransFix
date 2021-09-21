package testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {

	Properties props;
	FileInputStream fiss;
	WebDriver drives;
	Actions action;
	
    @BeforeTest(alwaysRun=true)
	public void testStarts () throws IOException {
	System.out.println("JTC4XML Class-Test Starting and comes here searching codes");
	props = new Properties();
	fiss = new FileInputStream("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\Javaclasses\\src\\testNG\\property.properties");
	props.load(fiss);
	System.setProperty(props.getProperty("chromeKeya"), props.getProperty("chromePatha"));
	drives = new ChromeDriver();
	drives.get(props.getProperty("qaUrlb"));
	drives.manage().window().fullscreen();
	drives.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	


	}



	@AfterTest(alwaysRun=true)
	public void testFinished() {
	drives.quit();
	}


	
@BeforeMethod
	public void dataDrivenOpener() {
	drives.get("https://www.amazon.com/");
}

@AfterMethod
	public void dataDrivenCloser() {

}


@Test (dataProvider="getDatasFromDataprovider", priority=6, groups= {"Reg-Aji-Self-Data","Regression-Minor"})
 	public void signInNegativeLogin(String email, String password) {
	drives.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
	WebElement signIn=drives.findElement(By.xpath("//input[@id='ap_email']"));
	signIn.sendKeys(email);
	drives.findElement(By.xpath("//span[@id='continue']")).click();
	Assert.assertTrue(drives.findElement(By.xpath("//li/span[@class='a-list-item']")).isDisplayed());
	drives.get(props.getProperty("qaUrlb"));
	
}

@ DataProvider
	public Object[][] getDatasFromDataprovider(){
		return new Object[][] 
		{
			{"test11@wrongemail.com","wrongpassword11"},{"test12@wrongemail.com","wrongpassword12"},
			{"test13@wrongemail.com","wrongpassword13"},{"test14@wrongemail.com","wrongpassword14"},
			{"test15@wrongemail.com","wrongpassword15"}
			
			
		};
	}
}