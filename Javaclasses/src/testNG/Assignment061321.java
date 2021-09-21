package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Assignment061321 {
	WebDriver drives;
	Actions action ;
	
	
	public void inlClick() {
		WebElement deliverLocation = drives.findElement(By.id("glow-ingress-block"));
		action = new Actions(drives);
		action.click(deliverLocation).build().perform();
	}
	
		
		
	
	
	@BeforeMethod
	public void initialization() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
		drives = new ChromeDriver();
		drives.get("https://www.amazon.com/");
		drives.manage().window().maximize();
		drives.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		
	}
	
	
	
	@AfterMethod
	public void curtain() {
		drives.close();
	}
	
	
	
	@Test
	public void amazonLogoTest() {
		WebElement homePageLogo = drives.findElement(By.id("nav-logo-sprites"));
		Assert.assertTrue(homePageLogo.isDisplayed(), "Home Page Logo is Displayed");
		
	}
	
	@Test
	public void deliverToLocationTest() {
		WebElement deliverLocation = drives.findElement(By.id("glow-ingress-block"));
		Actions action = new Actions(drives);
		action.click(deliverLocation).build().perform();
		//action.moveToElement(deliverLocation).clickAndHold().build().perform();
		WebElement chooseLocation = drives.findElement(By.xpath("//div[@class='a-popover-wrapper']"));
		Assert.assertTrue(chooseLocation.isDisplayed());
	}
	
	//@Test
	public void deliverLocationInputTest() {
		

		inlClick();
		WebElement chooseLocationHeader = drives.findElement(By.xpath("//div[@class='a-popover-wrapper']/header/h4"));
		String chooseLocationHeaderText = chooseLocationHeader.getText();
		Assert.assertEquals(chooseLocationHeaderText,"Choose your location");
	}
	
	// Sign in to see your addresses - this web element is not located. and this test is abandoned
	
	@Test
	public void signInToSeeAddress() {
		
		inlClick();
		//WebElement signtoSeeAddress = drives.findElement(By.xpath("//span[@id='GLUXSignInButton']"));
		//WebElement signtoSeeAddress = drives.findElement(By.xpath("//*[@id='GLUXSignInButton']//span//span"));
		//WebElement signtoSeeAddress = drives.findElement(By.xpath("//input[@aria-label='Sign in to see your addresses']"));
		
		//action.clickAndHold(signtoSeeAddress).build().perform();
		//drives.findElement(By.xpath("//span[@data-action='GLUXSignInAction']")).click();
		//drives.findElement(By.xpath("//*[@id='GLUXSignInButton']/span")).click();
		drives.findElement(By.xpath("//div[@id='GLUXAddressBlock']/span")).click();
	
		WebElement signInTest = drives.findElement(By.xpath("//div[@class='a-box']/div/h1"));
		Assert.assertTrue(signInTest.isEnabled());
		
		}
	
	// Below test could not complete as the QA Environement and real do not match and some elements are not behaving as expected
	//@Test
	 public void zipCodeConfirmation() throws InterruptedException {
		 inlClick();
		 drives.findElement(By.xpath("//*[@id='GLUXZipConfirmationSection']/div/a")).click();
		
		 drives.findElement(By.xpath("//div/a[@id='GLUXChangePostalCodeLink']")).click();	
		
		Thread.sleep(5000);
		 
	 }
		
		//Search and select the department from the search option.
	 
	 	//Below test searchDepartment() failed, even though the expected Text is shown in screen, 
	 	//the web element shows all element...
		
		@Test
		public void searchDepartment() {
			
			WebElement deptSearch = drives.findElement(By.xpath("//select[@id='searchDropdownBox']"));
			Select select = new Select(deptSearch);
			select.selectByIndex(4);
			//deptSearch.click();
			//drives.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
			//WebElement deptSearch = drives.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']"));
			//deptSearch2nd.click();
			System.out.println(deptSearch.getText());
						
			Assert.assertEquals(deptSearch.getText(), "Amazon Fresh");
			
		}
		
		
		//Below test searchInput() failed, even though the expected Text is shown in screen, 
	 	//the web element shows the default content...
		//@Test
		public void searchInput() {
			WebElement searchText = drives.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			searchText.sendKeys("Test input in testNG");
			System.out.println(searchText.getText());
			Assert.assertEquals(searchText.getText(),"Test input in testNG" );
		
		
		}
		
	 
	   // @Test
	    public void accountAndLists() {
	    	//WebElement accountList = drives.findElement(By.xpath("//span[text()='Account & Lists']"));
	    	
	    	String accountListText=drives.findElement(By.xpath("//span[text()='Account & Lists']")).getText();
	    	Assert.assertEquals(accountListText,"Account & Lists");
	    	
	    }
	
	
	
	
}

