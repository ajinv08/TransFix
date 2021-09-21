package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdmodel.font.encoding.Encoding;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class KeywordsAndAnnotations {

JustTestCasesforXMLStudy dd = new JustTestCasesforXMLStudy();
	
	
	@BeforeMethod
	public void dataDrivenOpener() {
	dd.drives.get("https://www.amazon.com/");
}

@AfterMethod
	public void dataDrivenCloser() {

}
	
	

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
	
		
	
	
	
	
	
	
	//Test 1 - Access the Department and set it by chosen index value.
	
	@Test (enabled =true,timeOut = 2000,priority=7, groups= {"Reg-Aji-Self","Regression-Minor"})
	public void setDepartment() throws IOException, InterruptedException {
		WebElement homeDepartment = dd.drives.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select departmentSelector = new Select(homeDepartment);
		departmentSelector.selectByIndex(9);
		File homeDepartmentSelectCheckingFile=homeDepartment.getScreenshotAs(OutputType.FILE);
		//byte[] homeDepartmentSelectCheckingFile2=homeDepartment.getScreenshotAs(OutputType.BYTES);
		//String decodeString = homeDepartmentSelectCheckingFile2.toString();
		FileUtils.copyFile(homeDepartmentSelectCheckingFile, new File("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\Javaclasses\\src\\testNG\\DptSelector.png"));
		//System.out.println("Test the Strings + Select Method " + String.valueOf(homeDepartmentSelectCheckingFile2));
		Assert.assertTrue(homeDepartment.isEnabled());
	}
	
	
	//Test 2 - Search the department by Text and get the page title and verify
	
	@Test (enabled =true,timeOut = 5000,priority=8, groups= {"Reg-Aji-Self","Regression-Minor"})
	public void searchDepartment() throws IOException {
		WebElement homeDepartment = dd.drives.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select departmentSelector = new Select(homeDepartment);
		String searchDepartmentText = "Appliances";
		departmentSelector.selectByVisibleText(searchDepartmentText);
		dd.drives.findElement(By.id("nav-search-submit-button")).click();
		Assert.assertTrue(dd.drives.getTitle().contains(searchDepartmentText));
	}
	
	
	//Test-3
	
	@Test (enabled =true,timeOut = 5000,priority=9, groups= {"Reg-Aji-Self","Regression-Minor"})
	
	public void primeAndTryfromFrame() throws InterruptedException {
		dd.action = new Actions(dd.drives);
		WebElement primeLink = dd.drives.findElement(By.xpath("//span[text()='Prime']"));
		dd.action.clickAndHold(primeLink).build().perform();
		dd.drives.switchTo().frame(0);
		dd.action.doubleClick().build().perform();
		//Thread.sleep(2000);
		//drives.findElement(By.xpath("//div[@class='prime-button-try']")).click();
		//drives.findElement(By.xpath("//div[@class='pin-nav-content-img']")).click();	
		dd.drives.findElement(By.xpath("//input[@value='Try Prime'][@class='prime-cta-signup-button-input']")).click();		
		
	}
	
	//Test-4
	
	@Test (enabled =true,timeOut = 5000,priority=10, groups= {"Reg-Aji-Self","Regression-Minor"})
	public void accountAndList() throws InterruptedException {
		dd.action = new Actions(dd.drives);
		WebElement accountList = dd.drives.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		dd.action.clickAndHold(accountList).build().perform();
		dd.drives.findElement(By.xpath("//span[text()='Music Library']")).click();
		System.out.println("Amazon Music Page Title is -> "+ dd.drives.getTitle()); 
		Assert.assertTrue(dd.drives.getTitle().contains("Amazon Music"));
		
				
		
	}
	
	//Test-5
	
	 @Test (enabled =true,timeOut = 5000,priority=11, groups= {"Reg-Aji-Self-Data","Regression-Minor"}) 
	 public void secondChanceLink() throws InterruptedException { 
		 dd.action = new Actions(dd.drives); 
		 dd.action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
	 		sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
	 		sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
	 		sendKeys(Keys.PAGE_DOWN).build().perform();
	 Thread.sleep(5000);
	 WebElement secondChanceElement = dd.drives.findElement(By.xpath("//span[contains(text(),'Pass it on,')]")); 
	 Assert.assertTrue(secondChanceElement.isEnabled());
	 secondChanceElement.click(); 
	 
	 }
	 	
	
	
	
}



