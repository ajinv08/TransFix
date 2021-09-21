package step_definition;



import basic.Main;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends Main {
	
	
	@Before
	public void beforeScenario() {
		
		az_Home_Page_Initialization();
	}
	
	
	@After
	public void afterScenario() {
		
		tearDown();
	}
	
	public Hooks() {
		
	}
}
