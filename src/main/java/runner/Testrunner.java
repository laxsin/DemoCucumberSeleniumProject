package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "D:/AT_workspace/DemoProject/src/main/java/FeatureFiles",
		glue = {"StepDefinitions"},
		plugin= {"html:target/cucumber-html-report"}
		
		)
public class Testrunner {

}
