package step_definition;

import org.junit.Assert;

import base.Main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.View_all_courses_from_HomePage;



public class View_all_courses_from_HomePage_Test extends Main {
	
	View_all_courses_from_HomePage vc = new View_all_courses_from_HomePage ();
	
	@Then("The user should be able to view Icons of few selected courses, displayed under the section header - Courses We Offer")
	public void the_user_should_be_able_to_view_icons_of_few_selected_courses_displayed_under_the_section_header_courses_we_offer() {
		
		Assert.assertTrue(vc.hpFullStackQaEngineering_display());
		Assert.assertTrue(vc.hpDataAnalytics_Visualization_display());
		Assert.assertTrue(vc.hpBusinessAnalyst_display());
		Assert.assertTrue(vc.hpCyberSecurityProfessional_display());
	}

	@Then("The user should be able to view Explore all Courses link as enabled")
	public void the_user_should_be_able_to_view_explore_all_courses_link_as_enabled() {
	   Assert.assertTrue(vc.hpExploreAllCoursesLink_enabled());
	}

	@And("The user clicks on any course icon {string}")
	public void the_user_clicks_on_any_course_icon(String string) {
		vc.hpCourseSelection(string);
	}

	@When("The user clicks on any course icon {string} under Courses we offer")
	public void the_user_clicks_on_any_course_icon_under_courses_we_offer(String string) {
		vc.hpCourseSelection_inall_course(string) ;
	}
	
	@And("The user clicks on Explore all Courses Link")
	public void the_user_clicks_on_explore_all_courses_link() {
		vc.hpExploreAllCoursesLink_Click();
	}

	@Then("All the  individual Courses icons Data Analytics & Visualization,Cyber Security Professional, Cloud Engineering, Business Analyst, Full Stack QA Engineering Course should be displayed in home page")
	public void all_the_individual_courses_icons_data_analytics_visualization_cyber_security_professional_cloud_engineering_business_analyst_full_stack_qa_engineering_course_should_be_displayed_in_home_page() {
		Assert.assertTrue(vc.hpFullStackQaEngineering_inall_course_display());
		Assert.assertTrue(vc.hpDataAnalytics_Visualization_inall_course_display());
		Assert.assertTrue(vc.hpBusinessAnalyst_inall_course_display());
		Assert.assertTrue(vc.hpCyberSecurityProfessional_inall_course_display());
		Assert.assertTrue(vc.hpCloudEngineering_inall_course_display());
	}
	
	@When("The user presses page down five times")
	public void the_user_presses_page_down_five_times() {
		vc.pagedownfivetimes();
	}
	
	

}
