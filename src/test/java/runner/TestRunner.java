package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Lap\\eclipse-workspace\\Amazon_Cucumber\\Features\\Products_Cart.feature", glue= {"stepDefinition"},
plugin= {"html:target/cucumber-html-report", "json:target/cucumber.json"},
monochrome=true, dryRun=false)


public class TestRunner {

}

