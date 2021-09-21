package testNG;


import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;


public class JustTestCasesforXMLStudy {
	
Properties props;
FileInputStream fiss;
Actions action;
WebDriver drives;

//@BeforeSuite
public void fullSuiteStarts(){
	System.out.println("JTC4XML Class-Suite Starting and comes here searching codes");
		
}
	
//@AfterSuite
public void allSuiteCloses(){
	System.out.println("JTC4XML Class-Suite closing and comes here searching codes");
		
}



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


@BeforeGroups
public void groupsStarts() {
	System.out.println("JTC4XML Class-Various Groups Starting and comes here searching codes");
}

@AfterGroups
public void groupsCloses() {
	System.out.println("JTC4XML Class-Each Group Closes and comes here searching codes");
}

@BeforeClass
public void classStarts() {
	System.out.println("JTC4XML Class-Various classes Starting and comes here searching codes");
}

@AfterClass
public void classCloses() {
	System.out.println("JTC4XML Class-Each Class Closes and comes here searching codes");
}



@BeforeMethod
	public void xmlExperimentStarts() {
	System.out.println("individual methods from different class does not go for own beforemethods.");
	drives.get(props.getProperty("qaUrlb"));
	
}
	

@AfterMethod
	public void xmlExperimentsOver() {
	// no codes after each method required now
}
	
//1. test the customer service link	
@Test (priority=1,timeOut=5000, groups= {"SmokeTest","Regression-Minor"})
public void customerServiceLinkTest () {
	drives.findElement(By.xpath("//div[@id='nav-xshop-container']/div/a[@data-csa-c-content-id='nav_cs_customerservice_02b048349c1346189acd49260ffb561e']")).click();
	Assert.assertEquals(drives.getTitle(), "Amazon.com Help: Help & Customer Service");
		
}
//2. test the language selection menu functionality.
@ Test (priority=2,timeOut=15000, groups= {"SmokeTest","Regression-Minor"})
public void languageToggleTest() throws InterruptedException, IOException {
	WebElement languageSelector = drives.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-us']"));
	action = new Actions(drives);
	//action.clickAndHold(languageSelector).build().perform();
	//drives.switchTo().frame(0);
	//drives.findElement(By.xpath("//*[@id='nav-flyout-icp']/div[2]/a[1]/span")).click();
	//*[@id="nav-flyout-icp"]/div[2]/span[1]/span  - spanish
	//*[@id="nav-flyout-icp"]/div[2]/a[1]/span - english
	languageSelector.click();
	WebElement englishLanguage= drives.findElement(By.xpath("//div/div/label/span[@class='a-label a-radio-label'][contains(text(),'ES')]"));
	Assert.assertTrue(englishLanguage.isDisplayed());
	englishLanguage.click();
	File fullshot1 = ((TakesScreenshot)drives).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(fullshot1, new File("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\Javaclasses\\src\\testNG\\SpanishLanguageSelect.png"));
	
	
	
	//drives.findElement(By.xpath("//*[@id='customer-preferences']/div/div/form/div[1]/div[1]/div[2]/div")).click();
	WebElement spanishLanguage= drives.findElement(By.xpath("//div/div/label/span[@class='a-label a-radio-label'][contains(text(),'EN')]"));
	Assert.assertTrue(spanishLanguage.isDisplayed());
	spanishLanguage.click();
	File fullshot2 = ((TakesScreenshot)drives).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(fullshot2, new File("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\Javaclasses\\src\\testNG\\EnglishLanguageSelect.png"));
	
		
}

	
//3. check the shopping cart emblem and the page title - Shopping Cart

@Test( timeOut=15000, priority=3, groups= {"SmokeTest","Regression-Minor"})
public void shoppingCart() {
	WebElement shoppingCart=drives.findElement(By.cssSelector("#nav-cart"));
	shoppingCart.click();
	Assert.assertTrue(drives.getTitle().contains("Shopping Cart"));
		
	
}

//4. check the All Link Button in the second line of Menu

@Test( timeOut=15000, priority=4, groups= {"SmokeTest","Regression-Minor"})
public void allDptLinkCheck() throws InterruptedException {
	
	drives.findElement(By.cssSelector("#nav-hamburger-menu")).click();
	WebElement allDeptEchoAlexa=drives.findElement(By.xpath("//a[@class='hmenu-item'][@data-menu-id='4']"));
	allDeptEchoAlexa.click();
	WebElement allNewEchoShow8=drives.findElement(By.xpath("//a[@class='hmenu-item'][.='All-New Echo Show 8']"));
	allNewEchoShow8.click();
	System.out.println(drives.getTitle());
	Assert.assertTrue(drives.getTitle().contains("All-New Echo Show 8"));
	
}

//5. scroll down to the bottom of the Amazon home page. Click on Amazon business. Locate and check the presence 
//	 of the Amazon business emblem  		

@Test( timeOut=15000, priority=5, groups= {"SmokeTest","Regression-Minor"})
public void homeBusinessEmblemCheck() throws InterruptedException {
	action = new Actions(drives);
	action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
	sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
	sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
	sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
	drives.findElement(By.xpath("//table[@class='navFooterMoreOnAmazon']/tbody/tr[3]/td[3]")).click();
	WebElement homeBusinessEmblem= drives.findElement(By.cssSelector(".primary-navigation__bottom__logo"));
	Assert.assertTrue(homeBusinessEmblem.isEnabled());
}







}
