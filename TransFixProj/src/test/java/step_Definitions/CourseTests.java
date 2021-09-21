package step_Definitions;

import org.junit.Assert;

import base.Mains;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Course;

public class CourseTests extends Mains{ 
	
	Course cp = new Course();

	@Given("The user in home page")
	public void the_user_in_home_page() {
		HomePage_Initialization();
	}

	@Then("The user should be able to view the  Courses link as enabled")
	public void the_user_should_be_able_to_view_the_courses_link_as_enabled() {
		  Assert.assertTrue(cp.courselink.isDisplayed());
	}
	
	@When("The user hover mouse  on Courses Link")
	public void the_user_hover_mouse_on_courses_link() {
	   cp.mouse_hover_course_link();
	}

	@Then("The user should be able to view list of courses through drop down menu")
	public void the_user_should_be_able_to_view_list_of_courses_through_drop_down_menu() {
	    
	}

	@When("The user clicks on Courses Link")
	public void the_user_clicks_on_courses_link() {
		cp.course_link_click();
	}

	@And("The user selects any of the Courses listed  from the drop down menu {string}")
	public void the_user_selects_any_of_the_courses_listed_from_the_drop_down_menu(String string) {
	    cp.course_selection(string);
	}
	
	@Then("The corresponding course page should be displayed {string}")
	public void the_corresponding_course_page_should_be_displayed(String pageurl) {
	    Assert.assertEquals(pageurl, cp.url_page_display());
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
}
