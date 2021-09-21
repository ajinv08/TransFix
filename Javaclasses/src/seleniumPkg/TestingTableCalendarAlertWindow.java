package seleniumPkg;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingTableCalendarAlertWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\QA Drivers\\chromedriver.exe");
		WebDriver drives = new ChromeDriver();
		drives.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		drives.get("http://demo.guru99.com/test/newtours/index.php");
		drives.manage().window().maximize();

		//String flightRate = drives.findElement(By.cssSelector("table[width='100%']>tbody>tr:nth-child(3)>td>table>tbody>tr:nth-child(3)>td:nth-child(2)")).getText();
			
//		String flightRate = drives.findElement(By.xpath("//table[@width='270']/tbody/tr[3]/td[2]")).getText();
//		if (flightRate.equals("$168")) 
//			System.out.println("Flight Rate is correct");
//		else
//			System.out.println("Flight Rate is not correct");

//		drives.get("https://www.spicejet.com/");
//		drives.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
//		WebElement dateTry = drives.findElement(By.xpath("//div[contains(@class,'ui-datepicker-group-last')]/table/tbody/tr[4]/td[5]"));
//		System.out.println(dateTry.getText());
		
		
//		drives.get("http://demo.guru99.com/test/delete_customer.php");
//		drives.findElement(By.xpath("//input[@name='cusid']")).sendKeys("TestDelete");
//		Thread.sleep(2000);
//		drives.findElement(By.xpath("//input[@name='submit']")).click();
//		Thread.sleep(2000);
//		String alertTxt = drives.switchTo().alert().getText();
//		drives.switchTo().alert().accept();
//		Thread.sleep(2000);
//		System.out.println(alertTxt);
		
		drives.get("https://www.spicejet.com/");
			
		drives.findElement(By.xpath("//a[text()='Cargo']")).click();
		
		String mainWindow=drives.getWindowHandle();
		
		Set<String> whandles=drives.getWindowHandles();
		Iterator<String> it=whandles.iterator();
		String cargoWindow=it.next();
			
		if(mainWindow.equalsIgnoreCase(cargoWindow))
			cargoWindow=it.next();
				
		drives.switchTo().window(cargoWindow);
		drives.findElement(By.xpath("//a[text()=' Services ']")).click();
		drives.findElement(By.xpath("//a[contains(text(),'Door to Door')]")).click();
		drives.findElement(By.xpath("//a[contains(text(),'Enquiry Form')]")).click();
		drives.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Testing Name First");
		drives.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Testing Name Last");
		drives.findElement(By.xpath("//input[@name='Email']")).sendKeys("Testing Email Address");
		drives.findElement(By.xpath("//input[@name='Phone']")).sendKeys("000122345745");
		drives.findElement(By.xpath("//input[@name='Company']")).sendKeys("Testing Company");
		drives.findElement(By.xpath("//textarea[@name='Comment']")).sendKeys("Testing the happy comment field.. we can test the maximum field length of 500..but not now.");
		//drives.findElement(By.xpath("//select[@name='City']")).click();
		Select selCity = new Select(drives.findElement(By.xpath("//select[@name='City']")));
		selCity.selectByIndex(3);
		selCity.selectByValue("BADDI");
		Thread.sleep(3000);
		drives.findElement(By.xpath("//form[@action='saveEnquiry'][@method='post']/div[5]/div/button")).click();
		drives.close();
		drives.switchTo().window(mainWindow);
		
		
		
		Thread.sleep(2000);
		drives.close();
	

}}
