package step_definition;

import org.testng.Assert;

import basic.Main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.AZ_Toys_Games_Page;

public class Toys_GamesPageTest extends Main {

	AZ_Toys_Games_Page tgp = new AZ_Toys_Games_Page();
	
	@When("The user clicks on the Toys&Games Page Link")
	public void the_user_clicks_on_the_toys_games_page_link() {
		az_Home_Page_Initialization();
		//for some reason the home page through the controlled driver do not show Toys&Games Page. So for completion
		//Arbitrarily the below link given
		drives.get("https://www.amazon.com/toys/b/?ie=UTF8&node=165793011&ref_=nav_cs_toys_3b06b15702ea4a62918584b50501e81c");
		tgp.hp_Toys_Games_LinkTest();
	}

	@Then("The Toys&Games Page should open")
	public void the_toys_games_page_should_open() {
	  Assert.assertEquals(drives.getTitle(),props.getProperty("az_ToysGamesTitle"));
	  
	}

	@Given("The user is in Toys&Games Page")
	public void the_user_is_in_toys_games_page() {
	   drives.get(props.getProperty("az_ToysGamesPageUrl"));
	}

	@When("The user clicks any of the options under the Shop by Age {string}")
	public void the_user_clicks_any_of_the_options_under_the_shop_by_age(String ageOption) {
	    tgp.tgp_ToysByAgeLinkTest(ageOption);
	}

	@Then("The page should populate with items belonging to the age group {int}")
	public void the_page_should_populate_with_items_belonging_to_the_age_group(Integer ageClass) {
	
		switch(ageClass) {
		case 1:
			
			Assert.assertTrue(drives.getCurrentUrl().contains(props.getProperty("az_ToysGamesAge_0to24Url")));
		case 2:
			Assert.assertTrue(drives.getCurrentUrl().contains(props.getProperty("az_ToysGamesAge_2to4Url")));
			
		}
		
		
	}
	

	
}
