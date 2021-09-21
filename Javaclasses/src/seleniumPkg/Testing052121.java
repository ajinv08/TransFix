package seleniumPkg;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing052121 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
		WebDriver drives = new ChromeDriver();
		drives.get("https:\\amazon.com");
		drives.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000, 5000);
//		drives.findElement(By.name(""));
//		drives.findElement(By.id(""));
//		drives.findElement(By.linkText(" "));
//		drives.findElement(By.partialLinkText(""));
//		drives.findElement(By.className(" "));
//		drives.findElement(By.tagName(""));
//		drives.findElement(By.cssSelector(""));
//		drives.findElement(By.xpath(""));
		
		
//		WebElement testText = drives.findElement(By.id("twotabsearchtextbox"));
//		testText.sendKeys("New Web Driver with Chrome? Working?");
//		testText.click();

		
//		List<WebElement> listRefName= drives.findElements(By.xpath("//div[contains(@class,'nav-left')]"));
//		System.out.println(listRefName.size());
//		Iterator<WebElement> it = listRefName.iterator();
//		while (it.hasNext()){
//		System.out.println(it.next());
//		}
		
		
//		Select selectRefName = new Select(drives.findElement(By.xpath("//select[@name='url']")));
//		 selectRefName.selectByVisibleText("Baby");
//		 Thread.sleep(2000);
//		 selectRefName.selectByIndex(2);
//		 Thread.sleep(2000);
//		 selectRefName.selectByValue("search-alias=stripbooks");
//		 Thread.sleep(2000);	
		
		
		//drives.findElement(By.xpath("//input[@id='twotabsearchtextbox'] ")).sendKeys("Chkg Xpath Syntax");
		//drives.findElement(By.xpath("//span[text()='© 1996-2021, Amazon.com, Inc. or its affiliates']")).click();
		
		//drives.findElement(By.xpath("//span[contains(@class,'nav-line-2')][@id='glow-ingress-line2']")).click();
		
		//drives.findElement(By.xpath("//div[contains(@class,'nav-fill')]/div/form")).click();
		
		//drives.findElement(By.xpath("//span[@id='nav-search-label-id']/parent::div"));
		
		
		
		
		//String baseurl = drives.getTitle();
		//System.out.println(baseurl);
		
		//drives.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("chkg css selector gen syntax");
		
		//drives.findElement(By.cssSelector("span[class='nav-line-2 nav-progressive-content'][id='glow-ingress-line2']")).click();
		
		//drives.findElement(By.cssSelector("#glow-ingress-line2")).click();
		
		//drives.findElement(By.cssSelector(".nav-sprite nav-progressive-attribute")).click();
		
		// drives.findElement(By.cssSelector(" div>input[type='text']")).sendKeys("Parent Tag and Child CSS Working");
		// drives.findElement(By.cssSelector("span:contains('© 1996-2021, Amazon.com, Inc. or its affiliates')")).click();
		
		
		drives.get("https:\\spicejet.com");

		drives.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']")).click();
		
		
		Thread.sleep(2000);
		drives.close();

	}

}
