package seleniumPkg;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenShotsHandling {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
		WebDriver drives = new ChromeDriver();
		drives.get("https:\\www.amazon.com");
		drives.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait expWait = new WebDriverWait(drives,20);
		WebElement search = drives.findElement(By.cssSelector("#twotabsearchtextbox"));
		expWait.until(ExpectedConditions.visibilityOf(search));
		Actions mkAct = new Actions(drives);
		mkAct.moveToElement(search).click().sendKeys("Testing Memory").build().perform();
		
		File screenshot = search.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File ("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\Javaclasses\\src\\seleniumPkg\\test.png"));
		
		File fullshot = ((TakesScreenshot)drives).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fullshot, new File("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\Javaclasses\\src\\seleniumPkg\\test2.png"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//screen shot of a particular web element 
		//File screenShotFile = search.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screenShotFile,new File("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\Javaclasses\\src\\seleniumPkg\\ScreenShot060421.png" ));
		//FileUtils.copyFile(drives.findElement(By.cssSelector("#twotabsearchtextbox")).getScreenshotAs(OutputType.FILE), new File("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\Javaclasses\\src\\seleniumPkg\\ScreenShot060421.png"));
		
		//screen shot of a web page
		
	//	File pageShotFile = ((TakesScreenshot)drives).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(pageShotFile,new File("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\Javaclasses\\src\\seleniumPkg\\FullScreenShot060421.png" ));
		
		
		Thread.sleep(5000);
		drives.close();
	}

}
