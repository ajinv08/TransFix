package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizationXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  // - maximize window
		driver.get("https:/amazon.com");
		
		driver.findElement(By.xpath("//input[@type='text'][@id='twotabsearchtextbox']")).sendKeys("XPath 1st Success");
		
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
