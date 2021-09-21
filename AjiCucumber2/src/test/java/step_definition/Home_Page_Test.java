package step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Home_Page_Test {

	WebDriver drives  = new ChromeDriver();
	
	@Given("I am in home page")
	public void i_am_in_home_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
		drives.get("http://demo.guru99.com/test/newtours/index.php");
		drives.manage().window().fullscreen();
		drives.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Assert.assertEquals(drives.getCurrentUrl(), "http://demo.guru99.com/test/newtours/index.php");
	}

	@When("I click on the Sign-On Link")
	public void i_click_on_the_sign_on_link() {
			
		WebElement SignOnLink = drives.findElement(By.xpath("//table[@border='1']/tbody/tr/td[1]"));
		SignOnLink.click();
	}

	@Then("I should land in Sign-On Page")
	public void i_should_land_in_sign_on_page() {
		 Assert.assertEquals(drives.getCurrentUrl(), "http://demo.guru99.com/test/newtours/login.php");
	}
	
	
	
}
