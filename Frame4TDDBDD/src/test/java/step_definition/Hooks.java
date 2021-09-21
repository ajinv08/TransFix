package step_definition;

import org.junit.After;
import org.junit.Before;

import base.Main;

public class Hooks extends Main {
	
	@Before
	public void beforeScenario() {

		 hp_initialization();

	}


	@After
	public void afterScenario() {
		closeBrowser();

	}


}
