package step_definition;

import org.testng.Assert;

import basic.Main;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.AZ_Pharmacy_Page;

public class PharmacyPageTest extends Main {
	
	AZ_Pharmacy_Page ph = new AZ_Pharmacy_Page() ;
	
	@When("The user clicks on the Pharmacy Link")
	public void the_user_clicks_on_the_pharmacy_link() {
		az_Home_Page_Initialization();
		ph.hp_PharmacyLinkClick();
	    
	}

	@Then("The Pharmacy Page should open")
	public void the_pharmacy_page_should_open() {
		
		Assert.assertEquals(drives.getTitle(), props.getProperty("az_PharmacyTitle"));
	 
	}
	

}
