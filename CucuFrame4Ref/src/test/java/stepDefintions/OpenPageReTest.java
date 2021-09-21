package stepDefintions;

import org.junit.Assert;

import basePkg.Main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.OpeningPage;

public class OpenPageReTest extends Main {
	
	OpeningPage op = new OpeningPage();
	
	@Given("^Registered user is in home page$")
    public void registered_user_is_in_home_page() {
	 Assert.assertEquals(drives.getCurrentUrl(), props.getProperty("qaOpenUrl"));
    }

    @When("^Registered user inputs the valid username$")
    public void registered_user_inputs_the_valid_username() {
    op.hp_username_textEntry();	
    }

    @Then("^Registered user should be able to SignOn successfully$")
    public void registered_user_should_be_able_to_signon_successfully()  {
    	Assert.assertEquals(drives.getCurrentUrl(), props.getProperty("qaSignOnSuccessPageUrl"));   
    }

    @And("^Registered user inputs the valid password$")
    public void registered_user_inputs_the_valid_password()  {
     op.hp_password_textEntry();   
    }

    @And("^Registered user clicks on SubmitButton in the HomePage$")
    public void registered_user_clicks_on_submitbutton_in_the_homepage() {
      op.hp_submit_click();  
    }


}
