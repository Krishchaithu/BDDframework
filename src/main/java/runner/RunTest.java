package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="E://Learning//java//BddFramework//src//main//java//Features//login.feature", glue= {"StepDefination"}, plugin= {"pretty","html:test-output"},monochrome=true,
dryRun=true
		)

public class RunTest {
	
	
	

}
