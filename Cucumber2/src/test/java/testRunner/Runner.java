package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions  (features = "C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\Cucumber2\\src\\main\\java\\features",
					glue = "step_definition",
					plugin = {"pretty", "html:target/HTML/reportHTML.html", "json:target/JSON/reportJSON"},
					monochrome = true,
					tags = "@RegressionTest"
				//	tags ="@RegressionTest and @ SmokeTest"
				//	tags ="@RegressionTest or @ SmokeTest",
				//	tags ="@RegressionTest and not @ SmokeTest"
					)

public class Runner {

	
}
// tags 