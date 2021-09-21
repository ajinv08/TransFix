package step_Definitions;

import base.Mains;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends Mains{

	@Before
	public void beforeScenario() {
		
	}
	
	
	@After
	public void afterScenario() {
		browserClose();
	}
}
