package seleniumPkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TransFix {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  // - maximize window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://transfotechacademy.com/");
		Actions act = new Actions(driver);
		
//		WebElement tranCourse = driver.findElement(By.xpath("//li[@id='menu-item-3850']"));
//		//tranCourse = driver.findElement(By.id("menu-item-3850"));
//		//tranCourse = driver.findElement(By.linkText("Courses"));
//		Actions act = new Actions(driver);
//		act.moveToElement(tranCourse).build().perform();
//		Thread.sleep(5000);
//		
//		
//		act.moveToElement(tranCourse).build().perform();
//		WebElement data_analytic_course=  driver.findElement(By.linkText("Data Analytics & Visualization"));
//		act.moveToElement(data_analytic_course).click().build().perform();
//		Thread.sleep(5000);
//		String data_analy_url = driver.getCurrentUrl();
//		System.out.println(data_analy_url);
//		
//		
//		//driver.get("https://transfotechacademy.com/");
//		tranCourse = driver.findElement(By.xpath("//li[@id='menu-item-3850']"));
//		//tranCourse = driver.findElement(By.id("menu-item-3850"));
//		//tranCourse = driver.findElement(By.linkText("Courses"));
//		act.moveToElement(tranCourse).build().perform();
//		WebElement cyber=  driver.findElement(By.linkText("Cyber Security Professional"));
//		act.moveToElement(cyber).click().build().perform();
//		Thread.sleep(5000);
//		String cyber_url = driver.getCurrentUrl();
//		System.out.println(cyber_url);
//		
//		
//		
//		tranCourse = driver.findElement(By.xpath("//li[@id='menu-item-3850']"));
//		//tranCourse = driver.findElement(By.id("menu-item-3850"));
//		//tranCourse = driver.findElement(By.linkText("Courses"));
//		act.moveToElement(tranCourse).build().perform();
//		WebElement ba=  driver.findElement(By.linkText("Business Analyst"));
//		act.moveToElement(ba).click().build().perform();
//		Thread.sleep(5000);
//		String ba_url = driver.getCurrentUrl();
//		System.out.println(ba_url);
//		
//		
//		//driver.get("https://transfotechacademy.com/");
//		tranCourse = driver.findElement(By.xpath("//li[@id='menu-item-3850']"));
//		//tranCourse = driver.findElement(By.id("menu-item-3850"));
//		//tranCourse = driver.findElement(By.linkText("Courses"));
//		act.moveToElement(tranCourse).build().perform();
//		WebElement qa=  driver.findElement(By.linkText("Full Stack QA Engineering"));
//		act.moveToElement(qa).click().build().perform();
//		Thread.sleep(5000);
//		String qa_url = driver.getCurrentUrl();
//		System.out.println(qa_url);
//		driver.findElement(By.xpath("//a[text()='Home'][@href='https://transfotechacademy.com/']")).click();
//		driver.get("https://transfotechacademy.com/");
//		
//		//driver.get("https://transfotechacademy.com/");
//		tranCourse = driver.findElement(By.xpath("//li[@id='menu-item-3850']"));
//		//tranCourse = driver.findElement(By.id("menu-item-3850"));
//		//tranCourse = driver.findElement(By.linkText("Courses"));
//		act.moveToElement(tranCourse).build().perform();
//		WebElement ce=  driver.findElement(By.linkText("Cloud Engineering"));
//		act.moveToElement(ce).click().build().perform();
//		Thread.sleep(5000);
//		String ce_url = driver.getCurrentUrl();
//		System.out.println(ce_url);
		
		driver.get("https://transfotechacademy.com/");
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).click().build().perform();
		Thread.sleep(1000);
		WebElement fqa_underCourse = driver.findElement(By.xpath("//h4/a[text()='Full Stack QA Engineering'][@tabindex='0']"));
		Assert.assertTrue(fqa_underCourse.isEnabled());
		Thread.sleep(5000);
		fqa_underCourse.click();
		//act.moveToElement(fqa_underCourse).build().perform();
		Thread.sleep(5000);
					
		System.out.println("web element is working");
		
		
		//Syntax of Relative X Path 
		//1. 		//tagName[@attribute='value']   or   //*[@attribute='value']
		
		// if only text in the field
		//2.       //tagName[text()='txtValue']    or    //*[text()='txtValue']
		
		// if long text
		//3.      //tagName[contains(@attribute,'short content of text')] 
		
		// multiple attributes
		//4.      //tagName[@attribute1='value1'][@attribute2='value2'][@attribute3='value3'][@attribute4='value4']
		
		// using parent/grandparent tag for child element identification
		//5. 	 //grandParentTag/parentTag/childTag[@attribute='value']
		
		//using child tag with parent Xpath to identify child element
		//6.  	//parentXpath/childTag1/childTag2
		
		//traversing to parent element from child Xpath.
		//7.    //childXpath/parent::parentTag1/parentTag2
		
		//Identifying one sibling using another sibling's Xpath
				//  sibling2 follows sibling1
		//8.    //sibling1Xpath/following-sibling::sibling2Tag 
				// sibling1 follows sibling2
				//sibling1Xpath/preceding-sibling::sibling2Tag
		
		
		Thread.sleep(10000);

		
		driver.close();


	}

}