package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class) 
@CucumberOptions(features ="D:\\learning\\BDDframework\\src\\main\\java\\features\\", glue="stepdef",  dryRun =true
		)


public class TestRunner {

}
