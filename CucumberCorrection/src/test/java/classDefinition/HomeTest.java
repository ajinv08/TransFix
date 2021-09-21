package classDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.Main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeTest extends Main {

	@Given("I am in home page")
	public void i_am_in_home_page() {
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




