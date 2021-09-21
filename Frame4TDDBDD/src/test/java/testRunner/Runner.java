package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\Frame4TDDBDD\\src\\main\\java\\features",
				 glue ="step_definition",
				 plugin = {"pretty", "html:target/HTML/reportHTML.html", "json:target/JSON/reportJSON"},
				 monochrome = true,
				 tags="@RegressionTest"
				 
		
		)


public class Runner {


	
}
