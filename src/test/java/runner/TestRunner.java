package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "stepDefinations",
		plugin = {"pretty", "html:target/cucumberReport.html"},
		tags = "@invalidlogin"
		)
public class TestRunner {

}
