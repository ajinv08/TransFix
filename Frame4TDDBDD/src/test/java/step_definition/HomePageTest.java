package step_definition;

import org.testng.Assert;

import base.Main;
import io.cucumber.java.en.*;
import pageFactory.HomePage;

public class HomePageTest extends Main {
	
HomePage hp ;

	
	@Given("I am in home page")
	public void i_am_in_home_page() {
		hp_initialization();
	   Assert.assertEquals(drives.getCurrentUrl(), props.getProperty("hpUrl"));
	   hp = new HomePage();
	   Assert.assertTrue(hp.signonlinkEnabled());
	}

	@When("I click on the Sign-On Link")
	public void i_click_on_the_sign_on_link() {
	    hp.signonlinkClick();
	}

	@Then("I should land in Sign-On Page")
	public void i_should_land_in_sign_on_page() {
		 Assert.assertEquals(drives.getCurrentUrl(), props.getProperty("signonPageUrl"));
	}

	@When("I enter valid username <username>, valid password <password> as credentials")
	public void i_enter_valid_username_username_valid_password_password_as_credentials() {
		hp.usernameTextEntry(hp.usernameInput);
		hp.passwordTextEntry(hp.passwordInput);
	}

	@And("I click submit button")
	public void i_click_submit_button() {
	   hp.submitClick();
	}

	@Then("I should be able to login successfully")
	public void i_should_be_able_to_login_successfully() {
		 Assert.assertEquals(drives.getCurrentUrl(), props.getProperty("loginSuccessPageUrl"));
	}

	@When("I enter invalid username <username> or invalid password <password> as credentials")
	public void i_enter_invalid_username_username_or_invalid_password_password_as_credentials() {
		hp.usernameTextEntry(hp.usernameInput);
		hp.passwordTextEntry(hp.passwordInput);
	}

	@Then("I should not be able to login")
	public void i_should_not_be_able_to_login() {
		Assert.assertNotEquals(drives.getCurrentUrl(), props.getProperty("loginSuccessPageUrl"));
	}


}
