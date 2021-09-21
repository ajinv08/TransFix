package step_definition;

import base.Main;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Main {

	@Before
	public void beforeScenario() {
		hp_initialization();
		
	}
	
	@After
	public void afterScenario() {
		teardown();
	}
}
