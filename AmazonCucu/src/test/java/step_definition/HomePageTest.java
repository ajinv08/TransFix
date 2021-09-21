package step_definition;



import org.testng.Assert;

import basic.Main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.AZ_Home_Page;

public class HomePageTest extends Main {
	
AZ_Home_Page hp = new AZ_Home_Page();
//String deptIndex;	
		
	
	@Given("The user is in Home Page")
	public void the_user_is_in_home_page() {
		drives.get("https://www.amazon.com/");
	}

	@When("The user types text into the search text area")
	public void the_user_types_text_into_the_search_text_area() {
	    hp.searchTextEntry();	
	}

	@And("The user clicks on the search button")
	public void the_user_clicks_on_the_search_button() {
	    hp.searchButtonClick();
	}

	@Then("The page should populate the search result")
	public void the_page_should_populate_the_search_result() {
		Assert.assertEquals(hp.searchResult(),hp.searchText);
				
	}

	@When("The user clicks on the Customer Service Link")
	public void the_user_clicks_on_the_customer_service_link() {
	   hp.customerServiceLinkClick();
	    
	}

	@Then("The Customer Service Page should open")
	public void the_customer_service_page_should_open() {
		Assert.assertEquals(drives.getCurrentUrl(),props.getProperty("az_CustomerServicePage"));
		
	}

	
	@When("^The user clicks on the All button in the search tab$")
    public void the_user_clicks_on_the_all_button_in_the_search_tab() {
        hp.deptDropDownSelect();
    }
   
	@And("The user selects the chosen department from the scroll down list {string}")
    public void the_user_selects_the_chosen_department_from_the_scroll_down_list(String deptIndex) {
    	hp.deptDropDownIndexInput(deptIndex); 
    }

    @And("^The user hits the enter button$")
    public void the_user_hits_the_enter_button()  {
       hp.enterButtonforSearch();
    }

    @Then("The page should populate with items under the selected department {string}")
    public void the_page_should_populate_with_items_under_the_selected_department(String deptNameLabel) {
        //Assert.assertEquals(hp.deptNameDisplay() , deptNameLabel);
    	Assert.assertTrue(hp.deptNameDisplay().contains(deptNameLabel));
    	
    }
}
	
	

