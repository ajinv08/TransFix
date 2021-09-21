package seleniumPkg;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseKeyBoardHandling {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
		WebDriver drives = new ChromeDriver();
		drives.get("https://www.bankofamerica.com/");
		drives.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		drives.manage().window().maximize();
		
		
		WebElement onlineID=drives.findElement(By.name("onlineId1"));
		WebElement passWord=drives.findElement(By.xpath("//input[@type='password']"));
		WebElement signIn=drives.findElement(By.xpath("//button[@type='submit'][@id='signIn']"));
		WebElement locations = drives.findElement(By.id("footer_bofa_locations"));
		
		
		WebDriverWait expWait = new WebDriverWait(drives,20);
		expWait.until(ExpectedConditions.visibilityOf(onlineID));
		
		Actions mkAct = new Actions(drives);
//		mkAct.moveToElement(onlineID).click().sendKeys("Test thru KeyBoard").build().perform();
//		mkAct.moveToElement(passWord).click().sendKeys("Test Pword").build().perform();
//		mkAct.moveToElement(signIn).click().build().perform();
		
		mkAct.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(5000);
		mkAct.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(5000);
		mkAct.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(5000);
		
		mkAct.moveToElement(onlineID).click().sendKeys("Test thru KeyBoard").build().perform();
		Thread.sleep(5000);
		mkAct.moveToElement(onlineID).click().sendKeys(Keys.END) .sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(5000);
		mkAct.moveToElement(onlineID).click().sendKeys(Keys.CLEAR).build().perform();
		Thread.sleep(5000);
		
		File LoginErrorMessage =onlineID.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(LoginErrorMessage, new File ("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\Javaclasses\\src\\seleniumPkg\\screenshot2.png"));
		
		
		String mWindow = drives.getWindowHandle();
		String cWindow ="";
		System.out.println(mWindow + " <-orignal windows->" + cWindow);
		locations.click();
		mWindow = drives.getWindowHandle();
		System.out.println(mWindow + " <-Location selected windows-> " + cWindow);
		
		WebElement hillSideLocn=drives.findElement(By.xpath("//a[@data-ga='List, Schedule an appointment - 15162']"));
		mkAct.moveToElement(hillSideLocn).click().build().perform();
		
		Set<String> wHandles=drives.getWindowHandles();
		Iterator<String> it =wHandles.iterator();
		if (mWindow.equalsIgnoreCase(it.next()))
		  cWindow=it.next();
		System.out.println(mWindow + " <- Appointment Selected windows->  " + cWindow);
		drives.switchTo().window(cWindow);
		Thread.sleep(3000);
		drives.findElement(By.xpath("//h3[text()='Investments with Merrill']")).click();
		drives.findElement(By.xpath("//label[text()='Retirement Planning']")).click();
		drives.findElement(By.xpath("//label[text()='Saving for a Large Purchase']")).click();
		Thread.sleep(3000);
		drives.findElement(By.xpath("//button[@id='nextBtnSubTopic']")).click();
		
		Thread.sleep(10000);
		drives.quit();
		
		
		
		

	}

}