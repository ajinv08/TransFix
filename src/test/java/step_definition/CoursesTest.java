package step_definition;

import org.junit.Assert;

import base.Main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Courses;

public class CoursesTest extends Main {

	Courses cp = new Courses();
	String pageurl;

	@Given("The user in home page")
	public void the_user_in_home_page() {
		Assert.assertEquals(props.getProperty("UATurl"), cp.url_page_display());
	}

	@Then("The user should be able to view the  Courses link as enabled")
	public void the_user_should_be_able_to_view_the_courses_link_as_enabled() {
		  //cp.course_link_enabled_Test();
		  Assert.assertTrue(cp.courselink.isEnabled());

	}

	@When("The user hover mouse  on Courses Link")
	public void the_user_hover_mouse_on_courses_link() {
	   cp.mouse_hover_course_link();
	}

	@Then("The user should be able to view list of courses through drop down menu")
	public void the_user_should_be_able_to_view_list_of_courses_through_drop_down_menu() {
		Assert.assertTrue(cp.business_analyst_course.isDisplayed());
		Assert.assertTrue(cp.data_analytic_course.isDisplayed());
		Assert.assertTrue(cp.cyber_security_course.isDisplayed());
		Assert.assertTrue(cp.qa_engineer_course.isDisplayed());
		Assert.assertTrue(cp.cloud_engineer_course.isDisplayed());


	}

	@When("The user clicks on Courses Link")
	public void the_user_clicks_on_courses_link(){
		cp.course_link_click();
	}

	@And("The user selects any of the Courses listed  from the drop down menu {string}")
	public void the_user_selects_any_of_the_courses_listed_from_the_drop_down_menu(String string){
	    cp.course_selection(string);
	}

	@Then("The corresponding course page should be displayed {string}")
	public void the_corresponding_course_page_should_be_displayed(String pageurl) {
	    //System.out.println(cp.url_page_display());
		Assert.assertEquals(pageurl, cp.url_page_display());

	}

	}