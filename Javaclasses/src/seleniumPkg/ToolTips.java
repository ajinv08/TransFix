package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ToolTips {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
		WebDriver drives = new ChromeDriver();
		drives.get("http://demo.guru99.com/test/tooltip.html");
		drives.manage().window().maximize();
		Thread.sleep(2000);

		WebElement dnldicon = drives.findElement(By.id("download_now"));
		Actions act =new Actions(drives);
		act.moveToElement(dnldicon).click().build().perform();
		WebElement toolTipInsideText = drives.findElement(By.xpath("//div[@class='tooltip']/a"));
		System.out.println(toolTipInsideText.getText());
		
		Assert.assertEquals(toolTipInsideText.getText(), "What's new in 3.2"); // this report can be seen in TestNG  only
		
		drives.close();
		


	}

}
