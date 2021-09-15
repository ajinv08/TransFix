package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)		
@CucumberOptions(features="C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\TransFix-Aji\\src\\main\\java\\features",		
		glue="step_definition",
		monochrome=true,
		tags = "@Smoke or @Regression or @EndToEnd", // scenario with any of these tags
		plugin = {"pretty","html:target/HTML/reportHTML.html","json:target/JSON/reportJSON.json"}
		)
public class Runner {		
		}



