package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class) 
@CucumberOptions(features ="D://study//Java//NJWorkspace//BddFramework//src//main//java//features//login.feature", glue="stepdef",  dryRun =false
		)


public class TestRunner {

}