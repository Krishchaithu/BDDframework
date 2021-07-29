package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(features="E://Learning//java//BddFramework//src//main//java//Features//login.feature", glue= {"StepDefination"}, plugin= {"pretty","html:test-output"},monochrome=true,
dryRun=true
		)

public class RunTest {

}
