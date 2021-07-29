package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(features ="D:\\learning\\BDDframework\\src\\main\\java\\features\\", glue="stepdef",  dryRun =true
		)


public class TestRunner {

}
