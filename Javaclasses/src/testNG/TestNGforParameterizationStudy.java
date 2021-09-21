package testNG;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestNGforParameterizationStudy {
	
	WebDriver drives;
	
	
	@Parameters ({"chromeKey","chromePath","qaEnvUrl"})
	
	@BeforeTest (alwaysRun = true)
	public void inlMethods(String key, String path, String url) {
		System.setProperty(key, path);
		drives = new ChromeDriver();
		drives.get(url);
		drives.manage().window().fullscreen();
		drives.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
		
	@AfterTest (alwaysRun = true)
	public void closeMethod() {
		drives.quit();
	}
	
	
	@BeforeMethod (alwaysRun=true)
	public void eachMethodInlStep() {
		drives.findElement(By.linkText("REGISTER")).click();
	}
	
	
	
	@Test (groups={"group1","group2"}, dataProvider = "getDataGiver")
	public void testonDemoforStudy(String var1, String var2, String var3) throws IOException {
		drives.findElement(By.xpath("//input[@name='email']")).sendKeys(var1);
		drives.findElement(By.xpath("//input[@name='password']")).sendKeys(var2);
		drives.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(var2);
		drives.findElement(By.xpath("//input[@name='submit']")).click();
		Assert.assertTrue(drives.getCurrentUrl().equalsIgnoreCase(var3));
		
		WebElement registerSuccess=drives.findElement(By.xpath("//img[@width='492']"));
		File scrnshotElement = registerSuccess.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrnshotElement, new File("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\Javaclasses\\src\\testNG\\registerSuccessElement.png"));
		
		File scrnshotPage = ((TakesScreenshot)drives).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrnshotPage, new File("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\Javaclasses\\src\\testNG\\registerSuccessFullPage.png"));
		
		
	}
	
	@DataProvider (name="getDataGiver")
	public Object[][] getData(){
		return new Object[][] {
			{"data11@gmail.com","data12","http://demo.guru99.com/test/newtours/register_sucess.php"},{"data21@gmail.com","data22","http://demo.guru99.com/test/newtours/register_sucess.php"},
			{"data31@gmail.com","data32","http://demo.guru99.com/test/newtours/register_sucess.php"},{"data41@gmail.com","data42","http://demo.guru99.com/test/newtours/register_sucess.php"},
			{"data51@gmail.com","data52","http://demo.guru99.com/test/newtours/register_sucess.php"},{"data61@gmail.com","data62","http://demo.guru99.com/test/newtours/register_sucess.php"},
			{"data71@gmail.com","data72","http://demo.guru99.com/test/newtours/register_sucess.php"},{"data81@gmail.com","data82","http://demo.guru99.com/test/newtours/register_sucess.php"},
			
			};
		};
		
		
	}

