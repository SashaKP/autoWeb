package runnersAT;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/featuresAT"
		,glue = "stepsAT"
		,dryRun = true
		,plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"}
        ,monochrome=true
        , tags= "@Verify"
		
		
		
		
		
		)

public class CukeRunner {



}
