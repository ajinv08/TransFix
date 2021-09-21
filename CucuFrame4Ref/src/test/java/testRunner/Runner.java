package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (features = "C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\CucuFrame4Ref\\src\\main\\java\\pageWiseFeatures",
				  glue ="stepDefintions",
				  plugin= {"pretty","html:target/HTMLReports/Report.HTML","json:target/JSONReports/Report.json"},
				  monochrome=true,
				  tags="@RegressionTest"
			
		)



public class Runner {

	
	
}

